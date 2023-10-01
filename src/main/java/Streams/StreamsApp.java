package Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsApp {
    private List<String> lista;
    private List<String> numeros;

    public static void main(String[] args) {
        StreamsApp app = new StreamsApp();
        app.filtrar();
        app.ordenar();
        app.transformar();
        app.limitar();
        app.contar();



    }

    public StreamsApp() {
        lista = new ArrayList<>();
        lista.add("Jor");
        lista.add("Juan");
        lista.add("José");
        lista.add("Emanuel");

        numeros = new ArrayList<>();
        numeros.add("1");
        numeros.add("2");
    }

    public void filtrar() {

        lista.stream().filter(x -> x.startsWith("E")).forEach(System.out::println);
        lista.stream().filter(y -> y.equals("Jor")).forEach(System.out::println);

    }

    public void ordenar() {
        lista.stream().sorted().forEach(System.out::println);
        //Para ordenar de manera ascendente
        lista.stream().sorted((x, y) -> y.compareToIgnoreCase(x)).forEach(System.out::println);

    }

    public void transformar() {
        lista.stream().map(String::toUpperCase).forEach(System.out::println);
        //si en la lista numeros quisiera convertir los string a nteros y a cada uno de esos numeros
        //qusiera sumarle un numero adicional:
        //De forma imperativa:
        /*for (String el : numeros) {
            int num = Integer.parseInt(el) + 1;
            System.out.println(num);
        }*/
        numeros.stream().map(Integer::parseInt).forEach(System.out::println);

    }

    public void limitar() {
        lista.stream().limit(2).forEach(System.out::println);
    }

    public void contar() {
        long x = lista.stream().count();
        System.out.println(x);
    }


}