package com.arjun.FirstSpringWeb.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SomeData {
    @Id
    private int val1;
    private int val2; private int val3;

    public SomeData() {}

    public SomeData(int val1, int val2, int val3) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
    }

    public int getVal1() {
        return val1;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public int getVal2() {
        return val2;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }

    public int getVal3() {
        return val3;
    }

    public void setVal3(int val3) {
        this.val3 = val3;
    }

    @Override
    public String toString() {
        return "SomeData{" +
                "val1=" + val1 +
                ", val2=" + val2 +
                ", val3=" + val3 +
                '}';
    }
}
