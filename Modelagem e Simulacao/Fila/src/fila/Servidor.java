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
public class Servidor {
    
    //característica
    private int VelAtendimento;//velocidade de atendimento

    /**
     * @return the VelAtendimento
     */
    public int getVelAtendimento() {
        return VelAtendimento;
    }

    /**
     * @param VelAtendimento the VelAtendimento to set
     */
    public void setVelAtendimento(int VelAtendimento) {
        this.VelAtendimento = VelAtendimento;
    }
    
    //comportamento
    public int atendeCliente(Cliente cli){
        return cli.getNumItens()/this.getVelAtendimento();
    }
    
}
