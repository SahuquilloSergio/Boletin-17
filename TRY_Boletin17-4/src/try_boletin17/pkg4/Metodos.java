package try_boletin17.pkg4;

import javax.swing.JOptionPane;


public class Metodos {

     
    public void encontrar(double dni,Character letra[],int numero[]){
        for(int i=0;i<numero.length;i++){
            if(dni==numero[i]){
                JOptionPane.showMessageDialog(null,"La letra es: "+letra[i]);
                break;
            }
           
        }
    }
 }


