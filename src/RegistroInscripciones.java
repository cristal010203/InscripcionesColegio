import java.sql.SQLOutput;

public class RegistroInscripciones {
    public static void main(String[] args) {
    RegistroEstudiantes Est1 = new RegistroEstudiantes();
    Est1.setNombreEstudinte("Kerly Mayari");
    Est1.setApellidoEstudiante("Ramzzini Palma");
    Est1.setFechaNacimiento("25/02/2018");


    RegistroGrados Grado1 = new RegistroGrados();
    Grado1.setCodigoGrado("1");
Grado1.setNombreGrado("Primer grado");
    Grado1.setDescripcionGrado("Curso inicial de primaria ");

    RegistroSecciones Sec1 = new RegistroSecciones();
    Sec1.setCodigoSeccion("a");
    Sec1.setNombreSeccion("Seccion A");
    Sec1.setDescripcionSeccion("primer grupo de los grados");

        System.out.println("BIENVENIDO AL REGISTRO DE ESTUDIANTES DEL COLEGIO MAYA");
        System.out.println("Datos registrados del estudiante:");
        System.out.println("Nombre: " + Est1.getNombreEstudinte());
        System.out.println("Apellido: " + Est1.getApellidoEstudiante());
        System.out.println("Fecha: " + Est1.getFechaNacimiento());

        System.out.println("Codigo del grado asigando: " + Grado1.getCodigoGrado());
        System.out.println("Nombre del grado asigando: " + Sec1.getNombreSeccion());

    }


}


