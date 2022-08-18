import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PersonComparator personComparator = new PersonComparator(4);
        List<Person> personList = new ArrayList<>();

        //personList.add(null);
        personList.add(new Person("Михаил", "Паниковский (человек без паспорта)", 60));
        personList.add(new Person("Остап", "Берта Мария Бендер Бей (Бендер-Задунайский)", 33));
        personList.add(new Person("Атос", "граф де Ля Фер", 35));
        personList.add(new Person("Генри", "Индиана Джонс младший", 45));
       //personList.add(null);
        personList.add(new Person("Оскар", "де Ля Хойя", 25));
        personList.add(new Person("Гай", "Юлий Цезарь", 55));
        personList.add(new Person("Владимир", "Красное Солнышко", 50));
        personList.add(new Person("Вася", "Иванов", 15));
        personList.add(new Person("Вася", "Пупкин", 18));
        //personList.add(null);

        Collections.sort(personList);
        System.out.println("Список->>");

        for (Person person : personList) {
            System.out.println(person);
        }

        //System.out.println("Удален элемент: " + personList.remove(0));
        //System.out.println("Удален элемент: " + personList.remove(personList.indexOf(null)));
        //System.out.println("Удален элемент: " + personList.remove(personList.indexOf(null)));

        System.out.println("Список->>");

        for (Person person : personList) {
            System.out.println(person);
        }
    }
}