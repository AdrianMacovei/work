package org.internship;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class Calculator {

    private int x;

    private int y;

    public Calculator() {

    }
    public int sum(int x, int y) {
        return x + y;
    }
}
