/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author gustavo
 */

public class Servidor {
  static float saldo = 100;
    public static void main(String[] args) {
        try {
            //servidor cria um socket servidor na porta 1234
            ServerSocket servidor = new ServerSocket(1234);
            System.out.println("Servidor criado na porta 1234");

            //servidor aguarda uma conexão de algum cliente
            Socket cliente = servidor.accept();//bloqueante
            System.out.println("Cliente recebido");

            //stream para envio de dados para o cliente
            DataOutputStream out = new DataOutputStream(cliente.getOutputStream());
            //stream para o recebimento de dados do cliente
            DataInputStream in = new DataInputStream(cliente.getInputStream());

            //teclado
            Scanner teclado = new Scanner(System.in);
            //criação de uma thread para recebimento de mensagens do cliente
//            Thread t = new Thread() {
//                public void run() {
//                    while (true) {
//                        //recebimento de mensagens do cliente
//                        try {
//                            String mensagemRecebida = in.readUTF();
//                            System.out.println("Cliente enviou: " + mensagemRecebida);
//                            
//                            switch(mensagemRecebida){
//                                case"1":
//                                    System.out.println("Estou tirando dinheiro");
//                                    break;
//                                default:
//                                    System.out.println("Operação invalida");
//                            }
//                        } catch (IOException ex) {
//                            System.out.println("Problema no recebimento de mensagens do cliente");
//                        }
//                        
//                    }
//                }
//            };
//            t.start();
            //envio de mensagens para o cliente
            while (true) {
                String valor;
                String operacao = in.readUTF();
                String numero = in.readUTF();
                System.out.println("Cliente enviou: " + operacao);

                switch (operacao) {
                    case "1":                        
                        saldo = saldo - Integer.parseInt(numero);
                        out.writeUTF(saldo+"");
                        break;
                    case "2":                                             
                        saldo = saldo + Integer.parseInt(numero);
                        out.writeUTF(saldo+""); 

                        break;
                    case "3":
                        System.out.println("Saldo que estu vendo: ");
                        
                        out.writeUTF(saldo+"");

                        break;
                    default:
                        out.writeUTF("Opção envalida!!");

                }

                //String mensagemEnviar = teclado.nextLine();
                //
                
            }

        } catch (IOException ex) {
            System.out.println("Erro na criação do servidor");
            ex.printStackTrace();
        }
    }
}
