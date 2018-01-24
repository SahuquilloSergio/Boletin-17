package try_boletin17.pkg3;

public class TRY_Boletin173 {

    public static void main(String[] args) {

        Metodos M =new Metodos();
        float notas[]=new float[5];
        String nombre[]={"Adrian","Jose","Sergio","Andrea","Miriam"};
        float notas_orden[]=new float[5];
        
        for(int i=0;i<notas.length;i++){
            notas[i]=(float)Math.random()*9+0;
        }
        M.mostrar(notas, nombre);
        M.mostrarAprobados(notas, nombre);
        M.ordenar(notas);
        M.mostrarArray(notas, nombre);

    }
    
}
