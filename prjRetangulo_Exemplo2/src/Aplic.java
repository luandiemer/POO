
import fatec.poo.model.Retangulo;
import java.util.Scanner;
/**
 *
 * @author Luan
 */
public class Aplic {    
    public static void main(String[] args) {
        Retangulo objRet = new Retangulo();
        Scanner entrada = new Scanner(System.in);
        double medAlt, medBase;
        int opcao;
        //montar o retangulo
        
        System.out.println("Digite a medida da altura do retângulo: ");
        medAlt = entrada.nextDouble();
        
        System.out.println("Digite a medida da base do retângulo: ");
        medBase = entrada.nextDouble();
        
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        do{
            System.out.println("\n1-Consultar área do retângulo");
            System.out.println("2-Consultar perímetro do retângulo");
            System.out.println("3-Consultar diagonal do retângulo");
            System.out.println("4-Sair");
            System.out.println("\n\tDigite a opção: ");
            opcao = entrada.nextInt();
            if(opcao == 1){
                System.out.println("\nMedida da altura do retângulo: " + objRet.getAltura());
                System.out.println("Medida da base do retângulo: " + objRet.getBase());
                System.out.println("Medida da área do retângulo: " + objRet.calcArea());


            }else
                if(opcao == 2){
                System.out.println("\nMedida da altura do retângulo: " + objRet.getAltura());
                System.out.println("Medida da base do retângulo: " + objRet.getBase());
                System.out.println("Medida do perímetro do retângulo: " + objRet.calcPerimetro());
                }else
                    if(opcao == 3){
                System.out.println("\nMedida da altura do retângulo: " + objRet.getAltura());
                System.out.println("Medida da base do retângulo: " + objRet.getBase());
                System.out.println("Medida da diagonal do retângulo: " + objRet.calcDiagonal());
                }
        }while(opcao < 4);
        
    }
    
}
