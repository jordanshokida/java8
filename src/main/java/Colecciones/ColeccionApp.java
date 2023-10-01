package Colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ColeccionApp {
    private List<String> lista;

    public static void main(String[] args) {
        ColeccionApp app = new ColeccionApp();
        app.llenarLista();
        app.usarForEach();
        app.usarRemoveIf();
        app.usarSort();
    }


    public void llenarLista() {
        lista = new ArrayList<>();
        lista.add("jor");
        lista.add("Juan");
        lista.add("José");
    }

    public void usarForEach() {
        //Así se hacía antes de java 8
       /* for (String el : lista) {
            System.out.println(el);
        }*/
        //Con expresiones lambda
        //El metodo foreach nos pide un consumer, que
        //es una interfaz funcional que tiene un unico metodo accept
        //(tiene parametro pero no devuelve nada)
        //el foreach necesita implementar esa interfaz consumer
        /*lista.forEach(x -> System.out.println(x));*/
        //Con referencia de metodos
        lista.forEach(System.out::println);


    }

    public void usarRemoveIf() {
        /*Iterator<String> it= lista.listIterator();
           while(it.hasNext()) {
               if (it.next().equalsIgnoreCase("Jor")) {
                   it.remove();
               }
           }*/
        /*System.out.println(lista);*/
           //Para hacerlo con programacion funcional
        lista.removeIf(x->x.equalsIgnoreCase("Jor"));
        System.out.println(lista);

    }


    public void usarSort() {
        lista.sort((x,y)->x.compareToIgnoreCase(y));
        System.out.println(lista);
    }


}
