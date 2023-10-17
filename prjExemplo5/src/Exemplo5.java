
/**
 *
 * @author euuuuuuuuuu
 */
public class Exemplo5 {
    public static void main(String[] args) {
        double numero, resultado;
        numero = Math.random() * 100;
        int x = 1;
        while ( x <= 10){
            resultado = numero * x;
            System.out.println(numero + " x " + x + " = " + resultado);
            x++;
        }
    }
    
}
