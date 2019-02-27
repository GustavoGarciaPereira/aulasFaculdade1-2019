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
public class Pc {

    /**
     * @param args the command line arguments
     */
    
     //caracteristicas
    public String marca;
    public String cor;
            
    public void ligar(){}
    public void desligar(){}
            
    
    public static void main(String[] args) {
        Pc pc = new Pc();
        pc.marca = "DELL";
        pc.cor = "Cinza";
        
        Fonte fonte = new Fonte("corsair");
     
        fonte.ligar();
        PlacaMae motherboard = new PlacaMae("MotherBoard"+"MSI");
        Monitor monitor = new Monitor("Monitor Acer");
        Teclado teclado = new Teclado("Teclado Thermaltaker");
        
        
        
    }
}
