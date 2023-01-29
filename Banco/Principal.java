package banco;

public class Principal {
    /**
     * @param args
     */
    public static void main(String[] args){
        Banco itau = new Banco("itau");
        Conta c1 = new Conta("bea", 4829, 5000);
        Conta c2 = new Conta("adriano", 3894);

        itau.adicionarConta(c1);
        itau.adicionarConta(c2);

        c1.depositarDinheiro(500);
        c2.depositarDinheiro(300);

        c1.sacarDinheiro(50);
        c2.sacarDinheiro(60);

        if(c1.transferirDinheiro(50, c2)){
            System.out.println("o novo saldo de c1 e:: "+c1.getSaldo());
            System.out.println("o novo saldo de c2 e:: "+c2.getSaldo());
        }
        Conta c = itau.procurarConta(4829);
        if (c==null){
            System.out.println("conta nao encontrada");
        }else{
            System.out.println("o saldo dessa conta e: "+c.getSaldo());
        }
    }
}
