/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;


import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Mirkos
 */

public class Fila {
    static Fila filaClientes = new Fila();
    static LinkedList<Cliente> clientes = 
            new LinkedList<Cliente>();
    static Servidor servidor = new Servidor();
    static Servidor servidor2 = new Servidor();

    
    
    public void mostraFila(){
        int tamanho = clientes.size();
        for(int y=0;y<tamanho;y++){
            System.out.print("<<"+(
                    (Cliente)clientes.get(y)).getNumItens()+" id: "+((Cliente)clientes.get(y)).getIdCliente()+">> \t");
        }
        System.out.println("\n");
    }
    

    
    /**
     * SERVIÇO
     * @return 
     */
//    public int atendimentoFila(){
//        int tempoTotalAtendimento=0;
//        int tamanho = this.clientes.size();
//        for(int x=0;x<tamanho;x++){
//            Cliente cliente = this.clientes.get(x);
//            tempoTotalAtendimento+=this.servidor.atendeCliente(cliente);
//        }
//        return tempoTotalAtendimento;
//    }
    
    public void atendeFila(){
        Random random = new Random();
        System.out.println("Atendendo Fila:" );
        for(int x=0; x<this.clientes.size(); x++){
            if(x%4 == 0){
                Cliente cli = new Cliente();
                cli.setNumItens(random.nextInt(10)+1);
                cli.setIdCliente(x+1);
                cli.setProiridade(random.nextInt(3)+1);
                filaClientes.clientes.add(cli);
                System.out.println("Foi criada com sucesso!!");
            }
            
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        
        filaClientes.servidor.setVelAtendimento(2);
        filaClientes.servidor2.setVelAtendimento(3);
        
        System.out.println("Velocidade atendimento servidor: "+
                filaClientes.servidor.getVelAtendimento());
        System.out.println("Clientes:");
        for(int x=0;x<7;x++){
            Cliente cli = new Cliente();
            cli.setNumItens(random.nextInt(20)+1);
            cli.setIdCliente(x+1);
            filaClientes.clientes.add(cli);
        }
        filaClientes.mostraFila();
        
        
        
        for(int i=0; i < clientes.size(); i++){
            if(servidor.tempoFila == servidor2.tempoFila){
                //escolhe qualquer um
                System.out.println("o ID "+clientes.get(i).getIdCliente()+" esta sendo atendido pelo servidor 1");
                
                servidor.atenderCliente(clientes.get(i).getIdCliente(),clientes.get(i).getNumItens());
                System.out.println("Tempo da fila 1 atualizado: "+servidor.tempoFila);
                
                System.out.print("\n");
            }
            //se o servidor1 tem tempo menor
            else if(servidor.tempoFila < servidor2.tempoFila){
                //manda para o servidor 1
                System.out.println("o ID "+clientes.get(i).getIdCliente()+" esta sendo atendido pelo servidor 1");
                servidor.atenderCliente(clientes.get(i).getIdCliente(),clientes.get(i).getNumItens());
                System.out.println("Tempo da fila 1 atualizado: "+servidor.tempoFila);
        
                System.out.print("\n");
            }
            //se o servidor2 tem tempo menor
            else if(servidor2.tempoFila < servidor.tempoFila){
                //manda para o servidor 2
                System.out.println("o ID "+clientes.get(i).getIdCliente()+" esta sendo atendido pelo servidor 2");
                servidor2.atenderCliente(clientes.get(i).getIdCliente(),clientes.get(i).getNumItens());
                    System.out.println("Tempo da fila 2 atualizado: "+servidor2.tempoFila);
        
                    System.out.print("\n");
            }
        }
        filaClientes.atendeFila();
        //System.out.println("tempo atendimento fila: "+filaClientes.atendeFila()+ " segundos");
        
    }
    
}
