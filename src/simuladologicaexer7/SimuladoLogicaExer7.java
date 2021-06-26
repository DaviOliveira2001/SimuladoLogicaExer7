/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladologicaexer7;

import java.util.Scanner;

/**
 *
 * @author odavi
 */
public class SimuladoLogicaExer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int quantidadeGasolina, quantidadeAlcool, opcao;
        double valorGasolina, valorAlcool, precoGasolina, precoAlcool, desconto;
        opcao = 0; valorGasolina = 5.84; valorAlcool = 4.90;
        
        System.out.println("Informe o combustível escolhido:\n 1 - Gasolina\n 2 - Álcool");
        opcao = teclado.nextInt();
        if(opcao == 1){
            System.out.println("Informe a quantidade de gasolida abastecida:");
            quantidadeGasolina = teclado.nextInt();
            
            precoGasolina = quantidadeGasolina * valorGasolina;
           
            if(quantidadeGasolina <= 25){
                desconto = precoGasolina - (precoGasolina * 0.03);
                System.out.println("Seu desconto foi de 3%. A quantidade abastecida foi de "+quantidadeGasolina+" litros.");
                System.out.println("Preço com desconto: "+desconto+" R$.");
                System.out.println("Preço sem desconto: "+precoGasolina+" R$.");
            }else{
                desconto = precoGasolina - (precoGasolina * 0.05);
                System.out.println("Seu desconto foi de 5%. A quantidade abastecida foi de "+quantidadeGasolina+" litros.");
                System.out.println("Preço com desconto: "+desconto+" R$.");
                System.out.println("Preço sem desconto: "+precoGasolina+" R$.");
            } 
            if(opcao == 2){
            System.out.println("Informe a quantidade de álcool abastecida:");
                quantidadeAlcool = teclado.nextInt();
                
                precoAlcool = quantidadeAlcool * valorAlcool;
                   
                if(quantidadeAlcool <=25){
                desconto = precoAlcool - (precoAlcool * 0.02);
                System.out.println("Seu desconto foi de 2%. A quantidade abastecida foi de "+quantidadeAlcool+" litros.");
                System.out.println("Preço com desconto: "+desconto+" R$.");
                System.out.println("Preço sem desconto: "+precoAlcool+" R$.");
                }else{
                desconto = precoAlcool - (precoAlcool * 0.04);
                System.out.println("Seu desconto foi de 4%. A quantidade abastecida foi de "+quantidadeAlcool+" litros.");
                System.out.println("Preço com desconto: "+desconto+" R$.");
                System.out.println("Preço sem desconto: "+precoAlcool+" R$.");
                }
            }
        }
        
        
    }
    
}
