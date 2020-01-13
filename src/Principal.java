
import javax.swing.JOptionPane;


/**
 *
 * @author Willy
 */
public class Principal {

    public static void main(String[] args) {
        String datosMenu;
        boolean salir = false;
        int opcion;
        
        Universidad universidad = new Universidad("LALALA");
              
        while(salir != true){
            datosMenu = " --SISTEMA UNIVERSITARIO " + universidad.getNombre() + " --\n " +
                "1. Matricular Estudiante\n" + 
                "2. Asignar Profesor a Departamento\n" +
                "3. Crear Curso en el Sistema" + 
                "4. Asignar alumnos a un curso \n" +
                "5. Listar Los Datos de Un Curso \n" +
                "6. Listar Cursos de Un Estudiante \n" +
                "7. Salir \n";
            
            opcion = Integer.valueOf(JOptionPane.showInputDialog(datosMenu));
            
            switch (opcion){
                case 1:
                    break;
            }
        }
    }
    
}
