package enums;

public enum SimpleAction {
    GoUp("поднимались кверху"),
    BeOutOfSight("скрылись из виду"),
    NotGoAway("не расходились"),
    Hope("надеялись"),
    Return("вернутся");
    private String name;
    SimpleAction(String name) {
        this.name = name;
    }

    public String getAct() {
        return name;
    }
}
