// Импортируем из пакета java.util каласс Scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        int menuItem = -1;
// while - это оператор, который позволяет нам многократно повторять код
        while (menuItem != 0) {
            menuItem = menu(scanner);
            switch (menuItem) {
                // Закреппляем цифру за одним действием в меню
                case 1:
                    toDoList.showList();
                    break;
                case 2:
                    System.out.println("Добавить важную дату");
                    System.out.println("Введите описание:");
                    scanner.nextLine();
                    String description = scanner.nextLine();
                    System.out.println("Введите дату в формате DD.MM.YYYY:");
                    String date = scanner.nextLine();
                    toDoList.getDateList().addDate(description, date);
                    break;
                case 3:
                    System.out.println("Удалить важную дату");
                    System.out.println("Введите описание даты для удаления:");
                    scanner.nextLine();
                    String descriptionForRemoval = scanner.nextLine();
                    toDoList.getDateList().removeDate(descriptionForRemoval);
                    break;
                case 4:
                    System.out.println("Редактировать важную дату");
                    System.out.println("Введите описание даты для редактирования:");
                    scanner.nextLine();
                    String descriptionForEdit = scanner.nextLine();
                    System.out.println("Введите новую дату в формате DD.MM.YYYY:");
                    String newDate = scanner.nextLine();
                    toDoList.getDateList().editDate(descriptionForEdit, newDate);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Введите вариант из списка");
            }
        }
    }

    public static int menu(Scanner scanner) {
        // присваиваем переменную choice к этому коду
        int choice;
        System.out.println("--------------");
        System.out.println("Меню");
        System.out.println("--------------");
        System.out.println("0. Выход из программы");
        System.out.println("1. Показать список дел и важных дат");
        System.out.println("2. Добавить дату в список важных дат");
        System.out.println("3. Удалить дату из списка важных дат");
        System.out.println("4. Редактировать дату в списке важных дат");
        System.out.println();
        System.out.println("Введите вариант: ");
        choice = scanner.nextInt();
        //после взаимодействия, повторяем код
        return choice;
    }
}