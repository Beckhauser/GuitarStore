package Enums;

public enum Wood {
    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA, SPRUCE;

    public String toString(){
        switch (this){
            case INDIAN_ROSEWOOD: return "indian_rosewood";
            case BRAZILIAN_ROSEWOOD: return "brazilian_rosewood";
            case MAHOGANY: return "mohogany";
            case MAPLE: return "maple";
            case COCOBOLO: return "cocobolo";
            case CEDAR: return "cedar";
            case ADIRONDACK: return "adirondack";
            case ALDER: return "alder";
            case SITKA: return "sitka";
            case SPRUCE: return "spruce";
        }
        return null;
    }
}
