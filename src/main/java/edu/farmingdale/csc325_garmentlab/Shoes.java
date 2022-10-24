package edu.farmingdale.csc325_garmentlab;

/**
 *
 * @author soblab
 */
public class Shoes implements Professional,Casual,Party{
    String name;
    
    public String getName() {
        return name;
    }public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String getType(){
        return switch (name) {
            case "DressShoes" -> "Professional";
            case "Sneackers" -> "Casual";
            case "HighTops" -> "Party";
            default -> "";
        };
    }
}
