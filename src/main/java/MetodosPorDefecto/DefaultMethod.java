package MetodosPorDefecto;

public class DefaultMethod implements PersonaA,PersonaB {
    public static void main(String[] args) {
        DefaultMethod app= new DefaultMethod();
        app.hablar();
    }

    //Los metodos por defecto están implementados, de manera que cualquier clase que
    //implemente esta interfaz, tenga acceso al metodo ya definido por defecto
    //Eso se logra poniendo default en la declaracion del metodo en la interfaz
    //y poniendo de la siguiente manera, en el caso de haber dos interfazes que tengan un mismo nombre de metodo:
   /* @Override
    public void hablar() {
        PersonaA.super.hablar();
    }*/
    //En el caso de querer cambiar el contenido del metodo, se puede
    //sobreescribir asi:
    @Override
    public void hablar() {
        System.out.println("Este es una tercer forma del metodo hablar");;
    }

    @Override
    public void caminar() {

    }


}
