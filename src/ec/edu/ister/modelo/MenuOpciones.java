
package ec.edu.ister.modelo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class MenuOpciones {
    public static void seleccionOpciones(){   
        int opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "\tBienvenido al sistema de menú\n" 
                  +"\nOpciones:"
                  +"\n1.Suma de 2 números"
                  +"\n2.Control de flujo"
                  +"\n3.Salir")); 
           
        switch (opcion){
            
            case 1:
                int m = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese #"));
                int n = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese #"));
                OperacionesBasicas.sumaConParametros(m,n);
                break;
                
            case 2:
                ControlFlujo.ifAnidado();
                break;
            default:
                JOptionPane.showMessageDialog(null,"Usted a culminado el uso de la aplicación");
              
        }
        
        
               }
}

         
       
        


        
       
    
        
    
