package tarea_Maquina_Cafe;

public class DriverCafe {
    public static void main(String[] args) {
        MaquinaCafe maquinaCafe1 = new MaquinaCafe(1500,5000,1000,50);
        //10 cafes americanos
        for (int i=1;i<=10;i++){
            if(maquinaCafe1.servirAmericano()){
                System.out.println("Cafe americano Numero: "+i+" servido.");
            }
            else {
                System.out.println("No hay suficientes recursos para seguir con la produccion de cafe");
                break;
            }
        }
        //5 cafes expresos
        for(int i=1; i<=5; i++){
            if (maquinaCafe1.servirExpreso()){
                System.out.println("Cafe expreso Numero: " + i+" servido");
            }
            else {
                System.out.println("No hay suficientes recursos para seguir con la produccion de cafe");
                break;
            }
        }
        //3 capuchinos
        for (int i=1; i<=3; i++){
            if (maquinaCafe1.servirCapuchino()){
                System.out.println("Cafe americano Numero: "+i+" servido.");
            }
            else {
                System.out.println("No hay suficientes recursos para seguir con la produccion de cafe");
                break;
            }
        }
        System.out.println("Inventario final de la cafeteria Ximena y Alexander");
        maquinaCafe1.mostrarInventario();
    }
}
