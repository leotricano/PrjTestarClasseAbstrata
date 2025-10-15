/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.classes.concretas;

import br.senac.classes.abstratas.Navio;

/**
 *
 * @author Leonardo
 */
public class NavioPassageiro extends Navio{
private int totalPassageirosEmbarcados ,numeroPassageiros;

//---------------------------GetSet-------------------------------------

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    



//-------------------Construtores----------------------------------------
    public NavioPassageiro() {
        super();
    }
    
    public NavioPassageiro(String nome, long peso,
          int comprimento, int numeroPassageiros) {
        super(nome, peso, comprimento);
        this.numeroPassageiros = numeroPassageiros;
        
     }
    
    public NavioPassageiro(int numeroPassageiros ,String nome, long peso,
            int comprimento ) {
        this.setNome(nome);
        this.setPeso(peso);
        this.setComprimento(comprimento);
        this.numeroPassageiros = numeroPassageiros;
        
    }
 //------------------------Metodos-------------------------------   
    
    public int calcularCapacidadePermitida() {
    int capacidade = (int)((getPeso() / 1000) + (getComprimento() / 2));
    return capacidade;
}


    public void embarcarPassageiros(int embarcarPassageiros){
        
        
        System.out.println("Tentativa de embarque");
        System.out.println("------------------AVISO--------------------");
        System.out.println("Capacidade permitida: " + numeroPassageiros);
        

        System.out.println("----------------------UPDATE--------------------");
        System.out.println("Passageiros embarcados: "
                +totalPassageirosEmbarcados 
                + " + passageiros embarcando: " 
                + embarcarPassageiros + " Total ");
        
          int testeLogicoPassageiro = totalPassageirosEmbarcados 
                  + embarcarPassageiros;
          
        if(testeLogicoPassageiro == numeroPassageiros ){
            totalPassageirosEmbarcados += embarcarPassageiros ;
            System.out.println("-------------------AVISO---------------------------");
            System.out.println("Navio alcançou sua capacidade "
                    + "máxima de passageiros.");
        }else if(testeLogicoPassageiro > numeroPassageiros){
            System.out.println("-------------------AVISO---------------------------");
            System.out.println("Navio ultrapassou a capacidade permitida,"
                    + " por favor desembarquem");
        }else{
            System.out.println("-------------------AVISO---------------------------");
            System.out.println("Embarcando " + embarcarPassageiros +
                " passageiros no navio " + this.getNome()); 
            totalPassageirosEmbarcados += embarcarPassageiros;
            
            
            System.out.println("-------------------UPDATE---------------------------");
            System.out.println("Total de " + totalPassageirosEmbarcados +
                " passageiros no navio " + this.getNome()); 
        }
    }
    
    public void desembarcarPassageiros(int desembarcarPassageiros){
        
        System.out.println("-------------------AVISO---------------------------");      
        System.out.println("Passageiros embarcados: " 
                + totalPassageirosEmbarcados 
                + " passageiros desembarcando: " 
                + desembarcarPassageiros );
        
        if(desembarcarPassageiros == totalPassageirosEmbarcados){
            totalPassageirosEmbarcados -= desembarcarPassageiros;
            
            
            System.out.println("----------------------AVISO--------------------");    
            System.out.println("Navio vazio");
            
        }else if(desembarcarPassageiros > numeroPassageiros){
            System.out.println("----------------------AVISO--------------------");
            System.out.println("Impossivel, sistema corropido, reseta o Windows");
    }else{
            totalPassageirosEmbarcados -= desembarcarPassageiros;
            
            System.out.println("-------------------AVISO---------------------------");
            System.out.println("Estão sendo desembarcadas: " 
                    + totalPassageirosEmbarcados 
                    + " Pessoas");
        }
    }
    
    public void apresentarQuantidadePassageirosEmbarcados(){
        System.out.println("----------------------UPDATE--------------------");
        System.out.println("Temos " + totalPassageirosEmbarcados 
                + " passageiros embarcados no navio " + this.getNome());
    }
   
    public void desembarcarTodosOsPassageiros(){
        if(numeroPassageiros > 0){
            System.out.println("----------------------AVISO--------------------");
            System.out.println("Desembarcando imediatamente "
                    + "todos os passageiros");
            
            totalPassageirosEmbarcados = 0;
        }else{
            System.out.println("----------------------AVISO--------------------");
            System.out.println("Não tem nenhum passageiro no navio " + this.getNome());
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
