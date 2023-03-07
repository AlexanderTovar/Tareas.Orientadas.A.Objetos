public class Trabajos {
    // Atributos
    private String titulo;
    private String descripcion;
    private double salario;

    // Constructor por defecto
    public Trabajos() {
        titulo = "";
        descripcion = "";
        salario = 0.0;
    }

    // Constructor sobrecargado
    public Trabajos(String titulo, String descripcion, double salario) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.salario = salario;
    }

    // Métodos de acceso
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método toString
    public String toString() {
        return "Título: " + titulo + ", Descripción: " + descripcion + ", Salario: $" + salario;
    }

    // Métodos de uso general
    public void mostrarDetalles() {
        System.out.println("Detalles del trabajo:");
        System.out.println("- Título: " + titulo);
        System.out.println("- Descripción: " + descripcion);
        System.out.println("- Salario: $" + salario);
    }

    public void aplicar() {
        System.out.println("Aplicando para el trabajo de " + titulo);
    }
}