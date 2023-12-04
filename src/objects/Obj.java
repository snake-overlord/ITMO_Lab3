package objects;

import java.util.Objects;

public abstract class Obj {
    protected String name = "";
    public Obj(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Имя: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj object = (Obj) o;
        return Objects.equals(name, object.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
