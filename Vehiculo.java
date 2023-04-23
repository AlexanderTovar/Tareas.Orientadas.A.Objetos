public interface Vehiculo {
    public static final int VELOCIDAD_MAXIMA = 160;
    public static final char CLASIFICACION = 'A';
    //con static y final se hace constante
    public boolean encender();
    public boolean avanzar();
    public boolean apagar();
    public boolean frenar();

}
