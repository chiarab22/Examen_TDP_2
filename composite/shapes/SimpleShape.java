package composite.shapes;

public class SimpleShape extends Elemento{

    public SimpleShape(double precio, int codigo) {
        super(precio, codigo);
    }

    public SimpleShape(int codigo) {
        super(codigo);
    }


    @Override
    public void mostrarArticulo() {
        System.out.println("Artículo código: " + getCodigo() + " Precio: " +  getPrecio());
        
    }

  
    
}
