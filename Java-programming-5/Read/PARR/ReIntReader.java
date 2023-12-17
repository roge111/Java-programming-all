package test.lab.common.Read.PARR;

import java.util.Scanner;

public final class ReIntReader {
    private ReIntReader() {
    }

    public static Integer read(String messageForConsole, boolean canBeNull) {
        Scanner in = new Scanner(System.in);
        System.out.print(messageForConsole);
        Integer readFloat = null;
        boolean end = false;
        do {
            String read = in.nextLine().trim();
            if (("").equals(read)) {
                if (canBeNull) {
                    end = true;
                } else {
                    System.out.println("Поле не может быть null. Попробуйте снова: ");
                }
            } else {
                try {
                    readFloat = Integer.parseInt(read);
                    end = true;
                } catch (NumberFormatException e) {
                    System.out.println("Вы ввели неподходящее значение. Введите число:");
                }
            }
        } while (!end);

        return readFloat;

    }
}
