package compras;

public class ItemDeCompra {
    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;
    private double valor;

    public ItemDeCompra(int codigo, String nome, double preco){
        this.codigo = codigo;
        this.nome= nome;
        this.preco = preco;
    }
    public void calcularTotal(int quantidade, double preco){   //PARA CADA ITEM
        valor = quantidade*preco;
    }

    public double getValor(){
        return valor;
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
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
