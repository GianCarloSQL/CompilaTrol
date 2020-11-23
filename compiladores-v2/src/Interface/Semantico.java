package Interface;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Semantico implements Constants
{
    private String operador_relacional;
    private String codigo;
    private Stack<String> pilha_de_tipos = new Stack();
    private String tipovar;
    private ArrayList<String> listaid = new ArrayList<>();
    private HashMap<String, String> TS = new HashMap<>();
    String id = "";
    String tipo = "";
    String tipoid = "";
    String tipoexp = "";
    String tipo1 = "";
    String tipo2 = "";
    String classe = "";
    
    public void executeAction(int action, Token token)	throws SemanticError
    {
        switch(action) {
            case 1:
                tipo1 = pilha_de_tipos.pop();
                tipo2 = pilha_de_tipos.pop();
                if (tipo1.equals("float64") || tipo2.equals("float64")) {
                    pilha_de_tipos.push("float64");
                } else {
                    pilha_de_tipos.push("int64");
                }
                codigo += "add \n";
                break;
            case 2:
                tipo1 = pilha_de_tipos.pop();
                tipo2 = pilha_de_tipos.pop();
                if (tipo1.equals("float64") || tipo2.equals("float64")) {
                    pilha_de_tipos.push("float64");
                } else {
                    pilha_de_tipos.push("int64");
                }
                codigo += "sub \n";
                break;
            case 3:
                tipo1 = pilha_de_tipos.pop();
                tipo2 = pilha_de_tipos.pop();
                if (tipo1.equals("float64") || tipo2.equals("float64")) {
                    pilha_de_tipos.push("float64");
                } else {
                    pilha_de_tipos.push("int64");
                }
                codigo += "mul \n";
                break;
            case 4:
                tipo1 = pilha_de_tipos.pop();
                tipo2 = pilha_de_tipos.pop();
                if (tipo1.equals(tipo2)){
                    pilha_de_tipos.push(tipo1);
                } else {
                    throw new SemanticError("tipos incompativeis");
                }
                codigo += "div \n";
                break;
            case 5:
                pilha_de_tipos.push("int64");
                codigo += "ldc.i8 " + token.getLexeme() + " \n";
                codigo += "conv.r8 \n";
                break;
            case 6:
                pilha_de_tipos.push("float64");
                codigo += "ldc.r8 " + token.getLexeme() + " \n";
                break;
            case 7 :
                tipo = pilha_de_tipos.pop();
                if (tipo.equals("float64") || tipo.equals("int64")) {
                    pilha_de_tipos.push(tipo);
                } else {
                    throw new SemanticError("tipos incompativeis");
                }
                break;
            case 8 :
                tipo = pilha_de_tipos.pop();
                if (tipo.equals("float64") || tipo.equals("int64")) {
                    pilha_de_tipos.push(tipo);
                } else {
                    throw new SemanticError("tipos incompativeis");
                }
                codigo += "ldc.i8 -1 \n" 
                        + "conv.r8 \n" 
                        + "mul \n";
                break;
            case 9 :
                operador_relacional = token.getLexeme();
                break;
            case 10:
                tipo1 = pilha_de_tipos.pop();
                tipo2 = pilha_de_tipos.pop();
                if (tipo1.equals(tipo2)) {
                    pilha_de_tipos.push("bool");
                } else {
                    throw new SemanticError("tipos incompativeis");
                }
                switch (operador_relacional) {
                    case "==":
                        codigo += "ceq \n";
                        break;
                    case "!=":
                        codigo += "ceq \n";
                        break;
                    case "<":
                        codigo += "clt \n";
                        break;
                    case "<=":
                        codigo += " \n";
                        break;
                    case ">":
                        codigo += "cgt \n";
                        break;
                    case ">=":
                        codigo += " \n";
                        break;
                }
                break;
            case 11 :
                pilha_de_tipos.push("bool");
                codigo += "ldc.i4.1 \n";
                break;
            case 12 :
                pilha_de_tipos.push("bool");
                codigo += "ldc.i4.0 \n";
                break;
            case 13 :
                tipo = pilha_de_tipos.pop();
                if (tipo.equals("bool")) {
                    pilha_de_tipos.push(tipo);
                } else {
                    throw new SemanticError("tipos incompativeis em expressao logica");
                }
                codigo += "ldc.i4.1 \n"
                        + "xor \n";
                break;
            case 14:
                String tipo = pilha_de_tipos.pop();
                if (tipo.equals("int64")) {
                    codigo += "conv.r8 \n";
                }
                codigo += "call void [micorlib]System.Console::Write(" + tipo + ") \n";
                break;
            case 15:
                codigo += ".assembly extern mscorlib {} \n"
                        + ".assembly _codigo_objeto{} \n"
                        + ".module _codigo_objeto.exe \n"
                        + ".class public _UNICA{} \n";
                break;
            case 16:
                codigo += ".module static public void _principal(){ \n"
                        + ".entrypoint \n";
                break;
            case 17:
                codigo += "ret}} \n";
                break;
            case 18 :
                
                break;
            case 19 :
                
                break;
            case 20 :
                
                break;
            case 21 :
                
                break;
            case 30:
                switch (token.getLexeme()) {
                    case "int":
                        tipovar = "int64";
                        break;
                    case "real":
                        tipovar = "float64";
                        break;
                }
                break;
            case 31:
                for (String id : listaid) {
                    if (!TS.containsKey(id)) {
                        throw new SemanticError("identificador nao declarado");
                    }
                    TS.put(id, tipovar);
                    codigo += ".locals( " + tipovar + id + " ) \n";
                }
                listaid.clear();
                break;
            case 32:
                listaid.add(token.getLexeme());
                break;
            case 33 :
               id = token.getLexeme();
                
                if (!TS.containsKey(id))
                    throw new SemanticError("identificador nao declarado");
                
                tipoid = TS.get(id);
                pilha_de_tipos.push(tipoid);
                
                codigo += "ldloc " + id + " \n";
                
                if (tipoid.equals("int64"))
                    codigo += "conv.r8 \n";
                break;
            case 34 :
                id = token.getLexeme();
                
                if (!TS.containsKey(id))
                    throw new SemanticError("identificador nao declarado");
                
                tipoid = TS.get(id);
                tipoexp = pilha_de_tipos.pop();
                
                if (!tipoid.equals(tipoexp))
                    throw new SemanticError("tipos incompativeis");
                
                if (tipoid.equals("int64"))
                    codigo += "conv.i8 \n";
                
                codigo += "stloc " + id + " \n";
                break;
            case 35 :
                for (String id : listaid) {
                    if (!TS.containsKey(id)) {
                        throw new SemanticError("identificador nao declarado");
                    }
                    tipoid = TS.get(id);
                    switch (tipoid) {
                        case "int64":
                            classe = "Int64";
                            break;
                        case "float64":
                            classe = "Double";
                            break;
                    }
                    codigo += "call string [mscorlib]System.Console::Readline() \n";
                    codigo += "call " + tipoid + " [mscorlib]System." + classe + "::Parse(string) \n";
                    codigo += "stloc " + id + " \n";
                }
                listaid.clear();
                break;
            case 36 :
                
                break;
            case 37 :
                
                break;
            case 38 :
                
                break;
            case 39 :
                
                break;
            case 40 :
                
                break;
            case 41 :
                
                break;
            case 42 :
                
                break;
        }
    }	
}

