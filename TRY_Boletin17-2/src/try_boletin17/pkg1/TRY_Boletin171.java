/*
 *   Realiza un programa que cree un array chamado “numeros” con 6 numeros 
 *   aleatorios dun rango de 1 a 50 .Seguidamente visualiza o array o revés 
 *   (0 primeiro elemento visualizaráse o último e asi sucesivamente).
 */
package try_boletin17.pkg1;

public class TRY_Boletin171 {

    public static void main(String[] args) {
        Aleatorios A1 = new Aleatorios();
        float numeros[] = new float[6];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) Math.floor(Math.random() * 50 + 1);
        }
        A1.mostrar(numeros);
        A1.invertir(numeros);
        A1.mostrar(numeros);

    }

}
