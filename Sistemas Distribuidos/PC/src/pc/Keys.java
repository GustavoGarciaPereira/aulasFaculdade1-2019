
package pc;

public class Keys {
    public String symbol;
    public int state; // 0 - unpressed || 1 - pressed
    public int code;
    
    public void up(){//unpressed
        this.state = 0;
    } 
    public int down(){ //pressed
        this.state = 1;
        return code;
    } 
    
    
//    public Keys(String param) {
//        super(param);
//    }
    
}
