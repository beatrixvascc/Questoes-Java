package classeAbstrata;

public class Quadrado extends Figura {
    private float lado;
    public Quadrado(float lado){
        this.lado = lado;
    }
    @Override
    public double calcularArea() {
        return lado*lado;
    }
    @Override
    public double calcularPerimetro() {
        return lado*4;
    }
    
}
