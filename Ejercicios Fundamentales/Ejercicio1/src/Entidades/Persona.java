
package Entidades;


public class Persona {
    private String nombre;
    private String apellido;
    private Perro perro;
    private String DNI;
    private int edad;

    public Persona(String nombre, String apellido, Perro perro, String DNI, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.perro = perro;
        this.DNI = DNI;
        this.edad = edad;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", perro=" + perro + ", DNI=" + DNI + ", edad=" + edad + '}';
    }
    
    

    
}
