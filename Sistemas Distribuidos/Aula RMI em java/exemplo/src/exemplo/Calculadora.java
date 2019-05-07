/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author usrlab01
 */

/*
    1- 
*/
public class Calculadora extends UnicastRemoteObject implements ICalculadora{
    
    public Calculadora() throws RemoteException{
        
    }
    
    @Override
    public double soma(double x, double y) throws RemoteException {
        return x + y;
    }

    @Override
    public double subitracao(double x, double y) throws RemoteException {
        return x - y;
    }

    @Override
    public double divisao(double x, double y) throws RemoteException {
        return x / y;
    }

    @Override
    public double potencia(double b, double e) throws RemoteException {
        
        return Math.pow(b, e);
    }

    @Override
    public double raizQuadrada(double x) throws RemoteException {
        return Math.sqrt(x);
    }
    
}
