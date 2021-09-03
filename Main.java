package com.company;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Perf myperf = new Perf();


        Date start = new Date();
        myperf.Loop();
        Date end = new Date();

        long diff = end.getTime() - start.getTime();
        System.out.println("Loop Time; " + diff);

	// write your code here
    }
}

