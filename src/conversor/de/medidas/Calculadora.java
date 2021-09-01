
package conversor.de.medidas;

public class Calculadora {
    
    double medida;
    
    
    void mili(){
        double mm = medida * 25.4;
        System.out.println("Sua medidade em mm é:" + mm);
    }
    
    void pol (){
        double pole = medida / 25.4;
        System.out.println("Sua medida em polegada é:" + pole);
    }
    
}
