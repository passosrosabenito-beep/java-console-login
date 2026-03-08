import java.util.Locale;
import java.util.Scanner;

public class login {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        IO.println("Digite seu nome:");
        String nome = sc.next();

        IO.println("Digite uma senha:");
        String senha = sc.next();

        IO.println("Deseja verificar as inforções?");
        String resposta = sc.next().toLowerCase(Locale.US);

        switch (resposta){
            case "sim":

                IO.println(nome);
                IO.println(senha);

                IO.println("Deseja alterar alguma informação?");
                String resposta2 = sc.next().toLowerCase(Locale.US);

                switch (resposta2){
                    case "sim":
                        IO.println("Qual informação abaixo você deseja alterar?");
                        IO.println("nome");
                        IO.println("senha");
                        IO.println("ambos");

                        String resposta3 = sc.next().toLowerCase(Locale.US);
                        switch (resposta3){
                            case "nome":
                                IO.println("Digite sua nova informacao de nome:");
                                nome = sc.next();

                                IO.println("Deseja ver suas informacoes finais");
                                String resposta4 = sc.next().toLowerCase(Locale.US);

                                switch (resposta4){
                                    case "sim":
                                        IO.println("Nome cadastrado: " + nome);
                                        break;

                                    case "nao":
                                        IO.println("Obrigado pelo seu cadastro! volte sempre");
                                        break;


                                }
                            break;

                            case "senha":
                                IO.println("Digite sua nova informacao de senha:");
                                senha = sc.next();

                                IO.println("Deseja ver suas informacoes finais");
                                resposta4 = sc.next().toLowerCase(Locale.US);

                                switch (resposta4) {
                                    case "sim":
                                        IO.println("Senha cadastrada: " + senha);
                                        break;

                                    case "nao":
                                        IO.println("Obrigado pelo seu cadastro! volte sempre");
                                        break;
                                }
                            break;

                            case "ambos":
                                IO.println("Digite suas novas informacoes:");
                                IO.println("Digite sua nova informacao de nome");
                                nome = sc.next();
                                IO.println("Digite sua nova informacao de senha:");
                                senha = sc.next();

                                IO.println("Deseja ver suas informacoes finais");
                                resposta4 = sc.next().toLowerCase(Locale.US);

                                switch (resposta4) {
                                case "sim":
                                    IO.println("Nome cadastrado: " + nome);
                                    IO.println("Senha cadastrada: " + senha);
                                    break;

                                case "nao":
                                    IO.println("Obrigado pelo seu cadastro! volte sempre");
                                    break;

                                    default:
                                        IO.println("Digite apenas 'sim' ou 'nao'");
                                        break;
                            }
                            break;
                            default:
                                IO.println("Apenas as opcoes listadas acima podem ser alteradas!");
                            break;
                        }
                        break;

                    default:
                        IO.println("Digite apenas 'sim' ou 'nao'");
                        break;
                }

                break;

            case "nao":
                IO.println("Obrigado pelo seu cadastro!");
                break;

            default:
                IO.println("Digite apenas 'sim' ou 'nao'");
                break;
        }

        sc.close();
    }
}
