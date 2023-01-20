
package facade;

public class PhoneFacade {
    private InterfacePhone apple;
    private InterfacePhone google;
    private InterfacePhone samsung;
    
    PhoneFacade(){
        apple = new Apple();
        google = new Google();
        samsung = new Samsung();
    }
    
    public void getApple(){
        apple.showDetails();
    }
    
    public void getGoogle(){
        google.showDetails();
    }
    
    public void getSamsung(){
        samsung.showDetails();
    }
    
    public void getAllPhones(){
        apple.showDetails();
        google.showDetails();
        samsung.showDetails();
    }
}
