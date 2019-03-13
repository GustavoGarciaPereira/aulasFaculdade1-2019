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
    
    LinkedList<Cliente> clientes = 
            new LinkedList<Cliente>();
    Servidor servidor = new Servidor();
    
    
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
    public int atendimentoFila(){
        int tempoTotalAtendimento=0;
        int tamanho = this.clientes.size();
        for(int x=0;x<tamanho;x++){
            Cliente cliente = this.clientes.get(x);
            tempoTotalAtendimento+=this.servidor.atendeCliente(cliente);
        }
        return tempoTotalAtendimento;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        Fila filaClientes = new Fila();
        filaClientes.servidor.setVelAtendimento(2);
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
        System.out.println("tempo atendimento fila: "+filaClientes.atendimentoFila()+ " segundos");
        
    }
    
}
