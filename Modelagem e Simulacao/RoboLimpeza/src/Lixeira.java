
/**
 *
 * @author Gustavo e Pierre
 */
public class Lixeira {
    
    public float tamanho = 100;
    public float quantidadePoeira;
    
    public boolean armazenar(){
        if(this.tamanho - this.quantidadePoeira <= 10 ){
            //alerta
            System.out.println("ta cheio!!");
            return false;
        }
        System.out.println("Armazenando");
        this.quantidadePoeira += 10;
        return true;
    }
    
    public void limpar(){
        System.out.println("Estou limpando!");
        this.quantidadePoeira = 1;
        armazenar();
        
    }
    
}
