/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.classes.teste;

import br.senac.classes.concretas.NavioPassageiro;

/**
 *
 * @author Leonardo
 */
public class Teste {
    public static void main(String[] args) {
        NavioPassageiro titanic = new NavioPassageiro("Titanic",100000,300,100);
        
        titanic.embarcarPassageiros(150);
        titanic.desembarcarPassageiros(250);
        titanic.apresentarQuantidadePassageirosEmbarcados();
    }
    
       
       
    
}
