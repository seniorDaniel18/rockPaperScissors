import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Это 'КАМЕНЬ-НОЖНИЦЫ-БУМАГА' ");
        System.out.println("Здесь вам предстоит играть с компютером");
        System.out.println("");
        myMoves();

    }

    public static String randomMoves() {

        Random random = new Random();

        //String rpsRan = "";
        int move = random.nextInt(1, 4);

        if (move == 1) {
            return "Камень";
        } else if (move == 2) {
            return "Бумага";
        } else if (move == 3) {//3
            return "Ножницы";
        }
        return null;
    }

    public static void myMoves() {

        String word = randomMoves();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите: r / p / s");
        String rpsMy = scanner.nextLine();


        if (rpsMy.equals("r")) {

            System.out.println("Вы выбрали: Камень");
            System.out.println("Компьютер выбрал: " + word);

            if (word.contains("Камень")) {
                System.out.println("Ничья");
            } else if (word.contains("Бумага")) {
                System.out.println("Вы проиграли :(");
            } else {
                System.out.println("Вы выиграли ^o^");
            }
        } else if (rpsMy.equals("p")) {

            System.out.println("Вы выбрали: Бумага");
            System.out.println("Компьютер выбрал: " + word);

            if (word.equals("Камень")) {
                System.out.println("Вы выиграли ^o^");
            } else if (word.contains("Бумага")) {
                System.out.println("Ничья");
            } else if (word.contains("Ножницы")) {
                System.out.println("Вы проиграли :(");
            }
        } else if (rpsMy.equals("s")) {

            System.out.println("Вы выбрали: Ножницы");
            System.out.println("Компьютер выбрал: " + word);

            if (word.contains("Камень")) {
                System.out.println("Вы проиграли :(");
            } else if (word.contains("Бумага")) {
                System.out.println("Вы выиграли ^o^");
            } else if (word.contains("Ножницы")) {
                System.out.println("Ничья");
            }
        }
    }
}
