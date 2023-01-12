
package abstractfactory;

public class ShapeFactory extends AbstractFactory{

    @Override
    public IColor getColor(String colorType) {
        return null;
    }

    @Override
    public IShape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        
        if(shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("square")){
            return new Square(); 
        }
        
        return null;
    }
    
}
