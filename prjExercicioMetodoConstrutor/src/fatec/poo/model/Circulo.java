
    package fatec.poo.model;

/**
 *
 * @author 0030482211016
 */
public class Circulo {
    
    private double raio;
    private String unidadeMedida;
    
    public Circulo(String unimed){
        unidadeMedida = unimed;
    }
    
  

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

    public String getUnidadeMedida() {
        return unidadeMedida;
    }
    
    
    public double calcDiametro(){
        return (raio * 2);
    }
    
}

