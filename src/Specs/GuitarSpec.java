package Specs;

import Enums.Builder;
import Enums.Type;
import Enums.Wood;

public class GuitarSpec extends InstrumentSpec {

    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
        super(builder, model, type, backWood, topWood);
        this.numStrings = numStrings;
    }

    public int getNumStrings(){
        return numStrings;
    }

    @Override
    public boolean matches(InstrumentSpec otherSpec) {
        if (genericSpecsAreDifferent(otherSpec))
            return false;

        if (isOtherInstrumentSpec(otherSpec))
            return false;

        GuitarSpec spec = (GuitarSpec)otherSpec;
        if (numStringsIsDifferent(spec))
            return false;

        return true;
    }

    private boolean numStringsIsDifferent(GuitarSpec spec) {
        return numStrings != spec.numStrings;
    }

    private boolean genericSpecsAreDifferent(InstrumentSpec otherSpec) {
        return !super.matches(otherSpec);
    }

    private boolean isOtherInstrumentSpec(InstrumentSpec otherSpec) {
        return !(otherSpec instanceof GuitarSpec);
    }
}
