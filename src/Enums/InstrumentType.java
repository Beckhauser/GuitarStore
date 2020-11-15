package Enums;

public enum InstrumentType {
    GUITAR, BANJO, DOBRO, FIDDLE, BASS, MANDOLIN, SAXOFONE;

    public String toString(){
        switch(this){
            case GUITAR: return "Guitar";
            case BANJO: return "Banjo";
            case DOBRO: return "Dobro";
            case FIDDLE: return "Fiddle";
            case BASS: return "Bass";
            case MANDOLIN: return "Mandolin";
            case SAXOFONE: return "Saxofone";
        }
        return null;
    }
}
