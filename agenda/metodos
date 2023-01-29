package agenda;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
    int aux=0;

    public void adicionar(Pessoa p){
        if(lista.contains(p)){
            System.out.println("essa pessoa ja foi adicionada");
        }else{
            lista.add(p);
        }
    }
    public Pessoa procurar(String nome, int telefone){
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i).getNome()==nome && lista.get(i).getTelefone()==telefone){
                return lista.get(i);
            }
        }
        return null;
    }
    public Pessoa alterar(int telefone,int novoTelefone){
        for (int i=0; i<lista.size(); i++){
            if (lista.get(i).getTelefone()==telefone){
                //novoTelefone = lista.get(i).getTelefone();
                lista.get(i).setTelefone(novoTelefone);
                return lista.get(i);
            }
        }
        return null;
    }    
    public boolean remover(Pessoa p, int posicao){
        if (lista.contains(p)){
            lista.remove(posicao);
            return true;
        }else{
            return false;
        }
    }
    public void mostrarPessoas(){
        for (Pessoa pessoa : lista) {
            System.out.println(pessoa.getNome()+" "+pessoa.getTelefone());
        }
    }
}
