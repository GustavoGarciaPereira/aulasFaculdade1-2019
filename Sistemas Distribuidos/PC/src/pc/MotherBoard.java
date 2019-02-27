
package pc;

public class MotherBoard extends ComponenteEletronico {
    public String brand;
    public String type;
    public int busSize;
    
    //public void on(){}
    public void off(){}
    public void provideAlert(){}
    public void provideInfo(ComponenteEletronico origem,ComponenteEletronico destino){
        System.out.println("POR -> " +origem.getBrand() + " PARA -> " + destino.getBrand() );
        if((origem).getClass().getName().equals("pc.Teclado") && (destino).getClass().getName().equals("pc.Computador")){
            System.out.println("teclado vai mudar!!");
            int tcl = ((Keyboard)origem).recognizePressedKey();
            ((Monitor)destino).escreverNaTela(tcl);
        }
    }
    
    public MotherBoard(String param) {
        super(param);
    }
}
