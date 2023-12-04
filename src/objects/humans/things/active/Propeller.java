package objects.things.active;

import objects.things.ThrustQuality;
import objects.Obj;

public class Propeller extends Obj {
    private final String name;
    public Propeller(String name){
        super(name);
        this.name = name;
    }
    public void createThrust(ThrustQuality t){
        if(t==ThrustQuality.STRONG)
            System.out.print(this.name + " создавал достаточно сильную тягу");
        else
            System.out.print(this.name + " создавал слишком слабую тягу");
    }
}