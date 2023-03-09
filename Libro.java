public class Libro {
    private String titulo;
    private String autor;
    private int numPaginas;
    private boolean disponible;

    // Constructor por defecto
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numPaginas = 0;
        this.disponible = true;
    }

    // Constructor sobrecargado
    public Libro(String titulo, String autor, int numPaginas, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.disponible = disponible;
    }

    // Métodos de acceso
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Método toString
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numPaginas=" + numPaginas +
                ", disponible=" + disponible +
                '}';
    }

    // Métodos de uso general
    public void prestar() {
        if (!disponible) {
            System.out.println("Lo siento, el libro ya está prestado.");
        } else {
            System.out.println("El libro ha sido prestado correctamente.");
            this.disponible = false;
        }
    }

    public void devolver() {
        if (disponible) {
            System.out.println("Este libro no ha sido prestado.");
        } else {
            System.out.println("El libro ha sido devuelto correctamente.");
            this.disponible = true;
        }
    }
}