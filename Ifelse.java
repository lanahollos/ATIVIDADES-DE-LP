/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ifelse;

import javax.swing.JOptionPane;

/**
 *
 * @author Sitio Nosso Lar
 */
public class Ifelse {
     // um aluno realizou três provas de uma disciplina. este programa irá mostrar a sua média e se ele foi aprovado ou reprovado.

    public static void main(String[] args) {
        int n1, n2, n3, media, rec, mediafinal = 0;
        String prinum, segum,ternum,recnum;
        prinum = JOptionPane.showInputDialog("digite sua primeira nota");
        segum = JOptionPane.showInputDialog("digite sua segunda nota");
        ternum = JOptionPane.showInputDialog("digite sua terceira nota");
        
        n1 = Integer.parseInt(prinum);
        n2 = Integer.parseInt(segum);
        n3 = Integer.parseInt(ternum);
        
        media = (n1+n2+n3)/3;
        
        JOptionPane.showMessageDialog(null, "a media é " + media);
        
        if (media >= 7){
            JOptionPane.showMessageDialog(null, "Parabéns, você foi aprovado! Boas férias!");
        }
        else if ( media < 7){
            recnum = JOptionPane.showInputDialog("digite sua nota da recuperação");
            rec = Integer.parseInt(recnum);
            mediafinal = (media+rec)/2;
            JOptionPane.showMessageDialog(null, "sua media final é: " + mediafinal);
         if (mediafinal >= 5){
            JOptionPane.showMessageDialog(null, "Você foi aprovado!! Essa foi por pouco, em?!");
         }
         else if (mediafinal < 5){
            JOptionPane.showMessageDialog(null, "Você foi reprovado! Acho que as férias nao serão muito boas esse ano, em?!");
         }
        
        }
        
                
        
    }
}
