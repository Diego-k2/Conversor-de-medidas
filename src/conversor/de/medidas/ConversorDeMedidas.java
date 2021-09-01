
package conversor.de.medidas;


import java.util.Scanner;

public class ConversorDeMedidas {
    

    public static void main(String[] args) {
   
     Scanner teclado = new Scanner (System.in);
     Calculadora converter = new Calculadora ();
     
     int unidade;
     
     System.out.println("1-Para converter de polegada para milimentro.");
     System.out.println("2-Para converter de milimetro para polegada.");
     unidade = teclado.nextInt();
     
     if (unidade == 1){
     
        System.out.println("Entre com a medida em polegada:");
        converter.medida = teclado.nextDouble();

        converter.mili();
     
      
     }
     
     else if (unidade == 2)
         System.out.println("Entre com a medida em milimetros:");
         converter.medida = teclado.nextDouble();
         
         converter.pol();
     
    }
    
}
