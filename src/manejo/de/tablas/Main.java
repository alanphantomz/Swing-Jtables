/*
 * Demuestra el uso de una tabla, basicamente esta aplicacion
 * permite ingresar los datos de N empleados, los cuales a medida
 * que se ingresan son adicionados en la tabla
 */
package manejo.de.tablas;

import gui.TablasTest;

/**
 *
 * @author alan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TablasTest miFrame = new TablasTest();
        
         //Ventana centrada
        miFrame.setLocationRelativeTo(null);
        
        //Ventana visible
        miFrame.setVisible(true); 
    }
    
}
