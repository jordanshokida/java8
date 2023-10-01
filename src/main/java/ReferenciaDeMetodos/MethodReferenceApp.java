package ReferenciaDeMetodos;


import java.util.Arrays;
import java.util.Comparator;

public class MethodReferenceApp {


    public static void main(String[] args) {
        MethodReferenceApp app = new MethodReferenceApp();
        app.operar();
        app.referenciarMetodoInstanciaObjetoArbitrario();
        Operacion op = app::referenciarMetodoInstanciaObjetoParticular;
        op.saludar();
        app.referenciarConstructor();
    }


    public static void referenciarMetodoStatic() {
        System.out.println("Metodos referido static");
    }

    public void referenciarMetodoInstanciaObjetoArbitrario() {
        String[] nombres = {"Jor", "Juan", "José"};
        Arrays.sort(nombres, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        //Para hacer lo mismo pero con expresiones lambda
        Arrays.sort(nombres, (s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println(Arrays.toString(nombres));
        //Para reducirlo aún más con referencias a metodos
        Arrays.sort(nombres, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(nombres));
    }

    public void referenciarMetodoInstanciaObjetoParticular() {
        System.out.println("Metodo referido a instancia objeto particular");
    }

    public void referenciarConstructor() {
        /*IPersona iper = new IPersona() {

            @Override
            public Persona crear(int id, String nombre) {
                return new Persona(id, nombre);
            }
        };
        iper.crear(1, "Jor");*/
        //Con expresion lambda
       /* IPersona iper2 = (x, y) -> new Persona(x, y);
        Persona per = iper2.crear(1, "Jor");
        System.out.println(per.getId() + " " + per.getNombre());*/
        //Con referencia de metodos
        IPersona iper3 = Persona::new;
        Persona per = iper3.crear(1, "Jor");
        System.out.println(per.getId() + " " + per.getNombre());
    }


    public void operar() {
        /*Operacion op= ()-> MethodReferenceApp.referenciarMetodoStatic();
        op.saludar();*/

        //Como es un metodo static, tengo que apoyarme en la clase MethodReferenceApp
        //e invocar al metodo referenciado por "::"
        //No se pueden enviar parametros en estos casos
        Operacion op2 = MethodReferenceApp::referenciarMetodoStatic;
        op2.saludar();
    }


}

