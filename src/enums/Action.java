package enums;

public enum Action {
    GoUp("поднимались кверху"),
    TurnInto("превратились в"),
    BeOutOfSight("скрылись из виду"),
    NotGoAway("не расходились"),
    Hope("надеялись"),
    Return("вернутся"),
    WillSee("увидят"),
    BeginToLose("начали терять"),
    ToSee("увидеть"),
    WasToWait("было ждать"),
    GotThrough("пробирались"),
    WasThin("был крайне разрежен"),
    Make("создавал"),
    Arm("вооружились"),
    ManageToOvercome("удалось преодолеть"),
    GetThrough("пробраться в"),
    GetInto("проникнуть в"),
    Was("был");

    private String name;
    Action(String name) {
        this.name = name;
    }

    public String getAct() {
        return name;
    }
    public void printAct(Adjective a){
        System.out.print(a.getAdj() + " "+ getAct());
    }
    public void printAct(){
        System.out.print(getAct());
    }
    }
