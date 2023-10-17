import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;
import java.util.Calendar;


/**
 *
 * @author Dimas
 */

public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");        
               
        PessoaFisica pf = new PessoaFisica("123.456.789-00", "Carlos Silveira",2010);
        PessoaJuridica pj = new PessoaJuridica("12.345.687/0001-11","Computec Soluções", 2015);
        
        pf.addCompras(5000);
        pf.addCompras(4500);
        pf.addCompras(6500);
        pf.setBase(150);
        
        pj.setTaxaIncentivo(1);
        pj.addCompras(1000);
        pj.addCompras(2000);
        pj.addCompras(3000);
        pj.addCompras(4000);        
        
        System.out.println("Ano Atual: " + 2023);
        System.out.println("\nPessoa Física");
        System.out.println("CPF: " + pf.getCPF());
        System.out.println("Nome: " + pf.getNome());  
        System.out.println("Ano Inscrição: " + pf.getAnoInscricao());
        System.out.println("Total das Compras: " + df.format(pf.getTotalCompras()));
        System.out.println("Base: " + df.format(pf.getBase()));
        System.out.println("Bonus: " + df.format(pf.calcBonus(2023)));
        
        System.out.println("\n\nPessoa Jurídica");
        System.out.println("CGC: " + pj.getCGC());
        System.out.println("Nome: " + pj.getNome());  
        System.out.println("Ano Inscrição: " + pj.getAnoInscricao());
        System.out.println("Total das Compras: " + df.format(pj.getTotalCompras()));
        System.out.println("Taxa Incentivo: " + pj.getTaxaIncentivo() + "%");
        System.out.println("Bonus: " + pj.calcBonus(2023));
    }
}
