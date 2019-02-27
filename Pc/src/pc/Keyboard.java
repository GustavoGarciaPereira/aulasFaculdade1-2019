
package pc;

import java.util.Random;

public class Keyboard extends ComponenteEletronico{
    public String brand;
    public String type;
    public String model; // ABNT || ABNT2 || etc
    Keys k[] = new Keys[3];
    public void turnOnLedNumLock(){
        System.out.println(this.getBrand() + " NumLock led turned On");
    }
    public void turnOnLedCapsLock(){
        System.out.println(this.getBrand() + " CapsLock led turned On");
    }
    public void turnOnLedScrollLock(){
        System.out.println(this.getBrand() + " ScrollLock led turned On");
    }
    public void turnOffLedNumLock(){
        System.out.println(this.getBrand() + " NumLock led turned Off");
    }
    public void turnOffLedCapsLock(){
        System.out.println(this.getBrand() + " CapsLock led turned off");
    }
    public void turnOffLedScrollLock(){
        System.out.println(this.getBrand() + " ScrollLock led turned off");
    }
    public int recognizePressedKey(){
        int cod = 0;
        if(k[0].state == 1){
            //System.out.println("Key "+k[0].code + " pressed");
            System.out.println("Key 1 pressed : A");
            cod = k[0].code;
        }
        if(k[1].state == 1){
            //System.out.println("Key "+k[1].code + " pressed");
            System.out.println("Key 1 pressed : B");
            cod = k[1].code;
        }
        if(k[2].state == 1){
            //System.out.println("Key "+k[2].code + " pressed");
            System.out.println("Key 1 pressed : C");
            cod = k[2].code;
        }
        return cod;
    }
    public void pressRandomKey(){
        Random rnd = new Random();
        k[rnd.nextInt(3)].state = 1;
            
    }
    public void sendKeyCode(){
        
    }
    
    public Keyboard(String param) {  
        super(param);
        k[0]= new Keys();
        k[0].symbol = "A";
        k[0].code = 1;
        k[1]= new Keys();
        k[1].symbol = "B";
        k[1].code = 2;
        k[2]= new Keys();
        k[2].symbol = "C";
        k[2].code = 3;
    }
}