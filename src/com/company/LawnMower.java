package com.company;

import java.lang.reflect.Array;
import java.util.Scanner;

public class LawnMower {

    public double whenToMowTheLawn(double grassLengthBeforeCut, double grassLengthToCut) {
        return (grassLengthToCut - grassLengthBeforeCut) / 0.8;
    }
}
