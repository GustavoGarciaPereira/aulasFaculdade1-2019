
package pc;

public class Monitor extends ComponenteEletronico{
    public String brand;
    public String type;
    public String hzs;
    
    //public void on(){}
    public void off(){}
    public void energy(){}
    public void showKeyPressed(){}
//    Escrever na tela o caracter A, B ou C de acordo com
//    a tecla pressionada no teclado
    
    public void escreverNaTela(int codigo){
        if(codigo == 1){ System.out.println(this.brand+" imprime A ");}
        if(codigo == 2){ System.out.println(this.brand+" imprime B ");}
        if(codigo == 3){ System.out.println(this.brand+" imprime C ");}
    }
    
    
    
    public Monitor(String param) {
        super(param);
    }
    
}
