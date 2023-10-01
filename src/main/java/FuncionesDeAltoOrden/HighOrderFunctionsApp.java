package FuncionesDeAltoOrden;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class HighOrderFunctionsApp {
    public static void main(String[] args) {
        HighOrderFunctionsApp app = new HighOrderFunctionsApp();
        app.imprimir(app.convertirMayusculas, "Jordán");
        app.imprimir(app.convertirMinusculas, "EMANUEL");
        String rta = app.mostrar("Hola").apply("Jordán");
        System.out.println(rta);

        List<String> lista = new ArrayList<>();
        lista.add("Jor");
        lista.add("Jordán");
        lista.add("Emanuel");

        app.filtrar(lista, System.out::println, 5);
    }

    //Una High Order Function es una función que recibe como parámetro otra función o bien devuelve una función

    private Function<String, String> convertirMayusculas = x -> x.toUpperCase();
    private Function<String, String> convertirMinusculas = x -> x.toLowerCase();

    //Se puede enviar funciones como parametros
    public void imprimir(Function<String, String> funcion, String valor) {
        System.out.println(funcion.apply(valor));
    }

    //y se pueden retornar una funcion para usarla en el resultado
    public Function<String, String> mostrar(String mensaje) {
        return (String y) -> mensaje + y;
    }

    //Apoyándome en Consumers y Predicates:
    public void filtrar(List<String> lista, Consumer<String> consumidor, int longitud) {
        lista.stream().filter(this.establecerLogicaFiltro(longitud)).forEach(consumidor);
    }

    public Predicate<String> establecerLogicaFiltro(int longitud) {
        return texto -> texto.length() < longitud;
    }

}
