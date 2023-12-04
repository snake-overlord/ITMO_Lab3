package objects.things;

import enums.Place;
import interfaces.Gettable;
import interfaces.Turnable;
import objects.Obj;

public class Cave extends Obj implements Gettable {
    private String name;
    public Cave(String name){
        super(name);
        this.name = name;
    }
    public void hasExit(Place p){
        if(p==Place.MoonSurface)
            System.out.print(" из которой был выход на поверхность Луны");
        else
            System.out.print(" из которой был выход наружу");
    }
    @Override
    public String getName(){
        return name;
    }
}
