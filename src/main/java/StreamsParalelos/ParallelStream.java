package StreamsParalelos;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    private List<Integer> numeros;

    public void llenar() {
        numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numeros.add(i);
        }
    }

    public void probarStream() {
        numeros.stream().forEach(System.out::println);
    }

    public void probarParalelo() {
        //se crea un procesamiento asincrono con hilos de esta manera
        //no es recomendable usarlos cuando estamos trabajando con java EE Container
        //ya que empeoran el rendimiento de la aplicacion
        numeros.parallelStream().forEach(System.out::println);

    }

    public static void main(String[] args) {
        ParallelStream app = new ParallelStream();
        app.llenar();
        app.probarStream();
        app.probarParalelo();
    }

}
