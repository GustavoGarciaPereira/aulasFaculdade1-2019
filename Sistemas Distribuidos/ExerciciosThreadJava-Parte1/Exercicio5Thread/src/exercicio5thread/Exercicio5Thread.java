package exercicio5thread;
/**
 *
 * @author gustavo
 */
public class Exercicio5Thread {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        MinhaThread t;
        
        int i=0;
        while(true){

            if(i<=9){
                t = new MinhaThread();
                i+=1;
                System.out.println("numeto de thread    "+i);
                t.start();
            }else{
                
                i-=1;
            }
            
            
            
           
            
        }
        
//        if((i-f)<10){
//            i+=1;
//            t = new MinhaThread();
//            t.start();
//        }
    }
    
}
