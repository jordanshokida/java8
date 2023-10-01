package Lambdas;

public class Sintaxis {
    public static void main(String[] args) {
        Sintaxis app = new Sintaxis();
        System.out.println(app.probarSintaxis());
    }

    public double probarSintaxis() {
        /*Operacion operacion=(double x, double y)->(x+y)/2;*/

        //O

       /* Operacion operacion = (double x, double y) -> {
            return (x + y) / 2;
        };*/

        //O

        /*Operacion operacion = (double x, double y) -> {
            double a = 2.0;
            System.out.println(a);
            return (x + y) / 2 + a;
        };*/

        //O se puede no indicar el tipo de parametro

        /*Operacion operacion=(x,y)->(x+y)/2;*/

        //Si deseamos no tener parámetros, pero hay que crear una método en la interfaz funcional, sin parametros
        /*Operacion operacion=()-> 2;
        return operacion.calcularPromedio();*/

        //O se puede escribir asi también, sin parametros
        /*Operacion operacion = () -> {
            int x = 2;
            int y = 3;
            return x + y;
        };

        return operacion.calcularPromedio2();*/

        return 1;
    }


}
