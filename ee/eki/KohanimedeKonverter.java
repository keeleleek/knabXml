package ee.eki;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.*;

public class KohanimedeKonverter {

    public static void main(String[] args) {
        if (args.length != 1) {
            throw new Error("Allikfaili või allikfailide kataloogi asukoht puudub!");
        }

        // setup
        PrintWriter xmlFile;
        ANTLRInputStream input;
        KnabLexer lexer;
        CommonTokenStream tokens;
        KnabParser parser;
        ParseTree tree;
        Path sourcePath = Paths.get(args[0]); // algfailide asukoht, antakse käsurealt

        // kas anti kataloogi või üksikfaili asukoht?
        if (Files.isDirectory(sourcePath)) {
            // proovi avada allikfailide kataloog
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(sourcePath)) {
                // iga faili puhul ...
                for (Path file : stream) {
                    String filename = file.getFileName().toString();

                    // ainult failid mis lõppevad ".JXF"-iga on töödeldavad
                    if (!filename.endsWith("JXF")) {
                        System.out.println("Ignoreerib faili \""+filename+" (ei lõppe .JXF-iga)");
                        continue;
                    }

                    System.out.println("Transleerib faili: " + filename);
                    // kui failinimi lõpeb ".JXF"-iga, siis sõelume ANTLR-iga

                    // tekitame samanimelise faili, ent .xml lõpuga
                    xmlFile = new PrintWriter(new BufferedWriter(new FileWriter(filename.replace(".JXF", ".xml"))));

                    // create a CharStream that reads from standard input
                    input = new ANTLRFileStream(file.toString());
                    // create a lexer that feeds off of input CharStream
                    lexer = new KnabLexer(input);
                    // create a buffer of tokens pulled from the lexer
                    tokens = new CommonTokenStream(lexer);
                    // create a parser that feeds off the tokens buffer
                    parser = new KnabParser(tokens);
                    tree = parser.kihelkond(); // begin parsing at kihelkond rule

                    // use our custom walker
                    ParseTreeWalker walker = new ParseTreeWalker();
                    KnabXmlGenerator knabXmlGenerator = new KnabXmlGenerator(xmlFile);
                    // walk the walk
                    walker.walk(knabXmlGenerator, tree);

                    // close the output file
                    xmlFile.close();
                }
            } catch (IOException | DirectoryIteratorException x) {
                // IOException can never be thrown by the iteration.
                // In this snippet, it can only be thrown by newDirectoryStream.
                System.err.println(x);
            }
        }
        // kas on fail
        else if (Files.isRegularFile(sourcePath)) {
            try {
                String filename = sourcePath.getFileName().toString();

                // ainult failid mis lõppevad ".JXF"-iga on töödeldavad
                if (!filename.endsWith("JXF")) {
                    throw new IllegalArgumentException("Pole KNAB fail (ei lõppe .JXF-iga)!");
                }
                // kui failinimi lõpeb ".JXF"-iga, siis sõelume ANTLR-iga

                // tekitame samanimelise faili, ent .xml lõpuga
                xmlFile = new PrintWriter(new BufferedWriter(new FileWriter(filename.replace(".JXF", ".xml"))));

                // create a CharStream that reads from standard input
                input = new ANTLRFileStream(sourcePath.toString());
                // create a lexer that feeds off of input CharStream
                lexer = new KnabLexer(input);
                // create a buffer of tokens pulled from the lexer
                tokens = new CommonTokenStream(lexer);
                // create a parser that feeds off the tokens buffer
                parser = new KnabParser(tokens);
                tree = parser.kihelkond(); // begin parsing at kihelkond rule
                // use our custom walker
                ParseTreeWalker walker = new ParseTreeWalker();
                KnabXmlGenerator knabXmlGenerator = new KnabXmlGenerator(xmlFile);
                // walk the walk
                walker.walk(knabXmlGenerator, tree);

                // close the output file
                xmlFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // pole ei fail ega kataloog
        else {
            throw new IllegalArgumentException("Pole KNAB fail (ei lõppe .JXF-iga)!");
        }
    }
}
