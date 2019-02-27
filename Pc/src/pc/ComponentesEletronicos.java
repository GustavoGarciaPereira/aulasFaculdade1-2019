
package pc;

/**
 *
 * @author usrlab25
 */
public class ComponentesEletronicos {
    
    private String marca;
    public String tipo;
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    public ComponentesEletronicos(String param){
        this.setMarca(param);
        this.ligar();
    }
    
    public void ligar(){
        System.out.println(this.marca+" Ligado!");
    }
    
   
}
