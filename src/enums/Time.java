package enums;

public enum Time {
    Simple(""),
    AtThatTime(" в это время"),
    Meanwhile(" между тем");

    private final String name;
    Time(String name){
        this.name = name;
    }
    public String getTime(){
        return name;
    }
}
