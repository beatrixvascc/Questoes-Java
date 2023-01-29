package heranca;

public class ContaPoupanca extends Conta {
    private double taxaJuros;
    private double taxaRendimento=0.4;
    public ContaPoupanca(String titular, int numero, double saldo){
        super(titular, numero, saldo);
        taxaJuros=100;
    }
    public String toString(){
        return "titular: "+titular+" ,saldo: "+saldo;
    }
    public void render(){
        saldo*=taxaRendimento;

    }
    public void depositarDinheiro(){
        saldo+=100;
    }
    public void depositarDinheiro(int valor){
        saldo+=valor;
    }
    public double getTaxaJuros() {
        return taxaJuros;
    }
    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    
}
