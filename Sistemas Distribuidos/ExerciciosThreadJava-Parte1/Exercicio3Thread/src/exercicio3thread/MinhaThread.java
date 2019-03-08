package exercicio3thread;

public class MinhaThread extends Thread{
    
    int matrizSoma[];
    int linha = 0;
    public MinhaThread(int matriz[],int linha){
        this.matrizSoma = matriz;
        this.linha = linha;
        //System.out.println("gustavo"+vai);
    }
    
    
    public void run(){
        int soma = 0;
        for(int i=0;i<matrizSoma.length;i++){
                soma += matrizSoma[i];
        }
        System.out.println("Linha: "+linha+"  Soma: "+soma);
        
    }
}
