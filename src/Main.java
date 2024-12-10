import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========= Bem-vindo(a) ao Ordenador de Números =========");

        System.out.print("Digite os números separados por espaço: ");
        String input = scanner.nextLine();

        String[] numbers = input.split(" ");
        List<Integer> numberList = new ArrayList<>();
        for (String number : numbers) {
            numberList.add(Integer.parseInt(number));
        }

        System.out.println("- Lista original: " + numberList);

        int[] numberArray = numberList.stream().mapToInt(Integer::intValue).toArray();

        selectionSort(numberArray);

        System.out.print("- Lista ordenada: ");
        for (int num : numberArray) {
            System.out.print(num + " ");
        }
    }

    public static void selectionSort(int[] numberList) {
        int n = numberList.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (numberList[j] < numberList[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = numberList[minIndex];
            numberList[minIndex] = numberList[i];
            numberList[i] = temp;
        }
    }
}
