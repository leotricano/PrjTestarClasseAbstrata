/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.classes.teste;

import br.senac.classes.concretas.NavioPassageiro;
import br.senac.classes.concretas.NavioPesqueiro;
import static br.senac.classes.tipoPesca.TipoPesca.ATUM;

/**
 *
 * @author Leonardo
 */
public class Teste {
    public static void main(String[] args) {
       /* NavioPassageiro titanic = new NavioPassageiro("Titanic",100000,300,1000);
        
        titanic.embarcarPassageiros(100);
        titanic.desembarcarPassageiros(10);
        System.out.println("");
        titanic.apresentarQuantidadePassageirosEmbarcados();
        titanic.desembarcarTodosOsPassageiros();
        System.out.println("");
        titanic.embarcarPassageiros(1000);
        titanic.desembarcarPassageiros(300);
        System.out.println("");
*/
       NavioPesqueiro Britannic = new NavioPesqueiro("Britanic", 10, 100, 500, ATUM);
       /*Britannic.Pescar(100);
       Britannic.Pescar(0);
        Britannic.Pescar(-1);
        Britannic.Pescar(400);
      */  Britannic.Pescar(1000);
        Britannic.apresentarQuantidadeDePescado();
        Britannic.desembarcarTodoPescado();
    }
    
       
       
    
}
