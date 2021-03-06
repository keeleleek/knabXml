parser grammar KnabParser;
options { tokenVocab=KnabLexer; }
@parser::header { package ee.eki; }
@parser::members {
    /** Eemaldab tekstist esimese ja viimase tähemärgi. */
    String chop(String text) {
        return text.substring(1, text.length()-1);
    }
    /** Trükib teksti välja */
    void print(String text) {
        //System.out.print(text);
    }
}

kihelkond:  BOM? {print("<kihelkond>\n");}
            {print("<üldandmed>");} uldandmed {print("</üldandmed>\n");}
            kirjed
            lisainfo?
            EOF
            {print("</kihelkond>\n");};

uldandmed:  {print("<rida1>");} text {print("</rida1>\n");} nl
            {print("<rida2>");} text {print("</rida2>\n");} nl ;

kirjed:     kirje (KIRJESEP kirje)*? KIRJEEND;

kirje:      {print("<kirje>\n");} pohirida lisarida jargread? {print("</kirje>\n\n");};

pohirida:   {print("<põhirida>");} text {print("</põhirida>\n");};

lisarida:   LisaridaSep {print("<lisarida>");} text {print("</lisarida>\n");};

jargread:   (viiterida
            | ametlikRoopnimi
            | laiend
            | roopnimed
            | iseloomustus
            | morfoloogia
            | etymoloogia
            | geotunnused
            | alaobjektid
            | ylaobjektid
            | lisaviited
            | ajalugu
            | koostaja
            )+;

lisainfo:   nl? {print("<lisainfo>");}  (text? nl)+  {print("</lisainfo>\n");};

viiterida:       ViiteridaSep       {print("<viiterida>");}           text {print("</viiterida>\n");};
ametlikRoopnimi: AmetlikRoopnimiSep {print("<ametlikrööpnimirida>");} text {print("</ametlikrööpnimirida>\n");};
laiend:          LaiendSep          {print("<laiendirida>");}         text {print("</laiendirida>\n");};
roopnimed:       RoopnimedSep       {print("<rööpnimerida>");}        text {print("</rööpnimerida>\n");};
iseloomustus:    IseloomustusSep    {print("<iseloomustusrida>");}    text {print("</iseloomustusrida>\n");};
morfoloogia:     MorfoloogiaSep     {print("<morfoloogiarida>");}     text {print("</morfoloogiarida>\n");};
etymoloogia:     EtymoloogiaSep     {print("<etümoloogiarida>");}     text {print("</etümoloogiarida>\n");};
geotunnused:     GeotunnusedSep     {print("<geotunnusterida>");}     text {print("</geotunnusterida>\n");};
alaobjektid:     AlaobjektidSep     {print("<alaobjektiderida>");}    text {print("</alaobjektiderida>\n");};
ylaobjektid:     YlaobjektidSep     {print("<ülaobjektiderida>");}    text {print("</ülaobjektiderida>\n");};
lisaviited:      LisaviitedSep      {print("<lisaviiterida>");}       text {print("</lisaviiterida>\n");};
ajalugu:         AjaluguSep         {print("<ajaloorida>");}          text {print("</ajaloorida>\n");};
koostaja:        KoostajaSep        {print("<koostajarida>");}        text {print("</koostajarida>\n");};

text:        (infomargend|allikaviide|kommentaar|sisu)+;
infomargend: INFOMARGEND {print("<infomärgendid>"         + chop($INFOMARGEND.text) + "</infomärgendid>");};
allikaviide: ALLIKAVIIDE {print("<allikaviitemärgendid>"  + chop($ALLIKAVIIDE.text) + "</allikaviitemärgendid>");};
kommentaar:  KOMMENTAAR  {print("<kommentaarimärgendid>"  + chop($KOMMENTAAR.text)  + "</kommentaarimärgendid>");};
sisu: TEXT   {print($TEXT.text);};

nl: NL;
