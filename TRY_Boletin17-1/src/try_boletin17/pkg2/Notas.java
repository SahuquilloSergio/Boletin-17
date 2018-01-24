package try_boletin17.pkg2;

public class Notas {
    public int numaprobados(Alumno array[]){
        int aprobados=0;
        for(int i=0;i<array.length;i++){
            if(array[i].getNota()>5f){
                aprobados++;
            }
        }
        return aprobados;
    }
    
    
    public float notamedia(Alumno array[]){
        float nm=0;
        for(int i=0;i<array.length;i++){
            nm=nm+array[i].getNota();
        }
        nm=nm/array.length;
       
        return nm;
    }
    
    
    public float notamasalta(Alumno array[]){
        float na=0;
        for(int i=0;i<array.length;i++){
            if(array[i].getNota()>na){
                na=array[i].getNota();
            }
        }
        return na;
    }
    public void mostrar(Alumno array[]){
        for(Alumno notas:array){
            System.out.println(notas);
        }
    }


}

