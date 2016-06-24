package ee.eki;

import org.antlr.v4.runtime.TokenStream;
import java.io.PrintWriter;

/**
 * Created by kristian on 2.06.16.
 */
public class KnabXmlGenerator extends KnabParserBaseListener {
    PrintWriter output;

    /**
     * Constructor takes a PrintWriter where it prints the output.
     * @param output
     */
    public KnabXmlGenerator(PrintWriter output) {
        super();
        this.output = output;
    }

    /**
     * Returns the input string without the first and last character.
     * @param text
     * @return
     */
    private String stripEnds(String text) {
        return text.substring(1, text.length()-1);
    }

    /**
     * Returns the input text enclosed with XML tag of tagname.
     * @param tagname
     * @param text
     * @return
     */
    private String encloseWithTags(String tagname, String text) {
        return "<"+tagname+">"+text+"</"+tagname+">";
    }

    // the following rules are logically arranged according to XML elements, going from "bigger" to smaller

    @Override
    public void enterKihelkond(KnabParser.KihelkondContext ctx) {
        super.enterKihelkond(ctx);
        output.println("<kihelkond>");
    }

    @Override
    public void exitKihelkond(KnabParser.KihelkondContext ctx) {
        super.exitKihelkond(ctx);
        output.println("</kihelkond>");
    }

    @Override
    public void enterUldandmed(KnabParser.UldandmedContext ctx) {
        super.enterUldandmed(ctx);
        output.print("<üldandmed>");
    }

    @Override
    public void exitUldandmed(KnabParser.UldandmedContext ctx) {
        super.exitUldandmed(ctx);
        //output.println(encloseWithTags("rida", ctx.text(0).getText()));
        //output.println(encloseWithTags("rida", ctx.text(1).getText()));
        output.println("</üldandmed>");
        output.println();
    }

    @Override
    public void enterKirje(KnabParser.KirjeContext ctx) {
        super.enterKirje(ctx);
        output.println("<kirje>");
    }

    @Override
    public void exitKirje(KnabParser.KirjeContext ctx) {
        super.exitKirje(ctx);
        output.println("</kirje>");
        output.println();
    }

    @Override
    public void enterPohirida(KnabParser.PohiridaContext ctx) {
        super.enterPohirida(ctx);
        output.append("<põhirida>");
    }

    @Override
    public void exitPohirida(KnabParser.PohiridaContext ctx) {
        super.exitPohirida(ctx);
        output.println("</põhirida>");
    }

    @Override
    public void enterLisarida(KnabParser.LisaridaContext ctx) {
        super.enterLisarida(ctx);
        output.append("<lisarida>");
    }

    @Override
    public void exitLisarida(KnabParser.LisaridaContext ctx) {
        super.exitLisarida(ctx);
        output.println("</lisarida>");
    }

    @Override
    public void enterViiterida(KnabParser.ViiteridaContext ctx) {
        super.enterViiterida(ctx);
        output.append("<viiterida>");
    }

    @Override
    public void exitViiterida(KnabParser.ViiteridaContext ctx) {
        super.exitViiterida(ctx);
        output.println("</viiterida>");
    }

    @Override
    public void enterAmetlikRoopnimi(KnabParser.AmetlikRoopnimiContext ctx) {
        super.enterAmetlikRoopnimi(ctx);
        output.append("<ametlikrööpnimirida>");
    }

    @Override
    public void exitAmetlikRoopnimi(KnabParser.AmetlikRoopnimiContext ctx) {
        super.exitAmetlikRoopnimi(ctx);
        output.println("</ametlikrööpnimirida>");
    }

    @Override
    public void enterLaiend(KnabParser.LaiendContext ctx) {
        super.enterLaiend(ctx);
        output.append("<laiendirida>");
    }

    @Override
    public void exitLaiend(KnabParser.LaiendContext ctx) {
        super.exitLaiend(ctx);
        output.println("</laiendirida>");
    }

    @Override
    public void enterRoopnimed(KnabParser.RoopnimedContext ctx) {
        super.enterRoopnimed(ctx);
        output.append("<rööpnimerida>");
    }

    @Override
    public void exitRoopnimed(KnabParser.RoopnimedContext ctx) {
        super.exitRoopnimed(ctx);
        output.println("</rööpnimerida>");
    }

    @Override
    public void enterIseloomustus(KnabParser.IseloomustusContext ctx) {
        super.enterIseloomustus(ctx);
        output.append("<iseloomustusrida>");
    }

    @Override
    public void exitIseloomustus(KnabParser.IseloomustusContext ctx) {
        super.exitIseloomustus(ctx);
        output.println("</iseloomustusrida>");
    }

    @Override
    public void enterMorfoloogia(KnabParser.MorfoloogiaContext ctx) {
        super.enterMorfoloogia(ctx);
        output.append("<morfoloogiarida>");
    }

    @Override
    public void exitMorfoloogia(KnabParser.MorfoloogiaContext ctx) {
        super.exitMorfoloogia(ctx);
        output.println("</morfoloogiarida>");
    }

    @Override
    public void enterEtymoloogia(KnabParser.EtymoloogiaContext ctx) {
        super.enterEtymoloogia(ctx);
        output.append("<etümoloogiarida>");
    }

    @Override
    public void exitEtymoloogia(KnabParser.EtymoloogiaContext ctx) {
        super.exitEtymoloogia(ctx);
        output.println("</etümoloogiarida>");
    }

    @Override
    public void enterGeotunnused(KnabParser.GeotunnusedContext ctx) {
        super.enterGeotunnused(ctx);
        output.append("<geotunnusterida>");
    }

    @Override
    public void exitGeotunnused(KnabParser.GeotunnusedContext ctx) {
        super.exitGeotunnused(ctx);
        output.println("</geotunnusterida>");
    }

    @Override
    public void enterAlaobjektid(KnabParser.AlaobjektidContext ctx) {
        super.enterAlaobjektid(ctx);
        output.append("<alaobjektiderida>");
    }

    @Override
    public void exitAlaobjektid(KnabParser.AlaobjektidContext ctx) {
        super.exitAlaobjektid(ctx);
        output.println("</alaobjektiderida>");
    }

    @Override
    public void enterYlaobjektid(KnabParser.YlaobjektidContext ctx) {
        super.enterYlaobjektid(ctx);
        output.append("<ülaobjektiderida>");
    }

    @Override
    public void exitYlaobjektid(KnabParser.YlaobjektidContext ctx) {
        super.exitYlaobjektid(ctx);
        output.println("</ülaobjektiderida>");
    }

    @Override
    public void enterLisaviited(KnabParser.LisaviitedContext ctx) {
        super.enterLisaviited(ctx);
        output.append("<lisaviiterida>");
    }

    @Override
    public void exitLisaviited(KnabParser.LisaviitedContext ctx) {
        super.exitLisaviited(ctx);
        output.println("</lisaviiterida>");
    }

    @Override
    public void enterAjalugu(KnabParser.AjaluguContext ctx) {
        super.enterAjalugu(ctx);
        output.append("<ajaloorida>");
    }

    @Override
    public void exitAjalugu(KnabParser.AjaluguContext ctx) {
        super.exitAjalugu(ctx);
        output.println("</ajaloorida>");
    }

    @Override
    public void enterKoostaja(KnabParser.KoostajaContext ctx) {
        super.enterKoostaja(ctx);
        output.append("<koostajarida>");
    }

    @Override
    public void exitKoostaja(KnabParser.KoostajaContext ctx) {
        super.exitKoostaja(ctx);
        output.println("</koostajarida>");
    }

    @Override
    public void enterLisainfo(KnabParser.LisainfoContext ctx) {
        super.enterLisainfo(ctx);
        output.println("<lisainfo>");
    }

    @Override
    public void exitLisainfo(KnabParser.LisainfoContext ctx) {
        super.exitLisainfo(ctx);
        output.println();
        output.println("</lisainfo>");
    }

    @Override
    public void exitAllikaviide(KnabParser.AllikaviideContext ctx) {
        super.exitAllikaviide(ctx);
        output.append(encloseWithTags("allikaviitemärgendid", stripEnds(ctx.getText())));
    }

    @Override
    public void exitInfomargend(KnabParser.InfomargendContext ctx) {
        super.exitInfomargend(ctx);
        output.append(encloseWithTags("infomärgendid", stripEnds(ctx.getText())));
    }

    @Override
    public void exitKommentaar(KnabParser.KommentaarContext ctx) {
        super.exitKommentaar(ctx);
        output.append(encloseWithTags("kommentaarimärgendid", stripEnds(ctx.getText())));
    }

    @Override
    public void exitSisu(KnabParser.SisuContext ctx) {
        super.exitSisu(ctx);
        output.append(ctx.getText());
    }

    @Override
    public void exitNl(KnabParser.NlContext ctx) {
        super.exitNl(ctx);
        output.println();
    }
}
