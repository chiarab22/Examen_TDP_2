package composite.shapes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundShape extends SimpleShape{
    protected List<Shape> children = new ArrayList<>();
    
    public CompoundShape(double precio, int codigo) {
        super(precio, codigo);

    }

    public CompoundShape(Shape ... components) {
        super(0,0);
        add(components);
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