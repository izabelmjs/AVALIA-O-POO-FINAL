
public interface Funcionalidades {
    
    public abstract void incluir(Produto l);
    public abstract void buscar(String nome)throws InterruptedException;
    public abstract void listar();
    public abstract void vendas(String data);
    public abstract void realizar(String vendas, String data);
    
}
