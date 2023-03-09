public class CuboRubik {
    private int tamano;
    private String[] colores;
    private boolean resuelto;

    // Constructor por defecto
    public CuboRubik() {
        this.tamano = 3;
        this.colores = new String[]{"rojo", "azul", "blanco", "naranja", "verde", "amarillo"};
        this.resuelto = false;
    }

    // Constructor sobrecargado
    public CuboRubik(int tamano, String[] colores) {
        this.tamano = tamano;
        this.colores = colores;
        this.resuelto = false;
    }

    // Métodos de acceso
    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String[] getColores() {
        return colores;
    }

    public void setColores(String[] colores) {
        this.colores = colores;
    }

    public boolean isResuelto() {
        return resuelto;
    }

    public void setResuelto(boolean resuelto) {
        this.resuelto = resuelto;
    }

    // Método toString
    @Override
    public String toString() {
        return "CuboRubik{" +
                "tamano=" + tamano +
                ", colores=" + Arrays.toString(colores) +
                ", resuelto=" + resuelto +
                '}';
    }

    // Métodos de uso general
    public void mezclar() {
        // Aquí iría el código para mezclar el cubo de Rubik
        System.out.println("Cubo de Rubik mezclado correctamente.");
        this.resuelto = false;
    }

    public void resolver() {
        // Aquí iría el código para resolver el cubo de Rubik
        System.out.println("Cubo de Rubik resuelto correctamente.");
        this.resuelto = true;
    }
}
