package org.internship;

import lombok.Getter;
import lombok.Setter;

public class Calculator {

    @Getter @Setter
    private int x;

    @Getter @Setter
    private int y;

    public Calculator() {

    }
    public int sum(int x, int y) {
        return x + y;
    }
}
