public class Taxi extends Automovil{
    protected String seguridadEspacial;
    protected String tecnologia;
    protected String disenio;
    public void pasajero(){
        System.out.println("Subiendo a un pasajero...");
    }
    public void pasajeroDestino(){
        System.out.println("El pasajero llego a su destino...");
    }
    public Taxi() {
    }

    public Taxi(int capacidadPersonas, String tipoCombustible,
                String capacidadCarga, int velocidadMaxima,
                int consumoCombustible, String confortEquipamiento,
                String seguridadEspacial, String tecnologia, String disenio) {
        super(capacidadPersonas, tipoCombustible, capacidadCarga, velocidadMaxima, consumoCombustible, confortEquipamiento);
        this.seguridadEspacial = seguridadEspacial;
        this.tecnologia = tecnologia;
        this.disenio = disenio;
    }

    public String getSeguridadEspacial() {
        return seguridadEspacial;
    }

    public void setSeguridadEspacial(String seguridadEspacial) {
        this.seguridadEspacial = seguridadEspacial;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getDisenio() {
        return disenio;
    }

    public void setDisenio(String disenio) {
        this.disenio = disenio;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "seguridadEspacial='" + seguridadEspacial + '\'' +
                ", tecnologia='" + tecnologia + '\'' +
                ", disenio='" + disenio + '\'' +
                ", velocidadMaxima=" + velocidadMaxima +
                ", consumoCombustible=" + consumoCombustible +
                ", confortEquipamiento='" + confortEquipamiento + '\'' +
                ", capacidadPersonas=" + capacidadPersonas +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                ", capacidadCarga='" + capacidadCarga + '\'' +
                '}';
    }
}
