import java.util.HashMap;
import java.util.Map;

public class DateList {
    //Данный метод доступен только внутри этого класса и его нельзя будет изменить после инициализации
    private final Map<String, String> dates = new HashMap<>();
   // Пишем код для отображения списка важных дат
    public void showDateList() {
        System.out.println();
        System.out.println("---------------");
        System.out.println("Список дат");
        System.out.println("----------------");
        for (Map.Entry<String, String> entry : dates.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("------------------------");
    }
    // Код для добавления дат в список(используется в main case 2). Метод не возвращает никаких данных
    public void addDate(String description, String date) {
        dates.put(description, date);
        showDateList();
    }
    // Код для удаления даты(используется в main case 3). Ссылка(дескриптор) обращается к методу
    public void removeDate(String description) {
        // Задается условие для удаления даты
        if (dates.containsKey(description)) {
            dates.remove(description);
            System.out.println("Дата успешно удалена.");
            showDateList();
            // Задаем условие (в ином случае) Если пользователь выберет дату, отличную для кода if
        } else {
            System.out.println("Такой даты нет в списке.");
        }
    }
    //Код для редактирования даты(испоьлзуется в main case 4)
    public void editDate(String description, String newDate) {
        if (dates.containsKey(description)) {
            dates.put(description, newDate);
            showDateList();
        }
    }
}