/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

/**
 *
 * @author usrlab25
 */
public class Cliente {
    
    private int numItens;
    private int idCliente;
    private int prioridade;
    /**
     * @return the numItens
     */
    public int getNumItens() {
        return numItens;
    }

    /**
     * @param numItens the numItens to set
     */
    public void setNumItens(int numItens) {
        this.numItens = numItens;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public int getIdCliente() {
        return idCliente;
    }
    
    public int getProiridade(){
        return prioridade;
    }
    
    public void setProiridade(int prioridade){
        this.prioridade = prioridade;
    }
}
