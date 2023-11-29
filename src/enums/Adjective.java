package enums;

public enum Adjective {
    faster("всё быстрей и быстрей"),
    atAll("совсем"),
    yet("ещё"),
    again("снова"),
    already("уже");

    private final String name;
    Adjective(String name){
        this.name = name;
    }
    public String getAdj(){
        return name;
    }
}
