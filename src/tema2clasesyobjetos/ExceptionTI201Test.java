/*
*  2026 ITESS-TICS 
*  Periodo: Enero-Junio
*  Asignatura: Programación Orientada a Objetos
*  Docente: Francisco Javier Montecillo Puente
*  Descripción: Tema 2. Clases y objetos
*               2.9 Manejo de excepciones
*               clase de prueba
*  Programador: FJMP
*  Fecha: 20 febrero 2026
 */
package tema2clasesyobjetos;

public class ExceptionTI201Test {

    static public void main(String... args) {
        int a = 0;
        int b = 0;

        // excepcion por division por cero
        try {
            int c = a / b;
        } catch (Exception e) {
            System.out.println("Operacion no valida:");
            System.out.println(e.toString());
        }

        // objeto no assignado sol1
        ExceptionTI201 ex;
        ex = new ExceptionTI201(); 
        ex.toString();
        
        // objeto no asignado 
        String str = null;
        
        try {
            System.out.println(str.toUpperCase());
        }
        catch  (Exception e) {
            System.out.println("error no tiene asignado");
            System.out.println(e.toString());
        }
        
        // acceso a un elemento no valido arreglo
        int arr[] = new int[2];
        try {
            arr[3] = 0;
        } catch(Exception e) {
            System.out.println("error en arreglos");
            System.out.println(e.toString());
        }
        
        // asignar un valor mas grande o pequeño que el permitido
        a = 2147483647;
        try{
            a++;
        } catch(Exception e) {
            System.out.println("error asignacion de valor");
            System.out.println(e.toString());
        }
        System.out.println(a);
        
       // stack overflow
       main(args);
       //str ="Hello";
       // for(;;) {
       //     str += "Hello";
       //}   
    }
}
