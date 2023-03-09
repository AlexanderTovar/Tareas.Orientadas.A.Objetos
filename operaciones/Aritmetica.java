package operaciones;

public class Aritmetica {
    //atributos
    int a, b;

    //Constructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }

    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con argumentos");
    }
    //metodo
    public void sumar(){
        int resultado= this.a + this.b;
        System.out.println("Resultado: " + resultado);
    }
    public int sumarConRetorno(){
        //int resultado = a + b;
        //return resultado;
        // o
        return a + b;
        //En java solo se puede retornar un valor, pero se puede retornar una lista
    }
    public int sumarConArgumentos(int a, int b){
        this.a= a;
        this.b= b;
       // return a + b;
        //varibles locales son como las que son despues del int, ya que despues del metodo se eliminan
        //this significa atributo de nuestra clase y no a variable local
        return this.sumarConRetorno();
        //Y el this antes de un metodo significa que el metodo es de nuestra clase y no un metodo independiente a ella
    }
}
