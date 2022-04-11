public class Venda {
    
    Venda(){
    }

    public Venda(String dataVenda, int codigoVenda, String nomeVenda, int qtdVenda, double valorProd, double valorVenda){
        this.dataVenda = dataVenda;
        this.codigoVenda = codigoVenda;
        this.nomeVenda = nomeVenda;
        this.qtdVenda = qtdVenda;
        this.valorProd = valorProd;
        this.valorVenda = valorVenda;
    }

    String dataVenda;
    int codigoVenda;
    String nomeVenda;
    int qtdVenda;
    double valorProd;
    double valorVenda;

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public String getNomeVenda() {
        return nomeVenda;
    }

    public void setNomeVenda(String nomeVenda) {
        this.nomeVenda = nomeVenda;
    }

    public int getqtdVenda() {
        return qtdVenda;
    }

    public void setqtdVenda(int qtdVenda) {
        this.qtdVenda = qtdVenda;
    }

    public double getvalorProd() {
        return valorProd;
    }

    public void setvalorProd(double valorProd) {
        this.valorProd = valorProd;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    @Override
    public String toString() {
        return "\nData da venda: " + dataVenda + "  //  Nome do Produto Vendido: " + nomeVenda +
            "  //  Valor do Produto: " + valorProd + "\nQuantidade: " + qtdVenda +
                "  //  Valor Total da Venda: " + valorVenda;
    }

    public void add(Venda venda) {
    }
}