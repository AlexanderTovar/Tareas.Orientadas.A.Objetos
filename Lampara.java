public class Lampara {
    private String marca;
    private int potencia;
    private boolean encendida;

    // Constructor por defecto
    public Lampara() {
        this.marca = "";
        this.potencia = 0;
        this.encendida = false;
    }

    // Constructor sobrecargado
    public Lampara(String marca, int potencia, boolean encendida) {
        this.marca = marca;
        this.potencia = potencia;
        this.encendida = encendida;
    }

    // Métodos de acceso
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    // Método toString
    @Override
    public String toString() {
        return "Lampara{" +
                "marca='" + marca + '\'' +
                ", potencia=" + potencia +
                ", encendida=" + encendida +
                '}';
    }

    // Métodos de uso general
    public void encender() {
        if (encendida) {
            System.out.println("La lámpara ya está encendida.");
        } else {
            System.out.println("Encendiendo la lámpara...");
            this.encendida = true;
        }
    }

    public void apagar() {
        if (!encendida) {
            System.out.println("La lámpara ya está apagada.");
        } else {
            System.out.println("Apagando la lámpara...");
            this.encendida = false;
        }
    }
}
