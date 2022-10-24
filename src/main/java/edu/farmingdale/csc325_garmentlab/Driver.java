package edu.farmingdale.csc325_garmentlab;

/**
 *
 * @author MurilloEdson
 */
public class Driver {
    public static void main(String[] args) {
        //Shirts are initialized
        Shirts shrt1 =  new Shirts();Shirts shrt2 =  new Shirts();Shirts shrt3 =  new Shirts();
        
        //Pants are initialized
        Pants pnt1 = new Pants();Pants pnt2 = new Pants();Pants pnt3 = new Pants();
        
        //Shoes are initialized
        Shoes shs1 = new Shoes();Shoes shs2 = new Shoes();Shoes shs3 = new Shoes();

        //Shirts are Tested
        shrt1.setName("DressShirt");System.out.println(shrt1.getType());
        shrt2.setName("TShirt");System.out.println(shrt2.getType());
        shrt3.setName("LowTop");System.out.println(shrt3.getType());
        
        //Pants are Tested
        pnt1.setName("DressPants");System.out.println(pnt1.getType());
        pnt2.setName("SweatPants");System.out.println(pnt2.getType());
        pnt3.setName("Joggers");System.out.println(pnt3.getType());
        
        //Shoes are Tested
        shs1.setName("DressShoes");System.out.println(shs1.getType());
        shs2.setName("Sneackers");System.out.println(shs2.getType());
        shs3.setName("HighTops");System.out.println(shs3.getType());
    }
}
