package test.lab.common.Read.PARR;

import test.lab.common.Read.PARR.Limit.Check;

import java.util.Scanner;

public final class RelongReader {
    private RelongReader() {
    }

    public static long read(String message, Check check) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        long f = in.nextLong();
        while (!check.check(f)) {
            System.out.println(check.message());
            f = in.nextLong();
        }
        return f;


    }
}
