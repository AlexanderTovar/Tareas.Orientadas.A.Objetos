import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Caja<String> miCaja = new Caja<>(new String[10]);
        //Los arreglos pueden maximo hasta 10, porque asi se establecio en la constante

        miCaja.add(0,"hola");
        miCaja.add(1,"adios");
        miCaja.add(2,"hi");
        System.out.println(miCaja);

        Caja<Integer> miCaja2 = new Caja<>(new Integer[5]);
        miCaja2.add(1,26);
        miCaja2.add(2,18);
        System.out.println(miCaja2);
        //Se usa T para no limitar a un atributo en una determinada variable y de este manera dependiendo
        // del objeto para crear se usa un determinado tipo de variable

        System.out.println("---------------");
        CajaSinGenericos cajaSin = new CajaSinGenericos(new Object[10]);
        cajaSin.add(0,"hola");
        cajaSin.add(1,"adios");
        cajaSin.add(2,"hi");
        System.out.println(cajaSin);
        //Usando object solo te regresa objetos tipos object, no puedes cambiar de tipo variable

        System.out.println("------COMIDA------");
        Caja<Comida> cajaComida = new Caja<>(new Comida[10]);

        cajaComida.add(0,new Comida("Yogurth",true));
        System.out.println(cajaComida.get(0));
        System.out.println("------");

        ArrayList<Comida> comidas = new ArrayList<Comida>();
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Manzana",false));

        System.out.println(comidas.size());
        System.out.println(comidas.get(15));
        //Con el punto get se imprime la posicion seleccionada

        //Cuando se usa para una clase, se pone en el tipo de dato, y en el parentesis de la clase padre se crea
        //        // un nuevo objeto de clase que se puso en el tipo de dato, en esa clase se pondran los argumetos en
        //        // el constructor

        ArrayList<Comida> comidas2 = new ArrayList<>();
        comidas2.add(new Comida("Zanahoria",false));
        comidas2.add(new Comida("Yogurth",true));
        comidas2.add(new Comida("Danonino",true));
        comidas2.add(new Comida("Manzana",false));
        comidas2.add(new Comida("Bistek",false));

        System.out.println(comidas2.get(3));
        comidas2.set(3, new Comida("Fresa",false));
        comidas.add(3,new Comida("Naranja",false));
        System.out.println("-----FINAL-----");
        for (Comida comida : comidas2){
            System.out.println(comida);
        }
        //Array + la clase o el tipo de dato + nombre de la variable + new + array
    }
}