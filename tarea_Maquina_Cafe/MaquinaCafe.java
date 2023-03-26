package tarea_Maquina_Cafe;

public class MaquinaCafe {
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;
    private final int capacidadCrema=1500;
    private final int capacidadAgua=5000;
    private final int capacidadCafe=1000;
    private final int  capacidadVasos=50;
    private final int capacidadMLvasos=200;
    public boolean servirAmericano (){
        if (agua>=180 && cafe>=15 && vasos>0){
            agua -= 180;
            cafe -= 15;
            vasos --;
            System.out.println("Aqui tiene su americano, disfrutelo y que tenga buen dia");
            return true;
        }
        else{
            System.out.println("Ya no hay mas cafe, vuelva el siguiente dia");
            return false;
        }
    }
    public boolean servirExpreso(){
        if (agua>=120 && cafe>=20 && vasos>0){
            agua -=120;
            cafe -=20;
            vasos--;
            System.out.println("Aqui tiene su expreso, disfrutelo y que tenga buen dia");
            return true;
        }
        else{
            System.out.println("Ya no hay mas cafe, vuelva el siguiente dia");
            return false;
        }
    }
    public boolean servirCapuchino(){
        if (agua>=100 && crema>=70 && cafe>=14 && vasos>0){
            agua-= 100;
            crema-=70;
            cafe-=14;
            vasos--;
            System.out.println("Aqui tiene su capuchino, disfrutelo y que tenga buen dia");
            return true;
        }
        else{
            System.out.println("Ya no hay mas cafe, vuelva el siguiente dia");
            return false;
        }
    }
    public void mostrarInventario (){
        System.out.println("Inventario");
        System.out.println("Agua "+agua+" ml");
        System.out.println("Crema "+crema+" ml");
        System.out.println("Cafe "+cafe+" gr");
        System.out.println("Vasos "+vasos+" restantes");
    }
    public MaquinaCafe() {
    }

    public MaquinaCafe(int crema, int agua, int cafe, int vasos) {
        this.crema = crema;
        this.agua = agua;
        this.cafe = cafe;
        this.vasos = vasos;
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        this.crema = crema;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = vasos;
    }

    public int getCapacidadCrema() {
        return capacidadCrema;
    }

    public int getCapacidadAgua() {
        return capacidadAgua;
    }

    public int getCapacidadCafe() {
        return capacidadCafe;
    }

    public int getCapacidadVasos() {
        return capacidadVasos;
    }

    public int getCapacidadMLvasos() {
        return capacidadMLvasos;
    }

    @Override
    public String toString() {
        return "tarea_Maquina_Cafe.MaquinaCafe{" +
                "crema=" + crema +
                ", agua=" + agua +
                ", cafe=" + cafe +
                ", vasos=" + vasos +
                ", capacidadCrema=" + capacidadCrema +
                ", capacidadAgua=" + capacidadAgua +
                ", capacidadCafe=" + capacidadCafe +
                ", capacidadVasos=" + capacidadVasos +
                ", capacidadMLvasos=" + capacidadMLvasos +
                '}';
    }
}
