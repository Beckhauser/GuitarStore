import Enums.Builder;
import Enums.Style;
import Enums.Type;
import Enums.Wood;
import Instruments.Guitar;
import Instruments.Instrument;
import Instruments.Mandolin;
import Specs.GuitarSpec;
import Specs.InstrumentSpec;
import Specs.MandolinSpec;

import java.util.Iterator;
import java.util.List;

public class FindGuitar {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "StratoCastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER, 5);
        MandolinSpec whatRobertoLikes = new MandolinSpec(Builder.FENDER, "StratoCastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER, Style.A);

        List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
        List<Mandolin> matchingMandolins = inventory.search(whatRobertoLikes);

        if(!matchingGuitars.isEmpty()){
            System.out.println("Erin, talvez você goste dessas guitarras");
            for(Guitar guitar : matchingGuitars){
                GuitarSpec spec = (GuitarSpec)guitar.getSpec();

                System.out.println("Temos uma " + guitar.getSerialNumber() + " " + spec.getBuilder() +
                       " " + spec.getModel() + " " + spec.getType() + " " + spec.getNumStrings() + " cordas " +
                        spec.getBackWood() + " " + spec.getTopWood() + " no tampo. \n Ela pode ser " +
                        "sua por apenas U$" + guitar.getPrice());
            }
            }else {
            System.out.println("Desculpe não temos nada para você");
        }
        if(!matchingMandolins.isEmpty()){
            System.out.println("Erin, talvez você goste desses Mandolins");
            for(Mandolin mandolin : matchingMandolins){
                MandolinSpec spec = (MandolinSpec)mandolin.getSpec();

                System.out.println("Temos uma " + mandolin.getSerialNumber() + " " + spec.getBuilder() +
                       " " + spec.getModel() + " " + spec.getType() + " " + spec.getStyle() + " cordas " +
                        spec.getBackWood() + " " + spec.getTopWood() + " no tampo. \n Ela pode ser " +
                        "sua por apenas U$" + mandolin.getPrice());
            }
            }else {
            System.out.println("Desculpe não temos nada para você");
        }
    }

    private static void initializeInventory(Inventory inventory){
        GuitarSpec guitarSpec = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER, 5);
        GuitarSpec guitarSpec1 = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER, 5);
        MandolinSpec mandolinSpec1 = new MandolinSpec(Builder.FENDER, "Stratocastor", Type.ELETRIC, Wood.ALDER, Wood.ALDER, Style.A);
        inventory.addInstrument("V956993", 1499.95, guitarSpec);
        inventory.addInstrument("V958993", 1599.95, guitarSpec1);
        inventory.addInstrument("LALALA", 199.95, mandolinSpec1);
    }
}
