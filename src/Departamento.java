
import java.util.HashSet;


public class Departamento {
    String nombre;
    
    public Departamento(Universidad universidad) {
        this.universidad = universidad;
    }
    
    Universidad universidad;
    HashSet <Profesor> profesores = new HashSet <Profesor>();
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//    public Universidad getUniversidad() {
//        return universidad;
//    }
//
//    public void setUniversidad(Universidad universidad) {
//        this.universidad = universidad;
//    }
    
    public void setProfesor(Profesor profesor){
        profesores.add(profesor);
    }
}
