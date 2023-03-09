public class Pais {
    private String nombre;
    private int poblacion;
    private double area;

    // Constructor por defecto
    public Pais() {
        this.nombre = "";
        this.poblacion = 0;
        this.area = 0.0;
    }

    // Constructor sobrecargado
    public Pais(String nombre, int poblacion, double area) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.area = area;
    }

    // Métodos de acceso
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return this.poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    // Método toString
    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", poblacion=" + poblacion +
                ", area=" + area +
                '}';
    }

    // Métodos de uso general
    public double calcularDensidadPoblacional() {
        return this.poblacion / this.area;
    }

    public boolean esIgual(Pais otroPais) {
        return this.nombre.equals(otroPais.nombre) &&
                this.poblacion == otroPais.poblacion &&
                this.area == otroPais.area;
    }
}
