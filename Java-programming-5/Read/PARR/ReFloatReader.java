package test.lab.common.Read.PARR;

import test.lab.common.Read.PARR.Limit.Check;

import java.util.Scanner;

public final class ReFloatReader {
    private ReFloatReader() {
    }

    public static Float read(String message, Check check) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        float f = in.nextFloat();
        while (!check.check(f)) {
            System.out.println(check.message());
            f = in.nextFloat();
        }
        return f;


    }
}
