package try_boletin17.pkg2;

public class TRY_Boletin172 {

    public static void main(String[] args) {
        Alumno A1 = new Alumno();
        Notas N1 = new Notas();
        
        Alumno Alumnos[] = new Alumno[30];
        for(int i=0;i<Alumnos.length;i++){
            Alumnos[i]=new Alumno();
            Alumnos[i].setNota((int) ((float)Math.random()*10+1));
        }

           System.out.println("Numero aprobados: "+N1.numaprobados(Alumnos));
           System.out.println("Nota media: "+N1.notamedia(Alumnos));
           System.out.println("Nota más alta "+N1.notamasalta(Alumnos));
    }
    
}
