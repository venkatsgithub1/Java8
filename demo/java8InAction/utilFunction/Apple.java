package demo.java8InAction.utilFunction;

import java.util.Objects;

public class Apple {
    private Integer id;
    private Integer weight;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
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
