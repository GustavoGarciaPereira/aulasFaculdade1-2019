
package pc;

public class PC extends ComponenteEletronico{
    public String brand;
    public String color;
    
    public void on(){}
    public void off(){}
    public static void main(String[] args) {
        PC pc = new PC("Computer" + " Dell");
        PowerSupply ps = new PowerSupply("Power Supply" + " Corsair");
        MotherBoard mb = new MotherBoard("MotherBoard"+" MSI");
        Monitor m = new Monitor("Monitor" + " Acer");
        Keyboard k = new Keyboard("Keyboards" + " Thermaltaker");
        k.pressRandomKey();
        k.recognizePressedKey();
        mb.provideInfo(k, m);
        
        k.pressRandomKey();

    }
    
    public PC(String param) {
        super(param);
    }
    
}
