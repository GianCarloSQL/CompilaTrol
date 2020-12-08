package Interface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Semantico implements Constants {

    private String operador_relacional;
    public String codigo = "";
    private Stack<String> pilha_de_tipos = new Stack();
    private String tipovar;
    private ArrayList<String> listaid = new ArrayList<>();
    private HashMap<String, String> TS = new HashMap<>();
    private ArrayList<String> lista_rotulos = new ArrayList<>();
    private int qtdRotulos = 1;
    private String operador_atribuicao = "";
    String id = "";
    String tipo = "";
    String tipoid = "";
    String tipoexp = "";
    String tipo1 = "";
    String tipo2 = "";
    String classe = "";

    public void executeAction(int action, Token token) throws SemanticError {
        switch (action) {
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
                if (tipo1.equals(tipo2)) {
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
            case 7:
                tipo = pilha_de_tipos.pop();
                if (tipo.equals("float64") || tipo.equals("int64")) {
                    pilha_de_tipos.push(tipo);
                } else {
                    throw new SemanticError("tipos incompativeis");
                }
                break;
            case 8:
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
            case 9:
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
                    case "<":
                        codigo += "clt \n";
                        break;
                    case ">":
                        codigo += "cgt \n";
                        break;
                }
                break;
            case 11:
                pilha_de_tipos.push("bool");
                codigo += "ldc.i4.1 \n";
                break;
            case 12:
                pilha_de_tipos.push("bool");
                codigo += "ldc.i4.0 \n";
                break;
            case 13:
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
                    codigo += "conv.i8 \n";
                }
                codigo += "call void [mscorlib]System.Console::Write(" + tipo + ") \n";
                break;
            case 15:
                codigo += ".assembly extern mscorlib {} \n"
                        + ".assembly _codigo_objeto{} \n"
                        + ".module _codigo_objeto.exe \n"
                        + ".class public _UNICA{ \n"
                        + ".method static public void _principal(){ \n"
                        + ".entrypoint \n";
                break;
            case 16:
                codigo += "ret}} \n";
                break;
            case 17:
                String tipo1 = pilha_de_tipos.pop();
                String tipo2 = pilha_de_tipos.pop();
                if ((tipo1 != "bool") || (tipo2 != "bool")) {
                    throw new SemanticError("Tipos incompatíveis em expressão lógica");
                } else {
                    pilha_de_tipos.push("bool");
                    codigo += "and \n";
                }
                break;
            case 18:
                String tipo_1 = pilha_de_tipos.pop();
                String tipo_2 = pilha_de_tipos.pop();
                if ((tipo_1 != "bool") || (tipo_2 != "bool")) {
                    throw new SemanticError("Tipos incompatíveis em expressão lógica");
                } else {
                    pilha_de_tipos.push("bool");
                    codigo += "or \n";
                }

                break;
            case 19:
                String tipo1_19 = pilha_de_tipos.pop();
                String tipo2_19 = pilha_de_tipos.pop();
                if (tipo1_19.equals("int64") && tipo2_19.equals("int64")) {
                    pilha_de_tipos.push("int64");
                } else {
                    throw new SemanticError("tipos incompativeis");
                }
                codigo += "div \n";
                break;
            case 20:
                String tipo1_20 = pilha_de_tipos.pop();
                String tipo2_20 = pilha_de_tipos.pop();
                if (tipo1_20.equals("int64") && tipo2_20.equals("int64")) {
                    pilha_de_tipos.push("int64");
                } else {
                    throw new SemanticError("tipos incompativeis");
                }
                codigo += "rem \n";
                break;
            case 21:
                pilha_de_tipos.push("string");
                codigo += "ldstr " + token.getLexeme().replace('\'', '\"') + " \n";
                break;
            case 22:
                id = token.getLexeme();
                break;
            case 23:
                operador_atribuicao = token.getLexeme();
                if ((operador_atribuicao.equals("+=") || operador_atribuicao.equals("-=")) && !id.isEmpty()) {
                    if (!TS.containsKey(id)) {
                        throw new SemanticError("Identificador não declarado");
                    }

                    String tipo_identificador = TS.get(id);

                    codigo += "ldloc " + id + "\n";

                    if (tipo_identificador.equals("int64")) {
                        codigo += "conv.r8 \n";
                    }
                }
                break;
            case 24:
                String tipo_id = "";
                if (TS.containsKey(id)) {
                    tipo_id = TS.get(id);
                    pilha_de_tipos.pop();
                } else {
                    tipo_id = pilha_de_tipos.pop();
                    TS.put(id, tipo_id);
                    codigo += ".locals(" + tipo_id + " " + id + ") \n";
                }
                if (tipo_id == "int64") {
                    codigo += "conv.i8 \n";
                }
                codigo += "stloc " + id + "\n";
                break;
            case 25:
                acao_25(token);
                break;
            case 26:
                acao_26(token);
                break;
            case 27:
                acao_27(token);
                break;
            case 28:
                acao_28(token);
                break;
            case 29:
                acao_29(token);
                break;
            case 30:
                acao_30(token);
                break;
            case 31:
                acao_31(token);
                break;
            case 32:
                acao_32(token);
                break;
            case 33:
                acao_33(token);
                break;
            case 34:
                acao_34(token);
                break;
            case 35:
                String id_acao = token.getLexeme();
                if (!TS.containsKey(id_acao)) {
                    throw new SemanticError("Identificador não declarado");
                }
                codigo += "ldloc " + id_acao + "\n";
                String tipo_recuperado_da_tabela = TS.get(id_acao);
                pilha_de_tipos.push(tipo_recuperado_da_tabela);
                if (tipo_recuperado_da_tabela == "int64") {
                    codigo += "conv.r8 \n";
                }
                break;
            case 36:
                switch (operador_atribuicao) {
                    case "-=":
                        codigo += "sub";
                        break;
                    case "+=":
                        codigo += "add";
                        break;
                }

                if (id == "int64") {
                    codigo += "conv.i8 \n";
                }
                codigo += "stloc " + id + "\n";
                break;
        }
    }

    private void acao_25(Token token) {
        switch (token.getLexeme()) {
            case "int":
                tipovar = "int64";
                break;
            case "float":
                tipovar = "float64";
                break;
            default:
                tipovar = "string";
                break;
        }

        if (!TS.containsKey(id)) {
            TS.put(id, tipovar);
            codigo += ".locals(" + tipovar + " " + id + ") \n";
        } else {
            tipovar = TS.get(id);
        }

    }

    private void acao_26(Token token) {
        String classe = "";

        if (tipovar == "int64") {
            classe = "Int64";
        } else if (tipovar == "float64") {
            classe = "Double";
        } else if (tipovar == "bool") {
            classe = "Boolean";
        }

        codigo += "call string [mscorlib]System.Console::ReadLine()\n";

        if (tipovar != "string") {
            codigo += "call " + tipovar + " [mscorlib]System." + classe + "::Parse(string)\n";
            codigo += "stloc " + id + "\n";
        }
    }

    private void acao_27(Token token) {
        codigo += "brfalse " + gerar_rotulo() + "\n";
    }

    private void acao_28(Token token) {
        int qtd = lista_rotulos.size();
        for (int i = 0; i < qtd; i++) {
            String rotulo = lista_rotulos.get(i);
            codigo += rotulo + ":\n";
        }
        lista_rotulos.clear();
    }

    private void acao_29(Token token) {
        String rotulo = obter_ultimo_rotulo();
        codigo += "br " + gerar_rotulo() + "\n";
        codigo += rotulo + ":\n";
    }

    private void acao_30(Token token) {
        codigo += "brfalse " + gerar_rotulo() + "\n";
    }

    private void acao_31(Token token) {
        String rotulo = obter_ultimo_rotulo();
        codigo += "br " + gerar_rotulo() + "\n";
        codigo += rotulo + ":\n";
    }

    private void acao_32(Token token) {
        codigo += gerar_rotulo() + ":\n";
    }

    private void acao_33(Token token) {
        codigo += "brfalse " + gerar_rotulo() + "\n";
    }

    private void acao_34(Token token) {
        codigo += "br " + obter_primeiro_rotulo() + "\n";
        codigo += obter_primeiro_rotulo() + ":\n";
    }

    private String gerar_rotulo() {
        String rotulo = "r" + qtdRotulos;
        qtdRotulos++;
        lista_rotulos.add(rotulo);
        return rotulo;
    }

    private String obter_primeiro_rotulo() {
        String rotulo = lista_rotulos.get(0);
        lista_rotulos.remove(0);
        return rotulo;
    }

    private String obter_ultimo_rotulo() {
        int i = lista_rotulos.size() - 1;
        String rotulo = lista_rotulos.get(i);
        lista_rotulos.remove(i);
        return rotulo;
    }
}
