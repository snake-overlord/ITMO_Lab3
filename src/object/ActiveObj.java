package objects;

import enums.Action;
import enums.Adjective;
import enums.Ending;
import enums.Property;
import interfaces.Active;
import interfaces.WordForm;

import java.util.Objects;

public class ActiveObj extends Obj implements WordForm, Active {
    public String name;
    public String simpleName;
    public ActiveObj(String name){
        super(name);
        this.name = name;
        this.simpleName = name;
    }
    @Override
    public void setForm(Ending e){
        if(e==Ending.toThem)
            super.name = "им";
        else if(e==Ending.toTheir)
            super.name = "их";
        else if(e!=Ending.zero)
            super.name = this.name.substring(0, this.name.length()-1) + e.getEnding();
        else
            super.name = this.simpleName;
    }
    @Override
    public void Act(Action a){
        System.out.print(super.name+" "+a.getAct());
    }
    public void Act(Action act, Adjective e){
        System.out.print(super.name + " " + e.getAdj() + " " + act.getAct());
    }
    public void Act(Action act, Property p){
        System.out.print(p.getProp() + " " + super.name.toLowerCase() + " " + act.getAct());
    }
    public void Act(Action act, Property p, Adjective adj){
        System.out.print(p.getProp() + " " + super.name.toLowerCase() + " " + adj.getAdj() + " " + act.getAct());
    }
    public void Out(){
        System.out.print(" " + super.name.toLowerCase());
    }
}
