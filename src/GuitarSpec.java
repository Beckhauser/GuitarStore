public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings = numStrings;
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

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumStrings(){
        return numStrings;
    }

    public boolean matches(GuitarSpec otherSpecs){
        if(this.builder != otherSpecs.getBuilder()){
            return false;
        }
        if((otherSpecs.getModel() != null) && (!otherSpecs.getModel().equals("")) && (!otherSpecs.getModel().toLowerCase().equals(otherSpecs.getModel().toLowerCase()))){
            return false;
        }
        if(this.type != otherSpecs.getType()){
            return false;
        }
        if(this.backWood != otherSpecs.getBackWood()){
            return false;
        }
        if(this.topWood != otherSpecs.getTopWood()){
            return false;
        }
        if(this.numStrings != otherSpecs.numStrings){
            return false;
        }
        return true;
    }
}
