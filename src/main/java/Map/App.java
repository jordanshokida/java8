package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class App {

    private Map<Integer, String> map;

    public static void main(String[] args) {
        App app = new App();
        app.poblar();
        app.insertarSiAusente();
        app.OperarSiPresente();
        app.obtenerOrPredeterminado();
        app.recolectar();
        app.imprimirV8();


    }


    public void poblar() {
        map = new HashMap<>();
        map.put(1, "Jor");
        map.put(2, "Emanuel");
        map.put(3, "Hola");
    }


    public void imprimirV8() {
        map.entrySet().stream().forEach(System.out::println);
    }

    public void recolectar() {
        //Se utiliza para extraer de una lista o mapa a otra lista o mapa, los datos que pasen determinada condicion
        Map<Integer, String> mapaRecolectado = map.entrySet().stream()
                .filter(e -> e.getValue().contains("J"))
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
        mapaRecolectado.forEach((k, v) -> System.out.println("Llave: " + k + " Valor: " + v));
    }

    public void insertarSiAusente() {
        map.putIfAbsent(4, "José");
    }

    public void OperarSiPresente() {
        map.computeIfPresent(3, (k, v) -> k + v);
        System.out.println(map.get(3));
    }

    public void obtenerOrPredeterminado() {
        String x = map.getOrDefault(5, "Valor por defecto");
        System.out.println(x);
    }


}
