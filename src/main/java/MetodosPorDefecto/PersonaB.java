package MetodosPorDefecto;

public interface PersonaB {
    default public void hablar(){
        System.out.println("Saludos B");
    }
}
