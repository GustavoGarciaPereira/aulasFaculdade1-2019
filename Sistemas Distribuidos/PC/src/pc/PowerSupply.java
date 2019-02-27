
package pc;

public class PowerSupply extends ComponenteEletronico{
    //characteristics
    public String brand;
    public String type;
    public int watts;

    //comportamentos
    //public void on(){}
    public void off(){}
    public void energy(){}
    
    public PowerSupply(String param) {
        super(param);
    }
}