package enums;

public enum Ending {
    zero(""),
    toThem(""),
    toTheir(""),
    e("е"),
    i("и"),
    yi("ы"),
    ov("ов"),
    u("у"),
    yu("ю");
    private final String name;
    Ending(String name){
        this.name = name;
    }
    public String getEnding(){
        return name;
    }
}
