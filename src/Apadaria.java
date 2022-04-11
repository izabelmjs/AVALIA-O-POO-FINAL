import java.util.Scanner;
public class Apadaria{

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        String opcao;
        Sistema sistema = new Sistema();;
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
                
                    Produto produtos = new Produto(opcao, null, 0, 0);

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

                case "5":

                     System.out.println("                                    VENDA DE PRODUTO                                            ");
                    System.out.println("-----------------------------------------------------------------------------------------------------");
                    nomeBuscando = imput.nextLine();

                    for (produto produtos : Lista){
                        
                        if()

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
                prod.close();
        }
    }
            public static void limpaTela() {
                for (int i = 0; i < 20; i++) {
                System.out.println();
        }
    }
}
