import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Count of Numbers : ");
        int numberCount = input.nextInt();

        if (numberCount <= 0) {
            System.out.println("Please Enter a Positive Number !!!");

        }

        System.out.print("Enter the First Number ");

        int max = input.nextInt();
        int min = max; // 1. Sayının hem max hem min olması.

        for (int i = 2; i <= numberCount; i++) {
            System.out.print("Enter the " + i + "th number : ");
            int num = input.nextInt();

            if (num > max) {
                max = num; // Daha büyük bir sayı bulunması durumunda num'un güncellenmesi.
            }

            if (num < min) {
                min = num; // Daha küçük bir sayı bulunması durumunda num'un güncellenmesi.
            }
        }

        System.out.println("Greater Number is : " + max);
        System.out.println("Smallest Number is : " + min);
    }
}
