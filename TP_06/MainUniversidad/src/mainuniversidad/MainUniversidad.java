
package mainuniversidad;

/**
 *
 * @author Martin
 */
public class MainUniversidad {

    public static void main(String[] args) {
        
        Universidad u = new Universidad("UTN");

        ProfesorU pr1 = new ProfesorU("PR01", "Ana Martínez", "Redes");
        ProfesorU pr2 = new ProfesorU("PR02", "Carlos López", "POO");
        ProfesorU pr3 = new ProfesorU("PR03", "Elena Sánchez", "Bases de Datos");

        CursoU cu1 = new CursoU("CUR-01", "Programación II");
        CursoU cu2 = new CursoU("CUR-02", "Estructuras de Datos");
        CursoU cu3 = new CursoU("CUR-03", "Redes I");
        CursoU cu4 = new CursoU("CUR-04", "BD I");
        CursoU cu5 = new CursoU("CUR-05", "Sistemas Operativos");

        u.agregarProfesor(pr1);
        u.agregarProfesor(pr2);
        u.agregarProfesor(pr3);
        u.agregarCurso(cu1);
        u.agregarCurso(cu2);
        u.agregarCurso(cu3);
        u.agregarCurso(cu4);
        u.agregarCurso(cu5);

        // Asignaciones
        u.asignarProfesorACurso("CUR-01", "PR02");
        u.asignarProfesorACurso("CUR-02", "PR02");
        u.asignarProfesorACurso("CUR-03", "PR01");
        u.asignarProfesorACurso("CUR-04", "PR03");

        //Listados
        System.out.println("== CURSOS ==");
        u.listarCursos();
        
        System.out.println("\n== PROFESORES ==");
        u.listarProfesores();

        // Cambio de profesor (coherencia bidireccional)
        System.out.println("\n== CAMBIAR PROFESOR de CUR-02 a PR03 ==");
        u.asignarProfesorACurso("CUR-02", "PR03");
        u.listarCursos();
        pr2.listarCursos();

        // Eliminar curso (limpia relación)
        System.out.println("\n== ELIMINAR CUR-04 ==");
        u.eliminarCurso("CUR-04");
        u.listarCursos();
        pr3.listarCursos();

        // Eliminar profesor (deja cursos sin asignar)
        System.out.println("\n== ELIMINAR PROFESOR PR02 ==");
        u.eliminarProfesor("PR02");
        u.listarProfesores();
        u.listarCursos();

        // Reporte simple
        System.out.println("\n== REPORTE: cursos por profesor ==");
        ProfesorU[] arr = new ProfesorU[]{pr1, pr2, pr3};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getNombre() + " -> " + arr[i].getCursosCopia().size() + " cursos");
        }
    }
}
