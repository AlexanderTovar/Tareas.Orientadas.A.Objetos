public class Balon {
    private String tipo;
    private String color;
    private int diametro;
    private boolean inflado;

    // Constructor por defecto
    public Balon() {
        this.tipo = "";
        this.color = "";
        this.diametro = 0;
        this.inflado = false;
    }

    // Constructor sobrecargado
    public Balon(String tipo, String color, int diametro, boolean inflado) {
        this.tipo = tipo;
        this.color = color;
        this.diametro = diametro;
        this.inflado = inflado;
    }

    // Métodos de acceso
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public boolean isInflado() {
        return inflado;
    }

    public void setInflado(boolean inflado) {
        this.inflado = inflado;
    }

    // Método toString
    @Override
    public String toString() {
        return "Balon{" +
                "tipo='" + tipo + '\'' +
                ", color='" + color + '\'' +
                ", diametro=" + diametro +
                ", inflado=" + inflado +
                '}';
    }

    // Métodos de uso general
    public void inflar() {
        if (inflado) {
            System.out.println("El balón ya está inflado.");
        } else {
            System.out.println("El balón se está inflando...");
            this.inflado = true;
        }
    }

    public void desinflar() {
        if (!inflado) {
            System.out.println("El balón ya está desinflado.");
        } else {
            System.out.println("El balón se está desinflando...");
            this.inflado = false;
        }
    }
}