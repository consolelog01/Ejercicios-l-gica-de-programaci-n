package Binario;
import getBinario.getBinario;
import java.math.BigInteger;
import java.util.Scanner;

/*  
 * * * @author Ramón Martínez Cruz 
 */

public class Binario {

    /**
     * * @param args the command line arguments
     */
    private static BigInteger numeroDefault = new BigInteger("200");
    private static final getBinario Abecedario = new getBinario();
    private static String numeroBinario = "1";
    
    // --- Números     
    private static BigInteger menosUno = new BigInteger("-1");

    public static void main(String[] args) {

        try{
        
            System.out.println("Escriba el número que quiera convertir a binario:");
            Scanner leer = new Scanner(System.in);

            String numeroDecimal = leer.nextLine();
            BigInteger numeroDecimalBigInt = new BigInteger(numeroDecimal);

            /***
            *
            * -- Validaciones
            *
            ***/

            if ( numeroDecimalBigInt.compareTo(BigInteger.ZERO) != 0 ) {

                // --- Si el número introducido es menor a -1 ...
                if ( numeroDecimalBigInt.compareTo(menosUno) == -1 ) {
                    numeroDecimalBigInt = numeroDecimalBigInt.multiply(menosUno);
                }

                // --- Si el número introducido es mayor a 1 ...
                if ( numeroDecimalBigInt.compareTo(BigInteger.ONE) == 1 ) {

                    BigInteger divisor = new BigInteger("2");

                    // Se saca el primer número binario, que seria el residuo.             
                    BigInteger residuo = numeroDecimalBigInt.remainder(divisor);
                    getBinario.stringResiduos += residuo;

                    // --- Se sacan los demás números binarios, se ejecuta la función corr-             
                    // --- espondiente.             
                    Abecedario.getBinario(numeroDecimalBigInt);
                    StringBuilder stringBuilder = new StringBuilder(getBinario.stringResiduos);
                    numeroBinario = stringBuilder.reverse().toString();

                }

                System.out.println(numeroBinario);
        
            } else {
                System.out.println(BigInteger.ZERO);
            }        
        
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

}