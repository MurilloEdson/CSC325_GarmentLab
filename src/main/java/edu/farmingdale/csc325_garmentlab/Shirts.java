package edu.farmingdale.csc325_garmentlab;

/**
 *
 * @author soblab
 */
public class Shirts implements Professional,Casual,Party{
    String name;

    public String getName() {
        return name;
    }public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String getType(){
        return switch (name) {
            case "DressShirt" -> "Professional";
            case "TShirt" -> "Casual";
            case "LowTop" -> "Party";
            default -> "";
        };
    }
}
