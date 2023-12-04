import enums.HowToAct;
import enums.Place;
import enums.SimpleAction;
import enums.Time;
import objects.Hours;
import objects.humans.Astronauts;
import objects.humans.IfManaged;
import objects.humans.Lunarians;
import objects.humans.SthToWait;
import objects.things.*;
import objects.things.active.Air;
import objects.things.active.Propeller;

public class Main {
    public static void main(String[] args) {
        Astronauts astronauts = new Astronauts("Космонавты");
        Astronauts aliens = new Astronauts("пришельцы");
        Astronauts afriends = new Astronauts("своих друзей");
        Astronauts athey = new Astronauts("они");
        Astronauts atheir = new Astronauts("их");
        Astronauts athem = new Astronauts("им");
        Astronauts ainv = new Astronauts("");
        Lunarians lunarians1 = new Lunarians("Лунатики");
        Lunarians lunarians2 = new Lunarians("Лунные коротышки");
        Lunarians lthey = new Lunarians("они");
        Lunarians linv = new Lunarians("");
        Dots dots = new Dots("едва заметные точки");
        Tunnel tunnel = new Tunnel("наклонному ледяному тоннелю");
        Air air = new Air("Воздух");
        Propeller propeller = new Propeller("пропеллер");
        IceCrusher iceCrusher = new IceCrusher("ледорубами");
        Grotto grotto = new Grotto("сосульчатый грот");
        Cave cave = new Cave("пещеру");

        astronauts.simpleAct(SimpleAction.GoUp, Time.Meanwhile, HowToAct.faster);
        System.out.print(". \nСкоро ");

        athey.turnInto(dots, Time.Simple, HowToAct.simple);
        System.out.print(" и наконец");
        ainv.simpleAct(SimpleAction.BeOutOfSight, Time.Simple, HowToAct.atAll);
        System.out.print(". \n");

        lunarians1.simpleAct(SimpleAction.NotGoAway, Time.Simple, HowToAct.simple);
        System.out.print(", словно ");
        linv.simpleAct(SimpleAction.Hope, Time.Simple, HowToAct.simple);
        System.out.print(", что ");
        aliens.setPlace(Place.Earth);
        aliens.simpleAct(SimpleAction.Return, Time.Simple, HowToAct.yet);
        System.out.print(", и ");
        lthey.seeSb(atheir, Time.Simple, HowToAct.again);
        System.out.print(". \n");

        Hours.setTime(1);
        Hours.setTime(2);
        Hours.setTime(3);
        System.out.print("\n");

        lunarians2.lostHopeToSeeSb(afriends, Time.Simple, HowToAct.again);
        System.out.print(". \nИ действительно, ");

        linv.haveSthToWait(SthToWait.NOTHING);
        System.out.print(". \n");

        tunnel.setPlace(Place.MoonShell);
        astronauts.getThrough(tunnel, Time.AtThatTime, HowToAct.already);
        System.out.print(". \n");

        air.wasThin();
        System.out.print(", поэтому ");
        propeller.createThrust(ThrustQuality.WEAK);
        System.out.print(". \n");

        astronauts.Arm(iceCrusher, Time.Simple, HowToAct.simple);
        System.out.print(" и ");
        athem.Overcome(IfManaged.MANAGED);
        System.out.print(" и ");
        athem.GetTo(IfManaged.MANAGED, grotto);
        System.out.print(", а оттуда ");
        athem.GetTo(IfManaged.MANAGED, cave);
        System.out.print(",");
        cave.hasExit(Place.MoonSurface);
        System.out.print(". \n");



    }
}