package getBinario;
import java.math.BigInteger;

/**
 * * * @author TI Desarrollo Soft
 */

public class getBinario {

    public static String stringResiduos = "";

    public void getBinario(BigInteger intNumber) {
        
    
        BigInteger divisor = new BigInteger("2");
        BigInteger resultadoOperacion = intNumber.divide(divisor); 
        // resultado         
        BigInteger residuo = resultadoOperacion.remainder(divisor); 
        // residuo                  
        if ( resultadoOperacion.equals(BigInteger.ONE) ) {             
            getBinario.stringResiduos += resultadoOperacion;         
        } else {             
            getBinario.stringResiduos += residuo;             
            BigInteger a = new BigInteger(resultadoOperacion.toString());             
            getBinario( a );         
        } 
        
    }    
    
}
