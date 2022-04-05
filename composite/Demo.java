package composite;
import composite.shapes.*;

public class Demo {
 
    public static void main(String[] args) {
    Elemento mueble = new SimpleShape(12.6, 12434);
    Elemento mesa = new SimpleShape(21.7, 54324);
    CompoundShape compuesto = new CompoundShape(
        new SimpleShape(123.5, 6546),
        new SimpleShape(12.45, 6841),
        new SimpleShape(143, 232424)
    );
     compuesto.mostrarArticulo();
     

     mueble.mostrarArticulo();
     mesa.mostrarArticulo();
   

    }
}
