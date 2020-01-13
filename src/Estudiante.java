
import java.util.HashSet;


public class Estudiante {
    String nombre;
    String cod;
    
    public Estudiante(String nombre, String cod){
        this.nombre = nombre;
        this.cod = cod;
    }
    
    
    HashSet <Curso> cursos = new HashSet <Curso>();
    Universidad universidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
    
    //*******************************************
    
    public void setcurso(Curso curso){
        cursos.add(curso);
    }
}
