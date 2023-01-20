
package abstractfactory;

public class Main {

    public static void main(String[] args) {
        
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        
        IColor color1 = colorFactory.getColor("blue");
        color1.fill();
        
        IColor color2 = colorFactory.getColor("green");
        color2.fill();
        
        IColor color3 = colorFactory.getColor("red");
        color3.fill();
        
        System.out.println();
        
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        
        IShape shape1 = shapeFactory.getShape("circle");
        shape1.draw();
        
        IShape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();
        
        IShape shape3 = shapeFactory.getShape("square");
        shape3.draw();
    }
    
}
