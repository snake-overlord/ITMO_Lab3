package objects.things;

import enums.Place;
import interfaces.Armable;
import interfaces.Gettable;
import interfaces.Turnable;
import objects.Obj;

public class IceCrusher extends Obj implements Armable {
    private String name;
    public IceCrusher(String name){
        super(name);
        this.name = name;
    }
    @Override
    public String getName(){
        return name;
    }
}