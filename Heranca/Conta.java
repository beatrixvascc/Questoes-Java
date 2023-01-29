package heranca;

public class Conta {
    protected String titular;
    protected int numero;
    protected double saldo;
    //CONSTRUTOR
    public Conta(String titular, int numero, double saldo){
        this.titular=titular;
        this.numero=numero;
        this.saldo=saldo;
    }
        
    //METODOS QUE VOU CHAMAR NA PRINCIPAL
    public void depositarDinheiro(double valor){
        saldo+=valor;
    }
    public boolean sacarDinheiro(double valor){
        if (saldo>=valor){
            saldo-=valor;
            return true;
        } else{
            return false;
        }
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
