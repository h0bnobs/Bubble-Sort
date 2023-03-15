import java.util.Scanner;

public class Submission {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final String line = scanner.nextLine();
        String[] parts = line.split("\\s+");
        int n = parts.length;
        int[] numbers = new int[n];

        //add to the numbers array.
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }

        Submission s = new Submission();
        s.bubble(numbers);
        s.print(numbers);
    }

    public void bubble(int[] numbers) {
        int l = numbers.length;
        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    //swap
                    int k = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = k;
                }
            }
        }
    }
    void print(int[] numbers)
    {
        int n = numbers.length;
        System.out.println(numbers[n -3]);
    }

}