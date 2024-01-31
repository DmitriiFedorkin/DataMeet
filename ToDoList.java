import java.util.ArrayList;
import java.util.Map;

public class ToDoList {
    private final ArrayList<String> currentList = new ArrayList<>();
    private final DateList dateList = new DateList();

    public void showList() {
        System.out.println("---------------");
        System.out.println("Список дел");
        System.out.println("----------------");
        for (int i = 0; i < currentList.size(); i++) {
            System.out.println((i + 1) + ". " + currentList.get(i));
        }
        System.out.println("------------------------");

        dateList.showDateList();
    }
    public void removeItem(int index) {
        if (index >= 0 && index < currentList.size()) {
            currentList.remove(index);
            showList();
        } else {
            System.out.println("Некорректный номер пункта!");
        }
    }

    public DateList getDateList() {
        return dateList;
    }
}