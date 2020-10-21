import java.util.Iterator;
import java.util.List;

public class FindGuitar {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "StratoCastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER, 5);

        List<Guitar> matchingGuitars = inventory.search(whatErinLikes);

        if(!matchingGuitars.isEmpty()){
            System.out.println("Erin, talvez você goste dessas guitarras");
            for(Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext();){
                Guitar guitar = (Guitar)i.next();
                GuitarSpec spec = guitar.getSpec();
                System.out.println("Temos uma " + guitar.getSerialNumber() + " " + spec.getBuilder() +
                       " " + spec.getModel() + " " + spec.getType() + " " + spec.getNumStrings() + " cordas " +
                        spec.getBackWood() + " " + spec.getTopWood() + " no tampo. \n Ela pode ser " +
                        "sua por apenas U$" + guitar.getPrice());
            }
            }else {
            System.out.println("Desculpe não temos nada para você");
        }
    }

    private static void initializeInventory(Inventory inventory){
        GuitarSpec guitarSpec = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER, 5);
        GuitarSpec guitarSpec1 = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER, 6);
        inventory.addGuitar("V956993", 1499.95, guitarSpec);
        inventory.addGuitar("V958993", 1599.95, guitarSpec1);
    }
}
