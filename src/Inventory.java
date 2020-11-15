
import java.util.*;

public class Inventory {
    private List<Instrument> inventory;

    public Inventory(){
        inventory = new LinkedList<Instrument>();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument = new Instrument(serialNumber, price, spec);
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

    public List search(InstrumentSpec searchSpec) {
        List matchingInstruments = new LinkedList();
        for(Iterator i = inventory.iterator(); i.hasNext();) {
            Instrument instrument = (Instrument)i.next();
            if (instrument.getSpec().matches(searchSpec)){
                matchingInstruments.add(instrument);
            }
        }
        return matchingInstruments;
    }


}
