package try_boletin17.pkg4;

import javax.swing.JOptionPane;

public class TRY_Boletin174 {

    public static void main(String[] args) {
                String insert=JOptionPane.showInputDialog("Inserte DNI");
        double dni=(Double.parseDouble(insert))%23;
        
        Character letra[]={'A','B','C','D','E','F','G','H','J','K','L','M','N','O','P','R','S','T','V','W','X','Y','Z'};
        int numero[]={3,11,20,9,22,7,4,18,13,21,19,5,12,8,16,1,15,0,17,2,10,6,14};
        
        Metodos m = new Metodos();
        m.encontrar(dni, letra, numero);
    }
    
    }
    

