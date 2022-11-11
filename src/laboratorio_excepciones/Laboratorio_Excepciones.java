package laboratorio_excepciones;
import javax.swing.JOptionPane;

/**
 *
 * @author Dirley Diaz
 */
public class Laboratorio_Excepciones {

    public static void main(String[] args) { 
        leer();
    }

    public static void leer(){
        //Bloque try catch donde lee los numeros enteros y verifica que no tenga letras.
        try {
            operacion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numerador:")), Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Denominador:")));
        } catch (NumberFormatException ex) {
            System.out.println("Intente otra vez. Usted ingreso algo diferente a un numero. " + ex.getMessage());
        }
    }
    public static void operacion(int a, int b) {
        try {
            //Bloque try catch donde verifica que este dividiendo por 0.
            try {
                System.out.println("Numerador: "+a+"\nDenominador: "+b+"\nResultado: "+(a/b)+"\n");
                
            } catch (ArithmeticException e) {
                System.out.println("\nError de division por 0: " + e.getMessage());
            }
            if((a/b) < 10) throw new Exception("\nEl resultado es menor a 10");
        } catch (Exception es) {      
            System.out.println("Resultado < 10"+es.getMessage());
        }
    }

}
