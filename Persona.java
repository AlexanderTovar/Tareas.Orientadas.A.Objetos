public class Persona {
    // Atributos
    private String nombre;
    private int edad;
    private String direccion;

    // Constructor por defecto
    public Persona() {
        nombre = "";
        edad = 0;
        direccion = "";
    }

    // Constructor sobrecargado
    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    // Métodos de acceso
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Método toString
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Dirección: " + direccion;
    }

    // Métodos de uso general
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
}