package com.gap.challenge;

import com.gap.challenge.params.InvalidParametersException;

public class Counter {
    public void returnNumber(int param1, int param2) throws InvalidParametersException {
        if (param1 < param2) {
            throw new InvalidParametersException();
        }
            int forParam = param1 - param2;
            for (int x = 0; x <= forParam; x++) {
                System.out.println("Printing number ".concat(String.valueOf(x)));
            }
        }
    }