/*
*  2026 ITESS-TICS 
*  Periodo: Enero-Junio
*  Asignatura: Programación Orientada a Objetos
*  Docente: Francisco Javier Montecillo Puente
*  Descripción: Tema 1. Entorno de desarollo
*               1.2 Proceso de desarrollo de aplicaciones
*  Programador: FJMP
*  Fecha: 10 febrero 2026
*/

package tema1ide;

public class StudentTest {
    public static void main(String ... args) {
        // prueba de constructor default
        System.out.println("prueba de constructor default::::::::::::::::::::.::");
        Student student1 = new Student();
        System.out.println(student1.toString());
        
        // prueba de constructor con parametros
        System.out.println("prueba de constructor con parametros:::::::::::::.::");
        Student student2 = new Student("TI26","Juan", "TICS", "male");
        System.out.println(student2.toString());
        
        // prueba de getters and setters
        System.out.println("prueba de getters and setters::::::::::::::::::::.::");
        student2.setControlNumber("TI25");
        System.out.println(student2.getControlNumber());
        
        student2.setName("Dafne");
        System.out.println(student2.getName());
        
        student2.setCareer("IGEA");
        System.out.println(student2.getCareer());
        
        student2.setGender("Female");
        System.out.println(student2.getGender());
    } 
}
