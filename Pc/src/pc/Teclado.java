/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc;

import java.util.Random;

/**
 *
 * @author usrlab25
 */
public class Teclado extends ComponentesEletronicos{
    public String modelo;
    private int numTeclas;
    
    Tecla teclas[]= new Tecla[3];
    
    public Teclado(String param){
        super(param);
        teclas[0] = new Tecla();
        teclas[0].simbolo = "A";
        teclas[0].codigo = 1;
        teclas[1] = new Tecla();
        teclas[1].simbolo = "B";
        teclas[1].codigo = 2;
        teclas[2] = new Tecla();
        teclas[2].simbolo = "C";
        teclas[2].codigo = 3;
        
    }
    
    public void ligarLEDNumLock(){
        System.out.println("Ligou LED NumLock.");
    }
    public void ligarLEDCapsLock(){
        System.out.println("Ligou LED CapsLock.");
    }
    public void ligarLEDScrollLock(){
        System.out.println("Ligou LED ScrollLock.");
    }
    public void DesligarLEDNumLock(){
        System.out.println("Desligou LED NumLock.");
    }
    public void DesligarLEDCapsLock(){
        System.out.println("Desligou LED CapsLock.");
    }
    public void DesligarLEDScrollLock(){
        System.out.println("Desligou LED ScrollLock.");
    }
    
    public void reconhecerTeclaPressionada(){
        
        if(teclas[0].estado==1){
            System.out.println("Tecla" + teclas[0].codigo+" pressionada");
            teclas[0].descer();
        }
        if(teclas[1].estado==1){
            System.out.println("Tecla" + teclas[1].codigo+" pressionada");
            teclas[1].descer();
        }
        if(teclas[2].estado==1){
            System.out.println("Tecla" + teclas[2].codigo+" pressionada");
            teclas[2].descer();
        }
    }
    
    public void pressionarTeclaAleatorio(){
        Random random = new Random();
        teclas[random.nextInt(3)].descer();
    }
    public void enviarCodTecla(){}
    
    
    
}
