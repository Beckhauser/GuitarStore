package Specs;

import Enums.Builder;
import Enums.Type;
import Enums.Wood;

public abstract class InstrumentSpec {

    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public String getModel() {
        return model;
    }

    public boolean matches(InstrumentSpec otherSpecs) {
        if (this.builder != otherSpecs.getBuilder()) {
            return false;
        }
        if ((otherSpecs.getModel() != null) && (!otherSpecs.getModel().equals("")) && (!otherSpecs.getModel().toLowerCase().equals(otherSpecs.getModel().toLowerCase()))) {
            return false;
        }
        if (this.type != otherSpecs.getType()) {
            return false;
        }
        if (this.backWood != otherSpecs.getBackWood()) {
            return false;
        }
        if (this.topWood != otherSpecs.getTopWood()) {
            return false;
        }

        return true;
    }
}
