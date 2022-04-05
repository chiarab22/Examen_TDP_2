package composite;
import composite.shapes.*;

public class Demo {
 
    public static void main(String[] args) {
    Elemento mueble = new SimpleShape(126.6, 12434);
    Elemento mesa = new SimpleShape(214.7, 54324);
    Elemento silla = new SimpleShape(15.7, 15829402);

    CompoundShape compuesto = new CompoundShape(
        new SimpleShape(123.5, 6546),
        new SimpleShape(12.45, 6841),
        new SimpleShape(143, 232424)
    );


    CompoundShape compuesto2 = new CompoundShape(
        new SimpleShape(12.42, 6845),
        new SimpleShape(6.78, 5895),
        new SimpleShape(7, 58395)
    );

     compuesto.mostrarArticulo();
     compuesto2.mostrarArticulo();


     mueble.mostrarArticulo();
     mesa.mostrarArticulo();
     silla.mostrarArticulo();
   

    }
}
