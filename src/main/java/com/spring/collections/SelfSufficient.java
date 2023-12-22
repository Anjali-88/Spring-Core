package com.spring.collections;

public class SelfSufficient {
    private int y;

    public SelfSufficient() {
    }

    public SelfSufficient(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "SelfSufficient{" +
                "y=" + y +
                '}';
    }
}
