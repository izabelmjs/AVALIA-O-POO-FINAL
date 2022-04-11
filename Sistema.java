import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sistema implements Funcionalidades {

    List<Produto> produtos = new ArrayList<>();
    List<Venda> venda = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void incluir(Produto prod) {
        produtos.add(prod);
        
    }

    @Override
    public void buscar(String nome) throws InterruptedException {
        boolean encontrado = false;
        for (Produto p : produtos){

            if(nome.equals(p.getNome())){
            System.out.println("\nProduto encontado!\n");
            Thread.sleep(1000);
            System.out.println("                                     INFORMAÇÕES DO PRODUTO                                            ");
            System.out.print("-----------------------------------------------------------------------------------------------------");

            System.out.println(p.toString());
                encontrado = true;
                System.out.println("-----------------------------------------------------------------------------------------------------");
                break;
            }
        }
            if (encontrado == false) {
            System.out.println("\nProduto não encontrado!");
        }
    }

    @Override
    public void listar() {
        if ( produtos.isEmpty() ) {
            System.out.println("\nLista vazia!");
        } else {
            System.out.println("                                     LISTA DE PRODUTOS                                                ");
            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.printf("%8s %20s %15s %10s", "Nome do produto              " , "Valor do produto       " , "Quantidade do produto      " , "Código do produto    ");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------");
            produtos.stream();

            for (Produto p : produtos) {
                System.out.format ("%8s %30s %25d %25d \n" , p.getNome(), p.getValor(),
                p.getQtdestoque(), p.getCodigo()); {
                System.out.println();
                }
        }
        System.out.println("                                         INFORMAÇÕES                                               ");
        System.out.println("-----------------------------------------------------------------------------------------------------");

        DoubleSummaryStatistics relatorio = produtos.stream()
        .collect(Collectors.summarizingDouble(Produto::getValor));

        System.out.print("| Maior valor é R$: " + relatorio.getMax() + "\n");
        System.out.print("| Menor valor é R$: " + relatorio.getMin() + "\n");
        System.out.print("| Média dos valores é R$: " + relatorio.getAverage() + "\n");
        }
        }

        @Override
        public void vendas(String data) {
                if ( venda.isEmpty() ) {
                    System.out.println("\nNenhuma venda Registrada!");
                } else {
                    System.out.println("Período de Emissão: " + data);
                    for (Venda venda : venda) {
                        System.out.println( venda );
                    }   
                    DoubleSummaryStatistics rodape = venda.stream()
                    .collect(Collectors.summarizingDouble(Venda :: getValorVenda));
        
                    System.out.println("                                                 RODAPÉ                                              ");
                    System.out.println("-----------------------------------------------------------------------------------------------------");
                    System.out.println("\nValor médio das vendas desse período de emissão: " + rodape.getAverage());
            
        }
    }

        @Override
        public void realizar(String nome, String data) {
            boolean achei = false;
            boolean continuar = false;
            boolean bug = true;
            Venda venda = new Venda();
            
            for ( Produto p : produtos) {
                
                if (p.getNome().equals(nome)) {
                    System.out.print("Informe quantos '" + p.getNome() + "' deseja vender: ");
                    venda.setqtdVenda(scanner.nextInt());
                    
                    if (venda.getqtdVenda()>p.getQtdestoque()){
                        System.out.println("A qauntidade deste produto não tem no estoque!" +
                            " Quantidade do produto em estoque: ("
                                + p.getQtdestoque() + ")");
                    System.out.print("\nPressione 'ENTER' para voltar ao menu.");
                    scanner.nextLine();
                   
                
                }
                if(continuar){
                    achei = true;

                        venda.setDataVenda(data);
                        venda.setNomeVenda(p.getNome());
                        venda.setCodigoVenda(p.getCodigo());
                        venda.setvalorProd(p.getValor());
                        venda.setValorVenda(venda.getqtdVenda() * venda.getvalorProd());
                        bug = false;
                    }
                }

                if (achei) {
                    limpa();
                    System.out.println("                                       VENDA DO PRODUTO                                              ");
                    System.out.println("-----------------------------------------------------------------------------------------------------");
                    System.out.println( venda.toString() );
                    System.out.print("\nVenda realizada com sucesso! Pressione 'ENTER' para continuar.");
                    p.qtdestoque -= venda.qtdVenda;
                    venda.add( venda );
                    bug = false;
                }
                if (bug){
                    System.out.println("\nO Produto não foi Encontrado!");
                    System.out.print("\nPressione 'ENTER' para continuar.");
                    scanner.nextLine();
                    break;
                }
            }
            if (produtos.isEmpty()){
                System.out.println("\nNão Existem Produtos cadastrados para vender!");
                System.out.print("\nPressione 'ENTER' para continuar.");
                scanner.nextLine();
            }
        }
        public static void limpa(){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }

		public void relatorio(String data) {
		}
}
