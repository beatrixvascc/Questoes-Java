package compras;

import java.util.ArrayList;

public class Compra {
    ArrayList<ItemDeCompra> produtos = new ArrayList<ItemDeCompra>();
    private double desconto;
    private double total;
    public void inserirItem(ItemDeCompra c){
        if (produtos.size() < 5)    //QUESTAO PEDIU NO MAXIMO 5
            produtos.add(c);
    }
    private double calcularTotalCompra(){
        for (ItemDeCompra item: produtos){
            total+=item.getValor();
        }
        return total;
    }
    public void darDesconto(int porcentagem){
        calcularTotalCompra();
        desconto = total*(porcentagem/100);
    }
    public void calcularTotalFinal(){
        System.out.println("o valor e de: "+(total-desconto));
    }
    public void gerarRelatorio(String tipoDePagamento, int prestacao){
        System.out.println("--- CUPOM FISCAL ---");
        System.out.println("os produtos comprados foram: "+produtos.toString());
        System.out.println("o desconto foi de: "+desconto);
        System.out.println("o tipo de pagamento e: "+ tipoDePagamento);
        calcularTotalFinal();
        System.out.println("a prestacao e de: "+(total-desconto)/prestacao);
    }
}
