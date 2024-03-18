import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("write anyone number: ");
        int number = scanner.nextInt();

        if (number % 2 ==0){
            System.out.println("Бул жуп сан!");
        }else {
            System.out.println("Бул так сан!");
        }

    }
}