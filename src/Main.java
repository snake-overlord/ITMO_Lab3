import enums.Action;
import enums.Adjective;
import enums.Ending;
import enums.Property;
import objects.ActiveObj;
import objects.InactiveObj;
import objects.Time;

public class Main {
    public static void main(String[] args){
        ActiveObj astronauts = new ActiveObj("Космонавты");
        ActiveObj they = new ActiveObj("Они");
        InactiveObj dots = new InactiveObj("точки");
        ActiveObj lunatics = new ActiveObj("Лунатики");
        ActiveObj aliens = new ActiveObj("пришельцы");
        InactiveObj planet = new InactiveObj("планета");
        InactiveObj Earth = new InactiveObj("Земля");
        ActiveObj shorties = new ActiveObj("Коротышки");
        InactiveObj hope = new InactiveObj("надежду");
        InactiveObj nothing = new InactiveObj("нечего");
        InactiveObj tunnel = new InactiveObj("тоннель");
        InactiveObj shell = new InactiveObj("оболочка");
        InactiveObj Moon = new InactiveObj("Луна");
        ActiveObj air = new ActiveObj("Воздух");
        ActiveObj propeller = new ActiveObj("пропеллер");
        InactiveObj thrust = new InactiveObj("тяга");
        InactiveObj iceAxes = new InactiveObj("ледорубы");
        InactiveObj obstacles = new InactiveObj("препятствия");
        InactiveObj grotto = new InactiveObj("грот");
        InactiveObj cave = new InactiveObj("пещера");
        InactiveObj exit = new InactiveObj("выход");
        InactiveObj surface = new InactiveObj("поверхность");

        //1 предложение
        astronauts.Act(Action.GoUp, Adjective.faster);
        System.out.print(".\n");
        //2 предложение
        they.Act(Action.TurnInto);
        dots.Out(Property.barelyVisible);
        System.out.print(" и наконец ");
        Action.BeOutOfSight.printAct(Adjective.atAll);
        System.out.print(".\n");
        //3 предложение
        lunatics.Act(Action.NotGoAway);
        System.out.print(", словно ");
        Action.Hope.printAct();
        System.out.print(", что");
        aliens.Out();
        System.out.print(" с");
        planet.setForm(Ending.yi);
        planet.Out(Property.distant);
        Earth.setForm(Ending.i);
        Earth.Out();
        Action.Return.printAct(Adjective.yet);
        System.out.print(" и ");
        they.Act(Action.WillSee, Adjective.again);
        they.setForm(Ending.toTheir);
        they.Out();
        System.out.print(".\n");
        //4 предложение
        Time.setTime(1);
        System.out.print(". ");
        Time.setTime(2);
        System.out.print(". ");
        Time.setTime(3);
        System.out.print(".\n");
        //5 предложение
        shorties.Act(Action.BeginToLose, Property.lunar);
        hope.setForm(Ending.u);
        hope.Out();
        Action.ToSee.printAct(Adjective.again);
        astronauts.setForm(Ending.ov);
        astronauts.Out();
        System.out.print(".\n");
        //6 предложение
        System.out.print("И действительно,");
        nothing.Out();
        Action.WasToWait.printAct();
        System.out.print(".\n");
        //7 предложение
        astronauts.setForm(Ending.zero);
        astronauts.Act(Action.GotThrough, Adjective.already);
        tunnel.setForm(Ending.yu);
        tunnel.Out(Property.inclinedIcy);
        System.out.print(" в");
        shell.setForm(Ending.e);
        shell.Out();
        Moon.setForm(Ending.yi);
        Moon.Out();
        System.out.print(".\n");
        //8 предложение
        air.Act(Action.WasThin);
        System.out.print(", поэтому ");
        propeller.Act(Action.Make);
        thrust.setForm(Ending.u);
        thrust.Out(Property.tooWeak);
        System.out.print(".\n");
        //9 предложение
        System.out.print("Всё же с помощью");
        iceAxes.setForm(Ending.ov);
        iceAxes.Out();
        System.out.print(", которыми ");
        Action.Arm.printAct();
        astronauts.Out();
        System.out.print(", ");
        they.setForm(Ending.toThem);
        they.Act(Action.ManageToOvercome);
        obstacles.Out(Property.all);
        System.out.print("и ");
        Action.GetThrough.printAct();
        grotto.Out(Property.icicle);
        System.out.print(", из которого ");
        Action.Was.printAct();
        exit.Out();
        System.out.print("на");
        surface.Out();
        Moon.setForm(Ending.yi);
        Moon.Out();
        System.out.print(".\n");
    }
}
