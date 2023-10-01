package InterfacesFuncionales;

import Lambdas.Operacion;

public class FuncInterApp {
    public static void main(String[] args) {
        FuncInterApp app= new FuncInterApp();
        double rta= app.operar(2,3);
        System.out.println(rta);

    }

    public double operar(double x,double y) {
        //En la interfaz se coloca arriba, @FunctionalInterface
        //Por ende debe tener solo un metodo dentro de ella
        Operacion op = (n1, n2) -> n1 + n2;
        return op.calcular(x,y);
    }
}
