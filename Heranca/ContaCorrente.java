package heranca;

public class ContaCorrente extends Conta{
    private double limite;
    public ContaCorrente(String titular, int numero, double saldo, double limite){
        super(titular, numero, saldo);
        this.limite = limite;
    }
    public void debitarAnuidade(){
        saldo-=50;
    }
    public void debitarAnuidade(double valor){
        if (saldo>=valor){
            saldo-=valor;
        } else{
            System.out.println("saldo insuficiente para debitar");
        }
    }
    public boolean sacarDinheiro(double valor){
        if (saldo+limite>=valor){
            saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    
}
