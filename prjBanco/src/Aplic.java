
import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 0030482211016
 */
public class Aplic {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); 
        DecimalFormat df = new DecimalFormat("#,##0.00");
                
        int num, opcao, i, conta;
        double valSaldo, valSaq, valDep;   
        
        ContaCorrente[] objConta = new ContaCorrente[15];
        for (i=0; i < 15; i++){
        System.out.print("Digite o número da conta: ");
        num = entrada.nextInt(); 
        System.out.print("Digite o valor do saldo inicial: ");
        valSaldo = entrada.nextDouble(); 
        
        
        //Instanciação do objeto da classe ContaCorrente
        //e fazer a chamada do método consturtor
         objConta[i] = new ContaCorrente(num, valSaldo);
        }
        do{
            System.out.println("\n\n1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Listar Contas");
            System.out.println("5 - Sair");
            System.out.print("\n\tDigite sua opção: ");
            opcao = entrada.nextInt();
                                                              
            switch (opcao){
                case 1 : 
                        System.out.print("\nDigite o número da conta: ");
                    num = entrada.nextInt();
                    System.out.print("Digite o valor do saque: ");
                    valSaq = entrada.nextDouble();
                    for (i = 0; i < objConta.length; i++) {
                        if (objConta[i] != null && objConta[i].getNumero() == num) {
                            if (valSaq <= objConta[i].getSaldo()) {
                                objConta[i].sacar(valSaq);
                            } else {
                                System.out.println("Saldo Insuficiente");
                            }
                            break;
                        }
                    }
                    break;
                
                case 2 :   
                    
                    System.out.print("\nDigite o número da conta: ");
                    num = entrada.nextInt();
                    System.out.print("Digite o valor do depósito: ");
                    valDep = entrada.nextDouble();
                    for (i = 0; i < objConta.length; i++) {
                        if (objConta[i] != null && objConta[i].getNumero() == num) {
                            objConta[i].depositar(valDep);
                            break;
                        }
                    }
                    break;
                    
                                          
                case 3 :  System.out.print("\nDigite o número da conta: ");
                    num = entrada.nextInt();
                    for (i = 0; i < objConta.length; i++) {
                        if (objConta[i] != null && objConta[i].getNumero() == num) {
                            System.out.println("\nNúmero da Conta Corrente: " + objConta[i].getNumero());
                            System.out.println("Valor do Saldo: " + df.format(objConta[i].getSaldo()));
                            break;
                        }
                    }
                    break;
                         
                case 4 : 
                      System.out.println("\n\tContas Cadastradas");
                        for (ContaCorrente contaAtual : objConta) {
                         if (contaAtual != null) {
                            System.out.println("Número da Conta Corrente: " + contaAtual.getNumero() + "\tSaldo: " + df.format(contaAtual.getSaldo()));
                           }
                        }
                    break;
            }            
        }while (opcao < 5);
    }    

    
}
