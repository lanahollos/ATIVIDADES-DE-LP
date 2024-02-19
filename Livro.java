/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.livro;

import javax.swing.JOptionPane;

/**
 *
 * @author Sitio Nosso Lar
 */
public class Livro {

    public static void main(String[] args) {
        float  critA, critB;
        JOptionPane.showMessageDialog(null, "Olá, muito obrigada por vir comprar em nossa loja. Veja só os descontos desse mês:\n desconto A:\n R$ 0,25 por livro + R$ 7,50 fixo.\n" + "desconto B:\n R$ 0,50 por livro + R$ 2,50 fixo.");
        String livro = JOptionPane.showInputDialog("Diga a quantidade de livros que você deseja comprar, e veja qual deles é melhor para voce!");
        float livrinho = Integer.parseInt(livro);
        critA = (float) ((0.25 * livrinho) + 7.50);
        critB = (float) ((0.50 * livrinho) + 2.50);
        if ( critA > critB ){
            JOptionPane.showMessageDialog(null, "Recomendamos que voce pegue o desconto B! :)");
        }
        
        else if ( critA == critB ){  
            JOptionPane.showMessageDialog(null, "Com esse quantidade de livros, tanto o desconta A quanto o desconto B servem para voce! :)");
        
        }
        
        if ( critB > critA){
            JOptionPane.showMessageDialog(null, "Recomendamos que você pegue o desconto de A! :)");
        } 
        
    }
}
