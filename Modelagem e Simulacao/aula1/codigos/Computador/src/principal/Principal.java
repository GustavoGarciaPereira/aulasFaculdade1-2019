/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author usrlab25
 */
public class Principal {
    public static void main(String[] args) {
        PlacaMae pm = new PlacaMae();
        pm.Comunicacao(false);
        System.out.println("<>"+pm.barramento);
    }
}
