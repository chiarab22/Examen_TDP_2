package composite.shapes;

public abstract class Elemento implements Shape{
    protected double precio;
    protected int codigo;


    public Elemento(double precio, int codigo) {
        this.precio = precio;
        this.codigo = codigo;
    }


    public Elemento( int codigo) {
        this.codigo = codigo;
    }


    @Override
    public double getPrecio() {
        return Math.round(this.precio*100.0)/100.0;
        
    }

    @Override
    public int getCodigo() {
        return this.codigo;
        
    }
    
    public abstract void mostrarArticulo();
}
