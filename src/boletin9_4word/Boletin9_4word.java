
package boletin9_4word;

import javax.swing.JOptionPane;

public class Boletin9_4word {

    public static void main(String[] args) {
        // TODO code application logic here
        multi obx = new multi();   
        int num;//ponemos en int num 
        do{ //abrimos do para indicar el numero que queremos y que busque el numero entre 0 y 10
            num = Integer.parseInt(JOptionPane.showInputDialog("Numero tabla multiplicar: "));//que nos pida el numero deseado
            
        while ((num<0)||(num>10)){//si el numero es menor que 0 o mayor que 10 que corte la secuencia
            num = Integer.parseInt(JOptionPane.showInputDialog("Incorrecto numero entre 1 y 10: "));
        }
            
        if((num>0)&&(num<11)) //si el numero es mayor que 0 o menor que 11 haz el calculo
        obx.multi(num);//realizamos el calculo
            
        }while(num!=0);//el resultado de num tiene que ser distinto de 0
        
    }
}
        
   
        
    
    
        

            
            
        

