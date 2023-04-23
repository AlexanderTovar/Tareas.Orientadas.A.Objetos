public class Automovil extends Vehiculo{
    protected int velocidadMaxima;
    protected int consumoCombustible;
    protected String confortEquipamiento;
    public void llenadoTanque (){
        System.out.println("Llenando tanque de gasolina...");
    }
    public void bajarVidrios(){
        System.out.println("Bajando los vidrios...");
    }
    public Automovil() {
    }

    public Automovil(int capacidadPersonas, String tipoCombustible,
                     String capacidadCarga, int velocidadMaxima, int consumoCombustible,
                     String confortEquipamiento) {
        super(capacidadPersonas, tipoCombustible, capacidadCarga);
        this.velocidadMaxima = velocidadMaxima;
        this.consumoCombustible = consumoCombustible;
        this.confortEquipamiento = confortEquipamiento;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(int consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    public String getConfortEquipamiento() {
        return confortEquipamiento;
    }

    public void setConfortEquipamiento(String confortEquipamiento) {
        this.confortEquipamiento = confortEquipamiento;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "velocidadMaxima=" + velocidadMaxima +
                ", consumoCombustible=" + consumoCombustible +
                ", confortEquipamiento='" + confortEquipamiento + '\'' +
                ", capacidadPersonas=" + capacidadPersonas +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                ", capacidadCarga='" + capacidadCarga + '\'' +
                '}';
    }
}
