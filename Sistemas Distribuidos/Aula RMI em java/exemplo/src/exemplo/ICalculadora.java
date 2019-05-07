/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author usrlab01
 */

/*
   1 - a interfase extente Remote
   2 - metodos publicos
   3 - todos os metodos de devem ter o throws (dispara) exeção remota
*/
public interface ICalculadora extends Remote{
    public double soma(double x,double y) throws RemoteException;
    public double subitracao(double x,double y)throws RemoteException;
    public double divisao(double x,double y)throws RemoteException;
    public double potencia(double b,double e)throws RemoteException;
    public double raizQuadrada(double x)throws RemoteException;
}
