package calculadora;

import java.util.Scanner;

public class Calculadora{
    private double num1, num2;
    private double res=0;
    int escolha;

    public Calculadora(double num1, double num2) {
        this.num1=num1;
        this.num2=num2;
    }
    public void add(){
        res = num1+num2;
        System.out.println(res);
    }
    public void subtracao(){
        res = num1-num2;
        System.out.println(res);
    }
    public void multiplicacao(){
        res = num1*num2;
        System.out.println(res);
    }
    public void divisao(){
        res = num1/num2;
        System.out.println(res);
    }
    public void limpar(){
        res = 0;
        System.out.println("o res foi zerado");
    }
    public void menu(){
        System.out.println("escolha uma opcao");
        System.out.println("0-sair");
        System.out.println("1-adicionar");
        System.out.println("2-subtrair");
        System.out.println("3-multiplicar");
        System.out.println("4-dividir");
        System.out.println("5-limpar");
        System.out.println("escolha: ");
    }
    public void calcular(){
        Scanner leitor = new Scanner(System.in);
        do{
            menu();
            escolha = leitor.nextInt();
            switch (escolha) {
            case 0:
                break;
            case 1:
                add();
                break;
            case 2:
                subtracao();
                break;
            case 3:
                multiplicacao();
                break;
            case 4:
                divisao();
                break;
            case 5:
                limpar();
                break;    
            default:
                System.out.println("opcao invalida");
                break;
            }
        }while(escolha!=0);
    }    
    public double getNum1() {
        return num1;
    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public double getNum2() {
        return num2;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    public double getRes() {
        return res;
    }
    public void setRes(double res) {
        this.res = res;
    }
    
}
