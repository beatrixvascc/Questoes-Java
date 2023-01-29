package classeAbstrata;

public class Circulo extends Figura {
    private double pi = 3.14;
    private float raio;
    public Circulo(float raio){
        this.raio=raio;
    }
    @Override
    public double calcularArea() {
        return raio*raio*pi;
    }
    @Override
    public double calcularPerimetro() {
        return 2*pi*raio;
    }
}
