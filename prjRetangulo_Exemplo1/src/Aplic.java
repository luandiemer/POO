
import fatec.poo.model.Retangulo;

/**
 *
 * @author Luan
 */
public class Aplic {

   
    public static void main(String[] args) {
        Retangulo objRet; //definição de ponteiro
        
        objRet = new Retangulo(); //instanciação do objeto da classe Retangulo
        
        //mecanismo de passagem de mensagem
        objRet.setAltura(5.0);
        objRet.setBase(8.0);
        System.out.println("Medida da área do Retângulo: " + objRet.calcArea());
        System.out.println("Medida do perímetro do Retângulo: " + objRet.calcPerimetro());
    }
    
}
