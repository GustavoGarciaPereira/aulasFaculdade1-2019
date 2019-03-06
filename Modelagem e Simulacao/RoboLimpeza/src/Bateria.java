
/**
 *
 * @author Gustavo e Pierre
 */
public class Bateria {
    public float nivelEnergia;
    private String modelo;
    private String marca;
    private float am;
    
    public Bateria(int nivel){
        this.nivelEnergia = nivel;
    }
    

    public boolean nivelBateria(){
        if(this.nivelEnergia > 20){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void carregarBateria(float nivelEnergia){
        this.nivelEnergia = 100;
    }
    public void irParaBase(){}
}
