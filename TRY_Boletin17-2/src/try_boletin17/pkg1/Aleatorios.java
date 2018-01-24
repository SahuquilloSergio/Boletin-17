package try_boletin17.pkg1;

public class Aleatorios {


    public void mostrar(float array[]) {
        for (float numero : array) {
            System.out.println(numero);
        }

    }

    public void invertir(float array[]) {
        int i, u;
        int aux;
        for(i=0,u=array.length-1;i<array.length && u>0;i++,u--){
                aux = (int) array[i];
                array[i] = array[u];
                array[u] = aux;
            }
        }
    }

