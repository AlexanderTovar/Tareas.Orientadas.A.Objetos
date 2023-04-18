public class Vehiculo {
    protected int capacidadPersonas;
    protected String tipoCombustible;
    protected String capacidadCarga;
    public void encendiendo(){
        System.out.println("Encendiendo...");
    }
    public void apagando (){
        System.out.println("Apagando...");
    }
    public Vehiculo() {
    }

    public Vehiculo(int capacidadPersonas, String tipoCombustible, String capacidadCarga) {
        this.capacidadPersonas = capacidadPersonas;
        this.tipoCombustible = tipoCombustible;
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(String capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "capacidadPersonas=" + capacidadPersonas +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                ", capacidadCarga='" + capacidadCarga + '\'' +
                '}';
    }
}
