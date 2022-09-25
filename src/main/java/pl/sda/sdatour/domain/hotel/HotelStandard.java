package pl.sda.sdatour.domain.hotel;

public enum HotelStandard {

    ONE("*"),
    TWO("**"),
    THREE("***"),
    FOUR("****"),
    FIVE("*****");


    private final String displayValue;

    private HotelStandard(String displayValue){
        this.displayValue = displayValue;
    }
    public String getDisplayValue() {
        return displayValue;
    }
}
