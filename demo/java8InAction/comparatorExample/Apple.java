package demo.java8InAction.comparatorExample;

import java.util.Objects;

public class Apple {
    private int id;
    private int weight;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return id == apple.id &&
                weight == apple.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, weight);
    }

    @Override
    public String toString() {
        return "{Apple: id:" + getId() + " weight:" + getWeight() + "}";
    }
}
