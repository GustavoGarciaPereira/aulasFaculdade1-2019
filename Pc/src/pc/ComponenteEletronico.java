
package pc;
public class ComponenteEletronico {
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public ComponenteEletronico(String param){
        this.setBrand(param);
        this.On();
        //this.Off();  
    }
    public void On(){
        System.out.println(this.brand + " on!");
    }
    public void Off(){
        System.out.println(this.brand + " off!");
    }
   private String brand;
   public String type;
}
