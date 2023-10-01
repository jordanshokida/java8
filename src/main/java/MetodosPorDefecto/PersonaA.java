package MetodosPorDefecto;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public interface PersonaA {
    public void caminar();

    default public void hablar(){
        System.out.println("Saludos A");
    }
}
