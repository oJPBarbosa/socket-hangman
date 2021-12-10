package com.company;

public class BancoDePalavras extends Comunicado
{
    private static String[] palavras = 
    {
            "ADOLESCÊNCIA",
            "AMARELO",
            "ANDORINHA",
            "ANTIBIÓTICO",
            "ANTICONSTITUCIONALÍSTICO",
            "ANTIGUIDADES",
            "APARÊNCIA",
            "AQUOSO",
            "ARGENTINA",
            "ASPIRADOR",
            "BINÓCULO",
            "BIOLOGIA",
            "BITCOIN",
            "BOMBARDIER",
            "BOMBORDO",
            "CALCULADORA",
            "CALIGRAFIA",
            "CAPOEIRA",
            "CARAPAÇA",
            "CARBENICILINA",
            "CARDIOLOGIA",
            "CHICLETE",
            "CHOCOLATE",
            "CHUCRUTE",
            "CHUPETA",
            "CINEMATOGRÁFICO",
            "COMBUSTÍVEL",
            "COMUNINDADE",
            "CONJUNTIVITE",
            "CONSTITUCIONALIZAÇÃO",
            "COTUCA",
            "DANÇARINO",
            "DECONGEX",
            "DENTIÇÃO",
            "DESACORDADO",
            "DESCOLORANTE",
            "DESCONGESTIONADO",
            "DESENVOLVIMENTO",
            "EMPACOTADO",
            "ENVELOPE",
            "ESTIBORDO",
            "EXTRAORDINÁRIO",
            "FISIOLOGIA",
            "GEOGRAFIA",
            "HETEROIDENTIFICAÇÃO",
            "HETEROSSEXUAL",
            "HIPOPÓTAMO",
            "HIPOTETICAMENTE",
            "HISTÓRIA",
            "HOMEM-ARANHA",
            "HOMOSSEXUAL",
            "INCETICIDA",
            "INCOMPETENTE",
            "INSTAGRAM",
            "INTERCONFESSIONALISMO",
            "INTERDICIPLINAR",
            "INTESTINO",
            "INVALIDADE",
            "JABUTICABA",
            "MACAQUICE",
            "MALICIOSO",
            "MATEMÁTICA",
            "MICKEY",
            "MICROCEFALIA",
            "MICROPIGMENTAÇÃO",
            "MICROSOFT",
            "MILAGROSAMENTE",
            "MINNIE",
            "MULTIDICIPLINAR",
            "MULTIDIMENSIONAL",
            "NASA",
            "NEBULIZADOR",
            "OFTALMOLOGIA",
            "OTORRINOLARINGOLOGISTA",
            "OXIGÊNIO",
            "PEDIATRIA",
            "PEIXE-ESPADA",
            "PICARETA",
            "PNEUMONIA",
            "PNEUMOULTRAMICROSCÓPIOSSILICOVULCANOCONIÓTICO",
            "POLICHINELO",
            "PRIMORDIAL",
            "PROGRAMADOR",
            "PULSEIRA",
            "RADIOLOGISTA",
            "RONRONANDO",
            "SHAKESPEARE",
            "SIGNIFICAMENTE",
            "SUBSOLO",
            "SUCRILHOS",
            "TECLADO",
            "TERMOSFERA",
            "TRANSDICIPLINARIDADE",
            "TRAQUÉIA",
            "UNICAMP",
            "VATICANO",
            "VERDE-AZULADO",
            "VERMELHO",
            "VIDEIRA",
            "XADREZ",
    };

    public static Palavra getPalavraSorteada ()
    {
        Palavra palavra = null;

        try
        {
            palavra =
            new Palavra (BancoDePalavras.palavras[
            (int)(Math.random() * BancoDePalavras.palavras.length)]);
        }
        catch (Exception e)
        {}

        return palavra;
    }
}