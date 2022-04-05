package composite.shapes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundShape extends SimpleShape{
    protected List<Shape> children = new ArrayList<>();
    
   // public CompoundShape(int codigo, Shape ... components) {
   //     super(codigo);
    //    this.precio = setPrecio();
    //    add(components);


  //  }

    public CompoundShape(Shape ... components) {
        super(0,0);
        this.precio = setPrecio();
        add(components);
    } 
    
    public double setPrecio(){
        double precioL = 0;
        if (children.size() != 0 ) {
            for (Shape c : children) {
                precioL += c.getPrecio();
            }
              }else{
                precioL =0;
        }
        return precioL * 0.9;
    }
  
  @Override
    public void mostrarArticulo() {
        System.out.println("Elementos del kit:");
        for (Shape c : children) {
                System.out.println("Artículo código: " + c.getCodigo() + " Precio: " +  c.getPrecio());
                
            } 
            System.out.println("Fin elementos del kit");
    }
    public void add(Shape component) {
        children.add(component);
    }

    public void add(Shape... components) {
        children.addAll(Arrays.asList(components));
    }

    public void remove(Shape child) {
        children.remove(child);
    }

    public void remove(Shape... components) {
        children.removeAll(Arrays.asList(components));
    }

    public void clear() {
        children.clear();
    }
}