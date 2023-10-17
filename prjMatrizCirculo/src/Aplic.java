
import fatec.poo.model.Circulo;
import java.text.DecimalFormat;
import java.util.Scanner;


/**
 *
 * @author euuuuuuuuu
 */
public class Aplic {


    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);       
       String unidade;
       double medRaio;      
       int i;
       DecimalFormat df = new DecimalFormat("#,##0.00");


       
       //definição de uma matriz de objetos 
       //para classe Circulo
       Circulo[] matCirc = new Circulo[10];
       
       
       for (i=0; i < 3; i++){
            System.out.println("\n\nDigite a unidade de medida: ");
            unidade = entrada.next();  
       
            //instanciação do objeto da classe Circulo
            //e chamada do método construtor
            matCirc[i] = new Circulo(unidade);
            
       
            System.out.println("Digite a medida do Raio: ");
            medRaio = entrada.nextDouble();       
            
            //passagem de mensagens
            matCirc[i].setRaio(medRaio);
            
        }     
       
        //acessando matriz de objetos
        for (i=0; i < 3; i++){                         //passagem de mensagens
            System.out.println("\n\nObjeto Circulo " + (i+1)); 
	    System.out.println("\nMedida do raio: " + matCirc[i].getRaio() + " " + matCirc[i].getUnidadeMedida());
            System.out.println("Área: " + df.format(matCirc[i].calcArea()) + " " + matCirc[i].getUnidadeMedida() + "²"); 
            System.out.println("Perímetro: " + df.format(matCirc[i].calcPerimetro()) + " " + matCirc[i].getUnidadeMedida());
        }   		   
    }   
}
    

