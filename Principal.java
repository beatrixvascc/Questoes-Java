package agenda;

public class Principal {
    public static void main(String[] args){
        Agenda moleskini = new Agenda();
        Pessoa p1 = new Pessoa("killua", 45678965);
        Pessoa p2 = new Pessoa("gon", 34568765);
        Pessoa p3 = new Pessoa("kurapika", 67584932);

        moleskini.adicionar(p1);
        moleskini.adicionar(p2);
        moleskini.adicionar(p3);

        Pessoa p = moleskini.alterar(45678965, 56473892);
        if (p==null){
            System.out.println("nao foi encontrada a pessoa e nao ha como alterar\n");
        }else{
            System.out.println("o telefone foi alterado para: "+p.getTelefone());
        }


        Pessoa c = moleskini.procurar("gon", 34568765);
        if (c==null){
            System.out.println("nao foi encontrada\n");
        }else{
            System.out.println("a pessoa foi encontrada e tem nome e telefone: "+c.getNome()+"-"+c.getTelefone());
        }
        
        moleskini.remover(p1, 1); 

        p1.mostrarDados();
        p2.mostrarDados();
        p3.mostrarDados();

        moleskini.mostrarPessoas();

    }
}
