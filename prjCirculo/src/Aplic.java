
import fatec.poo.model.Circulo;
import java.util.Scanner;


/**
 *
 * @author euuuuuuuuuuuu
 */
public class Aplic {

    public static void main(String[] args) {
        Circulo objCirc = new Circulo();
        Scanner entrada = new Scanner(System.in);
        double medRaio;
        int opcao;
        
        System.out.println("Digite o raio do circulo: ");
        medRaio = entrada.nextDouble();
               
        objCirc.setRaio(medRaio);
        do{
            System.out.println("\n1-Consultar área do círculo");
            System.out.println("2-Consultar perímetro do círculo");
            System.out.println("3-Consultar diagonal do círculo");
            System.out.println("4-Sair");
            System.out.println("\n\tDigite a opção: ");
            opcao = entrada.nextInt();
            
             if(opcao == 1){
                System.out.println("Medida da área do círculo: " + objCirc.calcArea());
                System.out.println("Raio do circulo: "+ objCirc.getRaio());
             


            }else
                if(opcao == 2){
                System.out.println("Raio do circulo: "+ objCirc.getRaio());
                System.out.println("Medida do perímetro do círculo: " + objCirc.calcPerimetro());

                }else
                    if(opcao == 3){
                     System.out.println("Raio do circulo: "+ objCirc.getRaio());
                     System.out.println("Medida do diametro do círculo: " + objCirc.calcDiametro());
                    }
    }
        while(opcao <= 3);
    
    }
}
