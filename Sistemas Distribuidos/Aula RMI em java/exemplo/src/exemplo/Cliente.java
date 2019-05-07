/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo;

import java.util.Scanner;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usrlab01
 */
public class Cliente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            
        try {
            ICalculadora ref = (ICalculadora) Naming.lookup("rmi://localhost/Calculadora");
            int num1 = entrada.nextInt();
            int num2 = entrada.nextInt();
            System.out.println("Soma: "+ref.soma(num1, num2));
            
        } catch (NotBoundException ex) {
            System.out.println("Error: ");
        } catch (MalformedURLException ex) {
            System.out.println("Error: url errada");
        } catch (RemoteException ex) {
            System.out.println("Error: comunicação");
        }
    }


}
