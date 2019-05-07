/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author usrlab01
 */
public class Servidor {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            Calculadora c = new Calculadora();
            Naming.bind("rmi://localhost/Calculadora", c);
            
        } catch (RemoteException ex) {
            System.out.println("Exce");
            
        }catch (AlreadyBoundException ex) {
            System.out.println("");
            
        }catch (MalformedURLException ex) {
            System.out.println("");
            
        }
    }
}
