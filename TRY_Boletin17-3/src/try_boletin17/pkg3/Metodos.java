package try_boletin17.pkg3;

import javax.swing.JOptionPane;

public class Metodos {

    public void mostrar(float nota[], String nombre[]) {
        String alumno = JOptionPane.showInputDialog("Nombre del alumno");
        for (int i=0; i<nombre.length; i++) {
            if (alumno.equalsIgnoreCase(nombre[i])) {
                JOptionPane.showMessageDialog(null, "La nota es: " + nota[i]);
                
            }
        }
    }

    public void mostrarAprobados(float nota[], String nombre[]) {
        int aprobados = 0;
        for (int i=0; i<nota.length; i++) {
            if (nota[i]>=5f) {
                System.out.println("Aprobado: " + nombre[i]);
            }
        }
    }

    public float[] ordenar(float notas[]) {
        int j;
        float aux;
        for (int i=0; i<notas.length-1; i++) {
            for (j=i+1; j<notas.length; j++) {
                if (notas[i] > notas[j]) {
                    aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;
                }
            }
        }
        return notas;
    }

    public void mostrarArray(float array[], String nombre[]) {
        for (byte i=0; i<array.length; i++) {
            System.out.println( nombre[i]+ (i + 1) + ": " + array[i]);
        }
    }
}
