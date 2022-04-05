import composite.shapes.*;

public class Demo {
 
    public static void main(String[] args) {
    Elemento cuadrado = new SimpleShape(12.6, 12434);
    Elemento circulo = new SimpleShape(21.7, 54324);


    cuadrado.mostrarArticulo();
    circulo.mostrarArticulo();

    }
}
