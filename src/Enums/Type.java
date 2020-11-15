package Enums;

public enum Type {
    ACOUSTIC, ELETRIC, ALTO;

    @Override
    public String toString() {
        switch(this){
            case ACOUSTIC: return "acoustic";
            case ELETRIC: return "eletric";
            case ALTO: return "alto";

        };
        return null;
    }
}