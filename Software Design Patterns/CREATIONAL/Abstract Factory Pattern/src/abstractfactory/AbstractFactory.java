
package abstractfactory;

public abstract class AbstractFactory {
    public abstract IColor getColor(String colorType);
    public abstract IShape getShape(String shapeType);
}
