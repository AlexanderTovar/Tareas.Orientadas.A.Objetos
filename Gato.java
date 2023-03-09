public class Gato {
    private String nombre;
    private int edad;
    private String color;

    // Constructor por defecto
    public Gato() {
        this.nombre = "";
        this.edad = 0;
        this.color = "";
    }

    // Constructor sobrecargado
    public Gato(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Método toString
    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                '}';
    }

    // Métodos de uso general
    public void maullar() {
        System.out.println(this.nombre + " está maullando...");
    }

    public void dormir() {
        System.out.println(this.nombre + " está durmiendo...");
    }
}