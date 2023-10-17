
import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;
import java.text.DecimalFormat;

/**
*
* @author 0030482211022
*/
public class Aplic {

 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Instrutor objInstrutor = new Instrutor(2, "Rubens Frota", "(15)998679845");
    DecimalFormat df = new DecimalFormat("#,#0.0");

 

    objInstrutor.setAreaAtuacao("COF - Comitê Olimpico Fatecano");
    objInstrutor.setEmail("rubinhoruindadepura@fatec.sp.gov.br");

 

    
    System.out.println("Identificação: " + objInstrutor.getIdentificacao());
    System.out.println("Nome: " + objInstrutor.getNome());
    System.out.println("Telefone: " + objInstrutor.getTelefone());  
    System.out.println("Area de atuação: " + objInstrutor.getAreaAtuacao());
    System.out.println("E-mail: " + objInstrutor.getEmail());


 

    Cliente objCliente = new Cliente ("123445678-09", "Jorge Amado", "(15)997145903");
    objCliente.setAltura(1.80);
    objCliente.setPeso(85);
    objCliente.setEmail("jorgin13@fatec.sp.gov.br");

 

    System.out.println("\n\tINFORMAÇÕES CLIENTE");
    System.out.println("CPF: " + objCliente.getCpf());
    System.out.println("Nome: " + objCliente.getNome());
    System.out.println("E-mail: " + objCliente.getEmail());
    System.out.println("Telefone: " + objCliente.getTelefone());
    System.out.println("Altura: " + objCliente.getAltura() + "m");
    System.out.println("Peso: " + objCliente.getPeso() + "kg");
    System.out.println("IMC: " + df.format(objCliente.calcIMC()));

 

    
    }

}