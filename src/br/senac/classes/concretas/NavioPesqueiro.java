/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.classes.concretas;

import br.senac.classes.abstratas.Navio;
import br.senac.classes.tipoPesca.TipoPesca;

/**
 *
 * @author Leonardo
 */
public class NavioPesqueiro extends Navio {
    private int capacidade;
    private TipoPesca tipoPesca;
    private int totalPescadoEmbarcado;

    public NavioPesqueiro() {
    }

    public NavioPesqueiro(int capacidade, TipoPesca tipoPesca,
            String nome, long peso, int comprimento) {
        super(nome, peso, comprimento);
        this.capacidade = capacidade;
        this.tipoPesca = tipoPesca;
    }
    
    public NavioPesqueiro(String nome, long peso, int comprimento,
            int capacidade, TipoPesca tipoPesca) {
        this.capacidade = capacidade;
        this.tipoPesca = tipoPesca;
        this.setNome(nome);
        this.setPeso(peso);
        this.setComprimento(comprimento);
        
    }
    
    public void Pescar(int pescar){
        System.out.println("Voce pescou ..." + pescar + " parabens!");
        int testarCapacidade = 0;
        testarCapacidade = pescar + totalPescadoEmbarcado;
        if(testarCapacidade > capacidade){
            System.out.println("Vamos ter que soltar os peixe no mar,"
                    + " pescamos mais do que deveria O_O");
            
        }else if(testarCapacidade == capacidade) {
            totalPescadoEmbarcado += pescar;
            System.out.println("Vamos voltar pegamos até encher,"
                    + " vamos marinheiroooooooos");
            System.out.println("Pegamos total de " + totalPescadoEmbarcado
                    + " peixes");
        }else if (pescar < 0){
            System.out.println("Como você conseguiu essa maestria"
                    + " meu bom marinheiro? Ta comendo o peixe?");
        }else if (pescar == 0){
            System.out.println("Ta ruim ae? kkkkkkkkkkkk");
        }
        
        else{
            totalPescadoEmbarcado += pescar;
            System.out.println("Você tem um total de " +
                    totalPescadoEmbarcado + " brabo!");
        }
        
        
    }
    public void apresentarQuantidadeDePescado(){
            System.out.println("Você pescou um total de " 
                    + totalPescadoEmbarcado 
                    + " peixes");
        }
    public void desembarcarTodoPescado(){
       
        if(totalPescadoEmbarcado <= 0 ){
            System.out.println("Nenhum peixe para desembarcar");
    }else{
            System.out.println("Todo peixe foi desembarcado");
            totalPescadoEmbarcado = 0;
        }
    }
    @Override
    public void partir() {
        
    }

    @Override
    public void navegar() {
        
    }

    @Override
    public void parar(){
        
    }

    @Override
    public void atracar() {
        
    }
    
}
