package try_boletin17.pkg2;

public class Alumno {
    private int nota;

    public Alumno() {
    }

    public Alumno(int nota) {
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno" + "nota=" + nota;
    }
}