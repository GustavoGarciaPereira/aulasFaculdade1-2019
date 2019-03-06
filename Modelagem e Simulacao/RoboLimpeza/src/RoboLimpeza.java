
/**
 *
 * @author Gustavo e Pierre
 */
public class RoboLimpeza {
    //caracteristicas
    public String nome;
    public String marca;
    public String modelo;
    
    //comportamentos
    public String escovaDireita;
    public String escovaEsquerda;
    
    //escovas direita e esquerda
    //tempofuncionamento?
    //filtro
    //modos de limpeza
    public void pausar(){}
    public void ligar(){
        System.out.println("Estou ligado!!");
    }
    public void desligar(){}
            
    public static void main(String[] args) {
        RoboLimpeza robo1 = new RoboLimpeza();
        Bateria bateria = new Bateria(100);
        Lixeira lixeira = new Lixeira();
        ReconhecerTerreno reconhecer = new ReconhecerTerreno();
        
        robo1.ligar();
        reconhecer.uploadMapa();
        
        while(bateria.nivelBateria()){
            bateria.nivelEnergia -= 10;
            lixeira.limpar();
            
            //utilizar o sensor de proximidade
                       
        }
              
    }
    
}
