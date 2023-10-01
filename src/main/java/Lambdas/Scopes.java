package Lambdas;

public class Scopes {

    private static double atributo1;
    private double atributo2;


    public static void main(String[] args) {
        Scopes app = new Scopes();
        System.out.println(app.probarLocalvariable());
        System.out.println(app.probarAtributosStaticvariables());
    }

    public double probarLocalvariable() {
        //Para variables locales, la variable debe ser final.
        final double n3 = 3;
        Operacion op = new Operacion() {
            @Override
            public double calcular(double n1, double n2) {
                return n1 + n2 + n3;
            }
        };

        //O en un contexto de lambdas
        Operacion operacion = (x, y) -> {return x + y;};
        //se puede escribir normalmente
                return operacion.calcular(1, 1);

    }

    public double probarAtributosStaticvariables() {
        //Las variables locales, globales o de tipo static o no, tienen el mismo comportamiento que
        //en un objeto anonimo que se instancia a través de una interfaz
        //donde tenemos que implementar los métodos.
        //En este caso el método calcular, funciona de la misma manera tanto en el objeto anonimo como
        //en la expresion lambda
        Operacion op= new Operacion() {
            @Override
            public double calcular(double n1, double n2) {
                atributo1=n1+n2;
                atributo2=atributo1;
                return atributo2;
            }
        };


    Operacion operacion= (x,y)->{
        atributo1= x+y;
        atributo2=atributo1;
       return atributo2;
    };
    return operacion.calcular(3,2);
    }

}


