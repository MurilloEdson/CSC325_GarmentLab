package edu.farmingdale.csc325_garmentlab;

/**
 *
 * @author soblab
 */
public class Pants implements Professional,Casual,Party{
    String name;
    
    public String getName() {
        return name;
    }public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String getType(){
        return switch (name) {
            case "DressPants" -> "Professional";
            case "SweatPants" -> "Casual";
            case "Joggers" -> "Party";
            default -> "";
        };
    }
}
