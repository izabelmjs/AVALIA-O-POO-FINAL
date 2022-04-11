import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors; 

public class Sistema implements Funcionalidades {

    Scanner leia = new Scanner(System.in);
    List<Produto> produtos = new ArrayList<Produto>();


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

                for ( Produto  p : produtos )
                System.out.format ("%8s %30s %25d %25d \n" , p.getNome(), p.getValor(),
                p.getQtdestoque(), p.getCodigo()); {
                System.out.println();
                System.out.println();

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
    public void vendas() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void realizar() {
        // TODO Auto-generated method stub
        
    }
}