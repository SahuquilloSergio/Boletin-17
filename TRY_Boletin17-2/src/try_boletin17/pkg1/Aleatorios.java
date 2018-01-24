package try_boletin17.pkg1;

public class Aleatorios {


    public void mostrar(float array[]) {
        for (float numero : array) {
            System.out.println(numero);
        }

    }

    public void invertir(float array[]) {
        System.out.println("Orden inverso:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println("Elemento " + (i + 1) + " = " + array[i]);
            }
        }
    }

