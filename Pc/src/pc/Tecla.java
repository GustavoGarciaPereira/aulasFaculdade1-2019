/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc;

/**
 *
 * @author usrlab25
 */
public class Tecla {
    public String simbolo;
    public int estado;
    public int codigo;
    
    
    public void subir(){
        this.estado = 0;
    }
    public int descer(){
        this.estado = 1;
        return codigo;
    }
}
