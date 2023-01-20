
package proxy;

public class Main {

    public static void main(String[] args) {
        
        ImageInterface image = new ProxyImage("sample_img.jpg");
        
        //image will be loaded from disk
        image.display();
        
        System.out.println();
        
        //image will not be loaded from disk
        image.display();
    }
    
}
