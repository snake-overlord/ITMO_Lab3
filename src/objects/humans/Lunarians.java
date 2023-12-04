package objects.humans;

import enums.HowToAct;
import enums.SimpleAction;
import enums.Time;
import interfaces.Visible;
import objects.Obj;

public class Lunarians extends Obj {
    private final String name;
    public Lunarians(String name){
        super(name);
        this.name = name;
    }
    public void simpleAct(SimpleAction act, Time time, HowToAct adv){
        System.out.print(this.name + time.getTime() + adv.getAdv() + " " + act.getAct());
    }
    public void seeSb(Visible v, Time time, HowToAct adv){
        System.out.print(this.name + time.getTime() + adv.getAdv() + " увидят " + v.getName());
    }
    public void lostHopeToSeeSb(Visible v, Time time, HowToAct adv){
        System.out.print(time.getTime() + this.name + " начали терять надежду" + adv.getAdv() + " увидеть " + v.getName());
    }
    public void haveSthToWait(SthToWait sth){
        if(sth==SthToWait.NOTHING)
            System.out.print("больше нечего было ждать");
        else
            System.out.print("им было чего ждать");
    }


}
