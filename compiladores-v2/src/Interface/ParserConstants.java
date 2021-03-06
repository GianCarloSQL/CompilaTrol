package Interface;

public interface ParserConstants
{
    int START_SYMBOL = 43;

    int FIRST_NON_TERMINAL    = 43;
    int FIRST_SEMANTIC_ACTION = 71;

    int[][] PARSER_TABLE =
    {
        { -1,  0, -1, -1, -1, -1, -1, -1,  0, -1, -1,  0, -1, -1,  0, -1, -1, -1, -1, -1, -1, -1,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1,  1, -1, -1, -1, -1, -1, -1,  1, -1, -1,  1, -1, -1,  1, -1, -1, -1, -1, -1, -1, -1,  1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        {  3,  2, -1, -1, -1, -1, -1, -1,  2,  3,  3,  2, -1, -1,  2,  3, -1, -1, -1, -1, -1, -1,  2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1,  4, -1, -1, -1, -1, -1, -1,  6, -1, -1,  7, -1, -1,  7, -1, -1, -1, -1, -1, -1, -1,  5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  8,  9, 10 },
        { -1, 11, 11, 11, 11, -1, -1, 11, -1, -1, -1, -1, -1, -1, -1, -1, 11, 11, 12, 12, 12, 12, -1, 11, -1, -1, -1, -1, -1, -1, -1, 11, 11, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 13, 14, 14, 14, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 16, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 17, 18, 19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 21, 21, 21, 21, -1, -1, 21, -1, -1, -1, -1, -1, -1, -1, -1, 21, 21, -1, -1, -1, -1, -1, 21, -1, -1, -1, -1, -1, -1, -1, 21, 21, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 23, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 22, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, 24, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, 25, 26, -1, -1, -1, -1, 26, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 27, -1, -1, -1, -1, 28, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 30, -1, -1, 29, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 32, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 33, 33, 33, 33, -1, -1, 33, -1, -1, -1, -1, -1, -1, -1, -1, 33, 33, -1, -1, -1, -1, -1, 33, -1, -1, -1, -1, -1, -1, -1, 33, 33, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { 36, 36, -1, -1, -1, 34, 35, -1, 36, 36, 36, 36, -1, -1, 36, 36, -1, -1, -1, -1, -1, -1, 36, -1, 36, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, 36, -1, -1, -1 },
        { -1, 37, 37, 37, 37, -1, -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, 39, 38, -1, -1, -1, -1, -1, 37, -1, -1, -1, -1, -1, -1, -1, 37, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 41, 41, 41, 41, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 41, -1, -1, -1, -1, -1, -1, -1, 41, 41, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { 43, 43, -1, -1, -1, 43, 43, -1, 43, 43, 43, 43, -1, -1, 43, 43, -1, -1, -1, -1, -1, -1, 43, -1, 43, 42, 42, 42, 42, 42, 42, -1, -1, -1, -1, -1, -1, 43, 43, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 44, 45, 46, 47, 48, 49, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, 50, 50, 50, 50, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 50, -1, -1, -1, -1, -1, -1, -1, 50, 50, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { 53, 53, -1, -1, -1, 53, 53, -1, 53, 53, 53, 53, -1, -1, 53, 53, -1, -1, -1, -1, -1, -1, 53, -1, 53, 53, 53, 53, 53, 53, 53, 51, 52, -1, -1, -1, -1, 53, 53, -1, -1, -1 },
        { -1, 54, 54, 54, 54, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 54, -1, -1, -1, -1, -1, -1, -1, 54, 54, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { 59, 59, -1, -1, -1, 59, 59, -1, 59, 59, 59, 59, -1, -1, 59, 59, -1, -1, -1, -1, -1, -1, 59, -1, 59, 59, 59, 59, 59, 59, 59, 59, 59, 55, 56, 57, 58, 59, 59, -1, -1, -1 },
        { -1, 60, 61, 62, 63, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 64, -1, -1, -1, -1, -1, -1, -1, 65, 66, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
    };

    int[][] PRODUCTIONS = 
    {
        { 86, 44, 87 },
        { 46, 45 },
        { 44 },
        {  0 },
        {  2, 47 },
        { 52 },
        { 55 },
        { 58 },
        { 40, 48 },
        { 41, 60 },
        { 42, 60 },
        { 60 },
        { 49 },
        { 19, 24, 50, 25 },
        { 51, 24, 19, 24, 50, 25, 25 },
        {  5 },
        {  0 },
        { 20 },
        { 21 },
        { 22 },
        { 23, 24, 53, 25 },
        { 60, 85, 54 },
        { 38, 53 },
        {  0 },
        {  9, 60, 39, 44, 56, 57, 16 },
        { 10, 60, 39, 44, 56 },
        {  0 },
        { 11, 39, 44 },
        {  0 },
        { 15, 60, 39, 44, 16 },
        { 12,  2, 13, 59 },
        { 14, 24, 60, 25, 39, 44, 16 },
        {  2, 39, 44, 16 },
        { 62, 61 },
        {  6, 62, 88, 61 },
        {  7, 62, 89, 61 },
        {  0 },
        { 63 },
        { 18, 82 },
        { 17, 83 },
        {  8, 62, 84 },
        { 66, 64 },
        { 65, 80, 66, 81 },
        {  0 },
        { 26 },
        { 27 },
        { 28 },
        { 29 },
        { 30 },
        { 31 },
        { 68, 67 },
        { 32, 68, 72, 67 },
        { 33, 68, 73, 67 },
        {  0 },
        { 70, 69 },
        { 34, 70, 74, 69 },
        { 35, 70, 75, 69 },
        { 36, 70, 90, 69 },
        { 37, 70, 91, 69 },
        {  0 },
        {  2 },
        {  3, 76 },
        {  4, 77 },
        {  5, 92 },
        { 24, 60, 25 },
        { 32, 70, 78 },
        { 33, 70, 79 }
    };

    String[] PARSER_ERROR
            = {
                "",
                "esperado EOF", //"Era esperado fim de programa",
                "esperado identificador", //Era esperado id", 
                "esperado constante int", //"Era esperado cint",   //constante
                "esperado constante float", //"Era esperado cfloat", //constante
                "esperado constante str", //"Era esperado cstr",  //constante
                "esperado and", //"Era esperado and",
                "esperado or", //"Era esperado or",
                "esperado not", //"Era esperado not",
                "esperado if", //"Era esperado if",
                "esperado elif", //"Era esperado elif",
                "esperado else", //"Era esperado else",
                "esperado for", //"Era esperado for",
                "esperado in", //"Era esperado in",
                "esperado range", //"Era esperado range",
                "esperado while", //"Era esperado while",
                "esperado end", //"Era esperado end",
                "esperado true", //"Era esperado false",   //constante
                "esperado false", //"Era esperado true",   //constante
                "esperado input", //"Era esperado input",
                "esperado tipo", //"Era esperado int",    //tipo
                "esperado tipo", //"Era esperado float",    //tipo
                "esperado tipo", //"Era esperado str",    //tipo
                "esperado print", //"Era esperado print",
                "esperado (", //"Era esperado \"(\"",
                "esperado )", //"Era esperado \")\"",
                "esperado ==", //"Era esperado \"==\"",
                "esperado !=", //"Era esperado \"!=\"",
                "esperado <", //"Era esperado \"<\"",
                "esperado <=", //"Era esperado \"<=\"",
                "esperado >", //"Era esperado \">\"",
                "esperado >=", //"Era esperado \">=\"",
                "esperado +", //"Era esperado \"+\"",
                "esperado -", //"Era esperado \"-\"",
                "esperado *", //"Era esperado \"*\"",
                "esperado /", //"Era esperado \"/\"",
                "esperado //", //"Era esperado \"//\"",
                "esperado &", //"Era esperado \"%\"",
                "esperado ,", //"Era esperado \",\"",
                "esperado :", //"Era esperado \":\"",
                "esperado =", //"Era esperado \"=\"",
                "esperado +=", //"Era esperado \"+=\"",
                "esperado -=", //"Era esperado \"-=\"",
                "esperado id, if, for, while, print",//"<programa> inv�lido",
                "esperado id, if, for, while, print",//"<lista_comandos> inv�lido",
                "esperado EOF, id, if, elif, else, for, while, end, print",//"<lista_comandos1> inv�lido",
                "esperado id, if, while, print",//"<comando> inv�lido",
                "esperado =, +=, -=",//"<comando1> inv�lido",
                "esperado identificador, tipo, constante, not, (, +, -",//"<comando2> inv�lido",
                "esperado input, int, float, str",//"<entrada_dados1> inv�lido",
                "esperado constante str, )",//"<entrada> inv�lido",
                "esperado tipo", //"<tipo> inv�lido",
                "esperado print",//"<saida_dados> inv�lido",
                "esperado esperado uma expressão", //"<lista_expressoes> inv�lido",
                "esperado ), ','", //"<lista_expressoes1> inv�lido",
                "esperado if",//"<selecao> inv�lido",
                "esperado elif, else, endif",//"<senao_se> inv�lido",
                "esperado else, end",//"<senao> inv�lido",
                "esperado for, while",//"<repeticao> inv�lido",
                "esperado id, range",//"<repeticao1> inv�lido",
                "esperado uma expressão",//"<expressao> inv�lido",
                "esperado uma expressão",//"<expressao_> inv�lido", // espressao
                "esperado uma expressão",//"<elemento> inv�lido", // espressao
                "esperado uma expressão",//"<relacional> inv�lido", // espressao
                "esperado uma expressão",//"<relacional1> inv�lido", // espressao
                "esperado uma expressão",//"<operador_relacional> inv�lido", // espressao
                "esperado uma expressão",//"<aritmetica> inv�lido", // espressao
                "esperado uma expressão",//"<aritmetica_> inv�lido",  // espressao
                "esperado uma expressão",//"<termo> inv�lido",  // espressao
                "esperado uma expressão",//"<termo_> inv�lido",  // espressao
                "esperado uma expressão",//"<fator> inv�lido"  // espressao
            };
}
