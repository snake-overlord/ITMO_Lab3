package objects.things;

import enums.Place;
import interfaces.Gettable;
import interfaces.Turnable;
import objects.Obj;

public class Tunnel extends Obj implements Gettable {
    private String name;
    public Tunnel(String name){
        super(name);
        this.name = name;
    }
    public void setPlace(Place p){
        if(p==Place.MoonShell)
            this.name = super.name + " в оболочке Луны";
    }
    @Override
    public String getName(){
        return name;
    }
}
