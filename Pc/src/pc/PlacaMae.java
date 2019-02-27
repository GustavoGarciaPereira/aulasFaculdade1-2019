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
public class PlacaMae extends ComponentesEletronicos{
    
    public String marca;
    public String tipo;
    public int tamanhoTransmissao;
    
    //public void on(){}
    public void desligar(){}
    public void transmitirAlerta(){}
    public void transferirInfo(ComponentesEletronicos origem, ComponentesEletronicos destino){
        System.out.println("A informação emitida por: " + origem.getMarca()+"");
    }
    
    public PlacaMae(String param) {
        super(param);
    }
    
}
