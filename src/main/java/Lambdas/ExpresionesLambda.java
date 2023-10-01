package Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExpresionesLambda {
    public static void main(String[] args) {
        ExpresionesLambda app = new ExpresionesLambda();
        app.ordenar();
        app.calcular();
    }


    public void ordenar() {
        List<String> lista = new ArrayList<>();
        lista.add("MitoCode");
        lista.add("Code");
        lista.add("Mito");

        /*Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/


        Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }

    public void calcular() {
        //En el enfoque imperativo se escribe cómo se hace la implementacion
        /*Lambdas.Operacion operacion= new Lambdas.Operacion() {
            @Override
            public double calcularPromedio(double n1, double n2) {
                return (n1+n2)/2;
            }
        };

        System.out.println(operacion.calcularPromedio(2,3));*/
        //En el enfoque declarativo, se escribe qué es lo que se necesita
        //Todo aquello concepto que pueda ser una implementacion a través de una clase anonima, puede ser una expresion lambda
       /* Operacion operacion = (double x, double y) -> (x + y) / 2;
        System.out.println(operacion.calcularPromedio(2,3));*/

    }


}
