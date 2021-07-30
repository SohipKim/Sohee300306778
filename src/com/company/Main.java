package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ElectionData obj = new ElectionData();
        obj.electionService();
        obj.compute();
        obj.display();

    }
}
