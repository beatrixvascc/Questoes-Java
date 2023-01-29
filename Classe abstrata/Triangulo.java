package classeAbstrata;

public class Triangulo extends Figura{
    private float altura;
    private float base;
    private float l1;
    private float l2;
    public Triangulo(float altura, float base, float l1, float l2){
        this.altura = altura;
        this.base = base;
        this.l1=l1;
        this.l2=l2;
    }
    @Override
    public double calcularArea() {
        return (base*altura)/2;
    }
    @Override
    public double calcularPerimetro() {
        return base+l1+l2;
    }
    
}
