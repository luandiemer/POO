package fatec.poo.model;

/**
 *
 * @author 0030482211016
 */
public class Circulo {
    private double raio;
    
    public void setRaio(double r){
        raio = r;
    }
    
    public double getRaio(){
        return (raio);
    }
    
    public double calcArea(){
        return (3.1416 * (Math.pow(raio, 2)));
    }
    
    public double calcPerimetro(){
        return (2 * 3.1416 * raio);
    }
    
    public double calcDiametro(){
        return (raio * 2);
    }
    
}
