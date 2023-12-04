package objects.humans;

import enums.*;
import interfaces.*;
import objects.Obj;

public class Astronauts extends Obj implements Visible {
    private String name;
    public Astronauts(String name){
        super(name);
        this.name = name;
    }
    public void simpleAct(SimpleAction act, Time time, HowToAct adv){
        System.out.print(this.name + time.getTime() + adv.getAdv() + " " + act.getAct());
    }
    public void turnInto(Turnable t, Time time, HowToAct adv){
        System.out.print(this.name + time.getTime() +  adv.getAdv() + " превратились в " + t.getName());
    }
    public void getThrough(Gettable g, Time time, HowToAct adv){
        System.out.print(this.name + time.getTime() + adv.getAdv() + " пробирались по " + g.getName());
    }
    public void Arm(Armable arm, Time time, HowToAct adv){
        System.out.print(this.name + time.getTime() + adv.getAdv() + " вооружились " + arm.getName());
    }
    public void Overcome(IfManaged i){
        if(i==IfManaged.MANAGED)
            System.out.print(this.name + " удалось преодолеть все препятствия" );
        else
            System.out.print(this.name + " не удалось преодолеть все препятствия" );
    }
    public void GetTo(IfManaged i, Gettable g){
        if(i==IfManaged.MANAGED)
            System.out.print(this.name + " удалось пробраться в " + g.getName());
        else
            System.out.print(this.name + " не удалось пробраться в " + g.getName());
    }
    public void setPlace(Place p){
        if(p==Place.Earth)
            this.name = super.name + " с далёкой планеты Земли";
    }


    @Override
    public String getName() {
        return name;
    }
}
