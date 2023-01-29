package banco;

public class Conta {
    private String titular;
    private int numero;
    private double saldo;
    //CONSTRUTORES PEDIDOS QUE VOU CHAMAR NA PRINCIPAL
    public Conta(String titular, int numero, double saldo){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }
    public Conta(String titular, int numero){
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0;
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
    public boolean transferirDinheiro(double valor, Conta c){
        if (sacarDinheiro(valor)){
            c.depositarDinheiro(valor);
            return true;
        }else{
            return false;
        }
    }
    //GETTER AND SETTERS DOS ATRIBUTOS
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
