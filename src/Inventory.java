import Instruments.Guitar;
import Instruments.Instrument;
import Instruments.Mandolin;
import Specs.GuitarSpec;
import Specs.InstrumentSpec;
import Specs.MandolinSpec;

import java.util.*;

public class Inventory {
    private List<Instrument> inventory;

    public Inventory(){
        inventory = new LinkedList<Instrument>();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument = null;
        if (spec instanceof GuitarSpec) {
            instrument = new Guitar(serialNumber, price, (GuitarSpec)spec);
        } else if (spec instanceof MandolinSpec) {
            instrument = new Mandolin(serialNumber, price, (MandolinSpec)spec);
        }

        inventory.add(instrument);
    }

    public Instrument getInstrument(String serialNumber) {
        for (Instrument instrument : this.inventory) {
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec wantedSpec){
        List<Guitar> foundGuitars = new LinkedList();
        for (Instrument instrument : this.inventory) {
            if (instrument instanceof Guitar) {
                Guitar guitar = (Guitar) instrument;
                GuitarSpec guitarSpec = (GuitarSpec) guitar.getSpec();
                if (guitarSpec.matches(wantedSpec)) {
                    foundGuitars.add(guitar);
                }
            }
        }
        return foundGuitars;
    }

    public List<Mandolin> search(MandolinSpec wantedSpec){
        List<Mandolin> foundMandolins = new LinkedList();
        for (Instrument instrument : this.inventory) {
            if (instrument instanceof Mandolin) {
                Mandolin mandolin = (Mandolin) instrument;
                MandolinSpec mandolinSpec = (MandolinSpec) mandolin.getSpec();
                if (mandolinSpec.matches(wantedSpec)) {
                    foundMandolins.add(mandolin);
                }
            }
        }
        return foundMandolins;
    }
}
