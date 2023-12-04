package enums;

public enum HowToAct {
    simple(""),
    faster(" всё быстрей и быстрей"),
    atAll(" совсем"),
    yet(" ещё"),
    again(" снова"),
    already(" уже");

    private final String name;
    HowToAct(String name){
        this.name = name;
    }
    public String getAdv(){
        return name;
    }
}
