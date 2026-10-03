/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimnasio.utilerias;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author CUTT 5
 */
public class UtileriasValidacion {
    
    private static final String EMAIL = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    private static final String TELEFONO = "^[1-9]{1}[0-9]{9}$";

    public boolean formatosCorrectos(String expresionregular, String cadenaavalidar) {

        Pattern patron = null;
        switch (expresionregular) {
            case "email":
                System.out.println("validacion de email");
                patron = Pattern.compile(EMAIL);
                break;
            
            case "numeros":
                System.out.println("validacion de numeros");
                patron = Pattern.compile(TELEFONO);
                break;
            default:
                throw new AssertionError();
        }

        
        Matcher comparador = patron.matcher(cadenaavalidar);
        
        return comparador.matches();
    }
}
