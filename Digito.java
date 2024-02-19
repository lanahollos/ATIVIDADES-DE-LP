/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package digito;

import javax.swing.JOptionPane;

/**
 *
 * @author Sitio Nosso Lar
 */
public class Digito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int digitos = 0;
        String num;
        num = JOptionPane.showInputDialog("digite um numero");
        int numero = Integer.parseInt(num);
        if (numero == 0){
            JOptionPane.showMessageDialog(null, "o número 0 tem 1 digito");
        } else {
            
           while ( numero != 0){
            numero = numero / 10;
            digitos++;
           }
          JOptionPane.showMessageDialog(null, "o numero " + num + " tem " + digitos + " digitos"); 
        } 
        
               
    }
   
    
}
