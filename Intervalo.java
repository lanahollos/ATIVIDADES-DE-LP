/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intervalo;

import java.util.Scanner;

/**
 *
 * @author Sitio Nosso Lar
 */
public class Intervalo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int somaS, somaM, somaH, diferencaS, diferencaM, diferencaH, seg, min, h, horas, minutos, segundos;
        Scanner s = new Scanner (System.in);
        System.out.println("diga as horas do primeiro intervalo");
        h = s.nextInt();
        System.out.println("diga os minutos do primeiro intervalo");
        min = s.nextInt();
        System.out.println("diga os segundos do primeiro intervalo");
        seg = s.nextInt();
        System.out.println("diga as horas do segundo intervalo");
        horas = s.nextInt();
        System.out.println("diga os minutos do segundo intervalo");
        minutos = s.nextInt();
        System.out.println("diga os segundos do segundo intervalo");  
        segundos = s.nextInt();
        
        somaS = seg + segundos;
        somaM = min + minutos;
        somaH = h + horas;
        diferencaS = seg - segundos;
        diferencaM = min - minutos;
        diferencaH = h - horas;
        
        if (somaS >= 60){
            somaS -= 60;
            somaM++;
        }      
   
        if (somaM >= 60){
            somaM -= 60;
            somaH++;
        }
        
        if (diferencaS <= -1){
            diferencaS += 60;
            diferencaM -= 1;
            }
        
        if (segundos > seg){
            diferencaS = segundos - seg;
        }
        
        if (diferencaM <= -1){
            diferencaM += 60;
            diferencaH -= 1;
        }
        
         if (minutos > min){
            diferencaM = minutos - min;
        }
        
        if (horas > h ){
            diferencaH = horas - h;
        }
        

        
        System.out.println("A soma dos intervalos e " + somaH + ":" + somaM + ":" + somaS + "." );
        System.out.println("A diferenca dos intervalos e " + diferencaH + ":" + diferencaM + ":" + diferencaS + ".");

    }
    
}
