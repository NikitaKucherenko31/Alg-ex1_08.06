import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массив значений в формате [1, 0, 1, 1, 1]:");
        String input = scanner.nextLine();
        input = input.replaceAll("\\[|\\]|\\s", ""); // удаляем скобки и пробелы
        String[] values = input.split(","); // разбиваем строку на массив строк
        int count = 0;
        for (String value : values) {
            if (value.equals("1")) {
                count++;
            }
        }
        System.out.println("Количество сотрудников: " + count);
    }
}