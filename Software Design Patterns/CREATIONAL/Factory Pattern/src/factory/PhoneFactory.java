
package factory;

public class PhoneFactory {
    
    public InterfacePhone getPhone(String phoneType){
        
        if(phoneType == null){
            return null;
        }
        
        if(phoneType.equalsIgnoreCase("apple")){
            return new Apple();
        } else if(phoneType.equalsIgnoreCase("google")){
            return new Google();
        } else if(phoneType.equalsIgnoreCase("samsung")){
            return new Samsung();
        }
        
        return null;
    }
}
