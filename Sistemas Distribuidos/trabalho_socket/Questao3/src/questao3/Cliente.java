/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author gustavo
 */

public class Cliente {
    public static void main(String[] args) {
        try {
            //cliente cria o seu socket e se conecta ao servidor
            Socket cliente = new Socket("localhost", 1234);
            
            //stream para envio de dados para o servidor
            DataOutputStream out = new DataOutputStream(cliente.getOutputStream());
            //stream para o recebimento de dados do servidor
            DataInputStream in = new DataInputStream(cliente.getInputStream());
            
            
            //teclado
            Scanner teclado = new Scanner(System.in);

//            //criação de uma thread para recebimento de mensagens do servidor
//            Thread t = new Thread() {
//                public void run() {
//                    while (true) {
//                        //recebimento de mensagens do servidor
//                        try {
//                            
//                        } catch (IOException ex) {
//                            System.out.println("Problema no recebimento de mensagens do servidor");
//                            break;
//                        }
//                        
//                    }
//                }
//            };
//            t.start();
            
            //envio de mensagens para o servidor
            while (true) {         
                System.out.println("Menu: (1)sacar (2)depositar (3) ver saldo");
                
                String mensagemEnviar = teclado.nextLine();
                if(mensagemEnviar.equals("1")){
                    //pede o valor a ser sacado
                    System.out.println("Qual o valor para sacar");
                    String valor = teclado.nextLine();
                    out.writeUTF(mensagemEnviar);
                    out.writeUTF(valor);
                    
                }
                else if(mensagemEnviar.equals("2")){
                    System.out.println("Qual o valor para sacar");
                    String valor = teclado.nextLine();
                    
                    out.writeUTF(mensagemEnviar);
                    out.writeUTF(valor);
                }
                else if(mensagemEnviar.equals("3")){
                    out.writeUTF(mensagemEnviar);
                    out.writeUTF("");
                }else{
                    out.writeUTF(mensagemEnviar);
                    out.writeUTF("");
                }
                String mensagemRecebida = in.readUTF();
                System.out.println("Servidor enviou: " + mensagemRecebida);
            }
        } catch (IOException ex) {
            System.out.println("Servidor não encontrado");
        }
        
    }
}
