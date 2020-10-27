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
            case 12://for
            case 13://in
            case 14://range
            case 15: // while
            case 16: //end
            case 17: //false
            case 18: //true
            case 19: //input
            case 20: //inteiro
            case 21: //fracionario
            case 22: //string
            case 23: //print
                tokenDescription = "palavra reservada";
                break;
            case 24: //(
            case 25://)
            case 26://==
            case 27: //!=
            case 28: // <
            case 29: //<=
            case 30: //>
            case 31: //>=
            case 32: //+
            case 33: //-
            case 34: //*
            case 35: // /
            case 36: // //
            case 37: // %
            case 38: // ,
            case 39: // :
            case 40: // =
            case 41: // +=
            case 42: // -=
                tokenDescription = "símbolo especial";
                break;

        }
        return tokenDescription;
    }
}
