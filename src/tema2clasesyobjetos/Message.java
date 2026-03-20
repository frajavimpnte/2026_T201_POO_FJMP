/*
*  2026 ITESS-TICS 
*  Periodo: Enero-Junio
*  Asignatura: Programación Orientada a Objetos
*  Docente: Francisco Javier Montecillo Puente
*  Descripción: Tema 2. Clases y objetos
*               2.1 Definición de una clase
*               2.2 Declaración de clases  => lenguage JAVA
*               2.3 Miembros de una clase  => 
*  Programador: FJMP
*  Fecha: 09 febrero 2026
*/
package tema2clasesyobjetos;

public class Message {
    private String content;

    public Message() {
        this.content="";
    }

    public Message(String content) {
       this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Messsage{" + "content=" + content + '}';
    }
}
