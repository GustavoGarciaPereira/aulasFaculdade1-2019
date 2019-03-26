/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author gustavo
 */
public class Comunica {
    
    String mensagem = "";
    
    public void trocaMensagem(String m) {
        synchronized (this) {
        this.mensagem = "mesagem";
        }
    }
    
}
