/*
 Faça uma aplicação em que a thread principal cria N threads, cujo construtor 
da classe thread recebe um identificador (de 0 a N-1). Cada thread criada deverá 
enviar uma mensagem a thread com identificador +1, exceto a thread com 
identificador N-1 que enviará uma mensagem a thread de identificador 0. 
As threads só podem terminar sua execução no momento em que receberem a sua 
mensagem. Resumindo, implementar uma comunicação em anel entre as threads 
(sem envolver a thread principal).
 */
package exercicio3;

/**
 *
 * @author gustavo
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MinhaThread t;
        
        
            for(int i=0;i<4;i++){
                t = new MinhaThread(i,4);
                t.start();
                synchronized(t){
                    try{
                       // System.out.println("Aguardando a "+i+" completar...");
                        t.wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }

                //System.out.println("Total é igual a: " + t.indentificador);
                }
            }
        }
    
    
}
