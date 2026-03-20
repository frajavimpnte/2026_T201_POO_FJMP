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
*  Fecha: 20 marzo 2026
*/
package tema2clasesyobjetos;

public class Automovil {
    private String marca;
    private String modelo;
    private String cilindros;

    public Automovil() {
        marca = "x";
        modelo = "y";
        cilindros = "0 cc";
    }

    public Automovil(String marca, String modelo, String cilindros) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindros = cilindros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCilindros() {
        return cilindros;
    }

    public void setCilindros(String cilindros) {
        this.cilindros = cilindros;
    }

    @Override
    public String toString() {
        return "Automovil{" + "marca=" + marca + ", modelo=" + modelo + ", cilindros=" + cilindros + '}';
    }  
}
