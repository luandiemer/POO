
import fatec.poo.model.FuncionarioComissionado;
import java.text.DecimalFormat;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;

/**
 *
 * @author euuuuuuuuuu
 */
public class Aplic {


    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.80);
        funcHor.setCargo("Mercante");
        funcHor.setQtdeHorTrab(90);
            
            System.out.println("Registro         =>   " + funcHor.getRegistro());
            System.out.println("Nome             =>   " + funcHor.getNome());
            System.out.println("Cargo            =>   " + funcHor.getCargo());
            System.out.println("Data de Admissão =>   " + funcHor.getDtAdmissao());
            System.out.println("Salário Bruto    =>   " + df.format(funcHor.calcSalBruto()));
            System.out.println("Desconto         =>   " + df.format(funcHor.calcDesconto()));
            System.out.println("Gratificação     =>   " + df.format(funcHor.calcGratificacao()));
            System.out.println("Salário Liquído  =>   " + df.format(funcHor.calcSalLiquido()));

        
       FuncionarioMensalista funcMens = new FuncionarioMensalista(1020,"Jorginho me empresta a 12", "30/03/2000", 1320);
       funcMens.setCargo("Pastor");
       funcMens.setNumSalMin(2);
       
            System.out.println("\n\nRegistro     =>   " + funcMens.getRegistro());
            System.out.println("Nome             =>   " + funcMens.getNome()); 
            System.out.println("Cargo            =>   " + funcMens.getCargo());
            System.out.println("Data de Admissão =>   " + funcMens.getDtAdmissao());
            System.out.println("Salário Bruto    =>   " + df.format(funcMens.calcSalBruto()));
            System.out.println("Desconto         =>   " + df.format(funcMens.calcDesconto()));
            System.out.println("Salário Liquído  =>   " + df.format(funcMens.calcSalLiquido()));   
            
            
       FuncionarioComissionado funcCom = new FuncionarioComissionado(1030, "Cleitinho do pneu", "24/12/2002", 10);
       funcCom.setCargo("Caminhoneiro");
       funcCom.setSalBase(900);
       funcCom.addVendas(1000);
       funcCom.addVendas(3000);
       funcCom.addVendas(4000);
       
       
            System.out.println("\n\nRegistro     =>   " + funcCom.getRegistro());
            System.out.println("Nome             =>   " + funcCom.getNome()); 
            System.out.println("Cargo            =>   " + funcCom.getCargo());
            System.out.println("Data de Admissão =>   " + funcCom.getDtAdmissao());
            System.out.println("Salário Base     =>   " + df.format(funcCom.getSalBase())); 
            System.out.println("Salário Bruto    =>   " + df.format(funcCom.calcSalBruto()));
            System.out.println("Total de vendas  =>   " + funcCom.getTotalVendas());
            System.out.println("Taxe de comissão =>   " + funcCom.getTaxaComissao());
            System.out.println("Desconto         =>   " + df.format(funcCom.calcDesconto()));
            System.out.println("Gratificação     =>   " + df.format(funcCom.calcGratificacao()));          
            System.out.println("Salário Liquído  =>   " + df.format(funcCom.calcSalLiquido()));   
       
    }
    
}
