public class Produto extends Sistema{

    private int codigo;
    private Double valor;
    private String nome;
    int qtdestoque;

    public Produto(String nome, Double valor, int codigo2, int qtdestoque) {   
        this.codigo = codigo2;
        this.valor = valor;
        this.nome = nome;
        this.qtdestoque = qtdestoque;
    
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public int getQtdestoque() {
        return qtdestoque;
    }
    public void setQtdestoque(int qtdestoque) {
        this.qtdestoque = qtdestoque;
    }

    @Override
    public String toString() {
        return "\nNome do produto: " + nome + "\nValor do produto: R$ " + valor + "\nQuantidade do produto: " + qtdestoque + "\nCódigo do produto: " + codigo;

    }
}