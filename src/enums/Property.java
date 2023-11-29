package enums;

public enum Property {
    barelyVisible("едва заметные"),
    distant("далёкой"),
    lunar("Лунные"),
    their("своих"),
    inclinedIcy("наклонному ледяному"),
    tooWeak("слишком слабую"),
    all("все"),
    icicle("сосульчатый");

    private final String name;
    Property(String name){
        this.name = name;
    }
    public String getProp(){
        return name;
    }
}
