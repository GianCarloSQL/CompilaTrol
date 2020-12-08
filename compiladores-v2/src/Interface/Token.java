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
                tokenDescription = "constante int";
            case 4:
                tokenDescription = "constante float";
                break;
            case 5:
                tokenDescription = "constante str";
                break;
            case 6: // and
            case 7: //or
            case 8://not
            case 9: //if
            case 10://elif
            case 11://else
            case 12: // while
            case 13: //end
            case 14: //false
            case 15: //true
            case 16: //input
            case 17: //inteiro
            case 18: //fracionario
            case 19: //string
            case 20: //print
                tokenDescription = "palavra reservada";
                break;
            case 21: //(
            case 22://)
            case 23://==
            case 24: //!=
            case 25: // <
            case 26: //<=
            case 27: //>
            case 28: //>=
            case 29: //+
            case 30: //-
            case 31: //*
            case 32: // /
            case 33: // //
            case 34: // %
            case 35: // ,
            case 36: // :
            case 37: // =
            case 38: // +=
            case 39: // -=
                tokenDescription = "símbolo especial";
                break;

        }
        return tokenDescription;
    }
}
