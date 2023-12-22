package com.spring.collections;

public class Dependent {
    private int x;
    private SelfSufficient object;

    public Dependent() {
    }

    public Dependent(int x, SelfSufficient object) {
        this.x = x;
        this.object = object;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public SelfSufficient getObject() {
        return object;
    }

    public void setObject(SelfSufficient object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Dependent{" +
                "x=" + x +
                ", object=" + object +
                '}';
    }
}
