package test.lab.common.Read.PARR;

import test.lab.common.Read.PARR.Limit.Check;

import java.util.Scanner;

public final class RefDoubleReader {
    private RefDoubleReader() {
    }

    public static double read(String message, Check check) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        double f = in.nextDouble();
        while (!check.check(f)) {
            System.out.println(check.message());
            f = in.nextDouble();
        }
        return f;


    }
}
