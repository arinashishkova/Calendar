import java.util.Scanner;

public class Calendar {

    static String[] animals = {
            "Крыса", "Корова", "Тигр", "Заяц", "Дракон", "Змея",
            "Лошадь", "Овца", "Обезьяна", "Курица", "Собака", "Свинья"
    };

    static String[] colors = {
            "Зелёный", "Красный", "Жёлтый", "Белый", "Чёрный"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        int offset = year - 1984;
        String animal = animals[offset % 12];
        String color = colors[(offset / 12) % 5];
        System.out.println("Год " + year + " — " + color + " " + animal);
    }
}