public class Giroscopio {
    private String modelo;
    private int rangoMaximo;
    private boolean esDigital;

    // Constructor por defecto
    public Giroscopio() {
        this.modelo = "";
        this.rangoMaximo = 0;
        this.esDigital = false;
    }

    // Constructor sobrecargado
    public Giroscopio(String modelo, int rangoMaximo, boolean esDigital) {
        this.modelo = modelo;
        this.rangoMaximo = rangoMaximo;
        this.esDigital = esDigital;
    }

    // Métodos de acceso
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRangoMaximo() {
        return rangoMaximo;
    }

    public void setRangoMaximo(int rangoMaximo) {
        this.rangoMaximo = rangoMaximo;
    }

    public boolean isEsDigital() {
        return esDigital;
    }

    public void setEsDigital(boolean esDigital) {
        this.esDigital = esDigital;
    }

    // Método toString
    @Override
    public String toString() {
        return "Giroscopio{" +
                "modelo='" + modelo + '\'' +
                ", rangoMaximo=" + rangoMaximo +
                ", esDigital=" + esDigital +
                '}';
    }

    // Métodos de uso general
    public double calcularPrecision() {
        // Aquí iría el código para calcular la precisión del giroscopio
        return 0.0;
    }

    public void calibrar() {
        // Aquí iría el código para calibrar el giroscopio
        System.out.println("Giroscopio calibrado.");
    }
}