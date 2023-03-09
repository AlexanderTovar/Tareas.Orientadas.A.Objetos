package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        var a = 10;
        var b = 2;
        miMetodo();
        //Como son lineas distintas se puede usar var y en variables locales
        Aritmetica aritmetica1 = new Aritmetica(); //nuevo objeto de clase
        System.out.println("aritmetica1 a:" + aritmetica1.a);
        System.out.println("aritmetica1 b:" + aritmetica1.b);
//variables locales se destruyen al acabar el metodo y se almacenan en la memoria stack
        //Si se agrega un constructor con argumentos el constructor vacio no se agregara
//Los objetos y atributos se almacenan en la memoria heap
        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("aritmetica2 a:" + aritmetica2.a);
        System.out.println("aritmetica2 b:" + aritmetica2.b);
    }
    public static void miMetodo(){
        //la variable a esta fuera del alcance donde fue definida
        //a = 10;
        System.out.println("Otro metodo");
    }
}
