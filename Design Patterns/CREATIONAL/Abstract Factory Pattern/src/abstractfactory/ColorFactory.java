
package abstractfactory;

public class ColorFactory extends AbstractFactory{

    @Override
    public IColor getColor(String colorType) {
        if(colorType == null){
            return null;
        }
        
        if(colorType.equalsIgnoreCase("blue")){
            return new Blue();
        } else if(colorType.equalsIgnoreCase("green")){
            return new Green();
        } else if(colorType.equalsIgnoreCase("red")){
            return new Red();
        }
        
        return null;
    }

    @Override
    public IShape getShape(String shapeType) {
        return null;
    }
    
}
