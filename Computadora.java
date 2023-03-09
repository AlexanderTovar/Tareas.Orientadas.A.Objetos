public class Computadora {
    private String marca;
    private String modelo;
    private int capacidadAlmacenamiento;

    // Constructor por defecto
    public Computadora() {
        this.marca = "";
        this.modelo = "";
        this.capacidadAlmacenamiento = 0;
    }

    // Constructor sobrecargado
    public Computadora(String marca, String modelo, int capacidadAlmacenamiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    // Métodos de acceso
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

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    // Método toString
    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadAlmacenamiento=" + capacidadAlmacenamiento +
                '}';
    }

    // Métodos de uso general
    public void instalarSoftware(String software) {
        // Aquí iría el código para instalar el software en la computadora
        System.out.println("Software " + software + " instalado correctamente.");
    }

    public boolean estaLlena() {
        // Aquí iría el código para verificar si la capacidad de almacenamiento está llena
        return false;
    }
}