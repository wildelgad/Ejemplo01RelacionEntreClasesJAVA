
import java.util.HashSet;

/**
 *
 * @author: YO
 */
public class Universidad {
    String nombre;
    
    public Universidad(String nombre){
        this.nombre = nombre;
    }
    
    
    HashSet<Departamento> departamentos = new HashSet<Departamento>();
    HashSet<Estudiante> estudiantes = new HashSet <Estudiante>(); 

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setDepartamentos(Departamento departamento){
        departamentos.add(departamento);
    }
    
    public void setEstudiantes(Estudiante estudiante){
        estudiantes.add(estudiante);
    }
}
