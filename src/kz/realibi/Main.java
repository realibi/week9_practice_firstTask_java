package kz.realibi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        BaseTask firstA = new FirstA();
        BaseTask firstB = new FirstB();
        BaseTask firstC = new FirstC();

        firstA.setText(text);
        firstA.execute();

        firstB.setText(text);
        firstB.execute();

        firstC.setText(text);
        firstC.execute();
    }
}
