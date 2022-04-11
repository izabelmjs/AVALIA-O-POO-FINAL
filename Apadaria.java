import java.util.Scanner;

public class Apadaria {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        Sistema sistema = new Sistema();
        String opcao;
        String data = null;
        limpaTela();


        try (Scanner prod = new Scanner(System.in)) {
            do{
                System.out.println("                                      MENU PRINCIPAL                                               ");
                System.out.println("-----------------------------------------------------------------------------------------------------");
                System.out.println("1 - Incluir produto");
                System.out.println("2 - Consultar produto");
                System.out.println("3 - Listagem de produtos");
                System.out.println("4 - Vendas por período");
                System.out.println("5 - Realizar venda");
                System.out.println("0 - Sair\n");

                opcao = scanner.nextLine();
                limpaTela();


                switch (opcao) {


                case "1":
                
                    Produto produtos = new Produto(data, null, 0, 0);

                    System.out.println("                                    CADASTRO DE PRODUTOS                                               ");
                    System.out.println("-----------------------------------------------------------------------------------------------------");
                    System.out.println("\nNome do produto: ");
                    String nome = prod.nextLine();

                    System.out.println("\nValor do produto: ");
                    double valor = prod.nextDouble();

                    System.out.println("\nCódigo do produto: ");
                    int codigo = prod.nextInt();

                    System.out.print("\nProduto em estoque: \n");
                    int qtdestoque = prod.nextInt();

                    produtos = new Produto(nome, valor, codigo, qtdestoque);
                    sistema.incluir(produtos);

                    System.out.println("\nProduto cadastrado!");
                    System.out.println("\nPressione enter para voltar ao menu!");

                    scanner.nextLine();
                    prod.nextLine();
                    limpaTela();
                    break;


                case "2":

                    System.out.println("Buscar produto: ");
                    String nomeBuscando  = scanner.nextLine();
                    sistema.buscar(nomeBuscando);

                    System.out.println("\nPressione enter para voltar ao menu!");
                    prod.nextLine();
                    limpaTela();
                    break;
                    
                case "3":

                    sistema.listar();
                    Thread.sleep(2000);
                    System.out.println("\nPressione enter para voltar ao menu!");

                    prod.nextLine();
                    limpaTela();
                    continue;
                
                case "4":

                limpaTela();

                        System.out.println("                                          VENDAS POR PERÍODO                                         ");
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        sistema.vendas(data);

                        System.out.print("\nPressione 'ENTER' para continuar.");
                        scanner.nextLine();
                        limpaTela();
                        break;

                case "5":

                limpaTela();
                       
                        System.out.println("                                               VENDA                                                 ");
                        System.out.println("-----------------------------------------------------------------------------------------------------");
                        System.out.print("Informe a data de hoje: ");
                        data = scanner.nextLine();
                        if(data.matches("")){
                            System.out.println("\nA data não pode ser vazia!");
                            System.out.print("\nPressione 'ENTER' para continuar.");
                            scanner.nextLine();
                            limpaTela();
                            break;
   
                        }
                        if(!data.matches("\\d{2}/\\d{2}/\\d{4}")){
                            System.out.println("\nA data deve estar na ordem correta! (dd/mm/aaaa)");
                            System.out.print("\nPressione 'ENTER' para continuar.");
                            scanner.nextLine();
                            limpaTela();
                            break;
                        }

                        System.out.print("Digite o nome do produto da compra: ");
                        String nomeVenda = scanner.next();
                        scanner.nextLine();

                        sistema.realizar(nomeVenda, data);

                        scanner.nextLine();
                        limpaTela();
                        break;

        
                    case "0":

                    System.out.println("\nFim do programa!\n");
                    scanner.close();
                    break;
                    
                    default:
                    System.out.println("\nEsta opção não existe  ");
                    Thread.sleep(1000);
                    System.out.println("\nPressione enter para voltar ao menu!");
                    prod.nextLine();
                    continue;
                }
                    
                    }while( opcao != "0" );
                        System.out.println("\nFim do programa!\n");
                        scanner.close();
                }
        }
                    public static void limpaTela() {
                        for (int i = 0; i < 20; i++) {
                        System.out.println();
        }
    }
}

