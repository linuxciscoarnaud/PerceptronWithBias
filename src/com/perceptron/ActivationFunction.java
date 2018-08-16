package com.perceptron;

/**
 * @author Arnaud
 *
 */

public final class ActivationFunction {

    public int theshold(double x) {
        if (x >= 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
