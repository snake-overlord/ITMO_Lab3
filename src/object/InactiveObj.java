package objects;

import enums.Ending;
import enums.Property;
import interfaces.WordForm;

import java.util.Objects;

public class InactiveObj extends Obj implements WordForm {
    public String name;
    public String simpleName;
    public InactiveObj(String name){
        super(name);
        this.name = name;
        this.simpleName = name;
    }
    @Override
    public void setForm(Ending e){
        if(e!=Ending.zero)
            super.name = this.name.substring(0, this.name.length()-1) + e.getEnding();
        else
            super.name = this.simpleName;
    }
    public void Out(Property p){
        System.out.print(" "+p.getProp()+" "+super.name.toLowerCase()+" ");
    }
    public void Out(){
        System.out.print(" "+super.name+" ");
    }


}
