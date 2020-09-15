package Interface;

public class Token {

    private int id;
    private String lexeme;
    private int position;

    public Token(int id, String lexeme, int position) {
        this.id = id;
        this.lexeme = lexeme;
        this.position = position;
    }

    public final int getId() {
        return id;
    }

    public final String getLexeme() {
        return lexeme;
    }

    public final int getPosition() {
        return position;
    }

    public String toString() {
        return id + " ( " + lexeme + " ) @ " + position;
    }

    public String getClasse() {
        String tokenDescription = "";
        switch (this.getId()) {
            case 2:
                tokenDescription = "identificador";
                break;
            case 3:
                tokenDescription = "constante inteiro";
            case 4:
                tokenDescription = "constante fracionario";
                break;
            case 5:
                tokenDescription = "constante string";
                break;
            case 6:
                tokenDescription = "and";
                break;
            case 7:
                tokenDescription = "or";
                break;
            case 8:
                tokenDescription = "not";
                break;
            case 9:
                tokenDescription = "if";
                break;
            case 10:
                tokenDescription = "elif";
                break;
            case 11:
                tokenDescription = "else";
                break;
            case 12:
                tokenDescription = "for";
                break;
            case 13:
                tokenDescription = "in";
                break;
            case 14:
                tokenDescription = "range";
                break;
            case 15:
                tokenDescription = "while";
                break;
            case 16:
                tokenDescription = "end";
                break;
            case 17:
                tokenDescription = "false";
                break;
            case 18:
                tokenDescription = "true";
                break;
            case 19:
                tokenDescription = "input";
                break;
            case 20:
                tokenDescription = "inteiro";
                break;
            case 21:
                tokenDescription = "fracionario";
                break;
            case 22:
                tokenDescription = "string";
                break;
            case 23:
                tokenDescription = "print";
                break;
            case 24:
                tokenDescription = "(";
                break;
            case 25:
                tokenDescription = ")";
                break;
            case 26:
                tokenDescription = "==";
                break;
            case 27:
                tokenDescription = "!=";
                break;
            case 28:
                tokenDescription = "<";
                break;
            case 29:
                tokenDescription = "<=";
                break;
            case 30:
                tokenDescription = ">";
                break;
            case 31:
                tokenDescription = ">=";
                break;
            case 32:
                tokenDescription = "+";
                break;
            case 33:
                tokenDescription = "-";
                break;
            case 34:
                tokenDescription = "*";
                break;
            case 35:
                tokenDescription = "/";
                break;
            case 36:
                tokenDescription = "//";
                break;
            case 37:
                tokenDescription = "%";
                break;
            case 38:
                tokenDescription = ",";
                break;
            case 39:
                tokenDescription = ":";
                break;
            case 40:
                tokenDescription = "=";
                break;
            case 41:
                tokenDescription = "+=";
                break;
            case 42:
                tokenDescription = "-=";
                break;

        }
        return tokenDescription;
    }
}
