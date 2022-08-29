import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        PersonComparator personComparator = new PersonComparator(4);
        List<Person> personList = new ArrayList<>();

        personList.add(null);
        personList.add(new Person("Михаил", "Паниковский (человек без паспорта)", 60));
        personList.add(new Person("Остап", "Берта Мария Бендер Бей (Бендер-Задунайский)", 33));
        personList.add(new Person("Атос", "граф де Ля Фер", 35));
        personList.add(new Person("Генри", "Индиана Джонс младший", 45));
        personList.add(null);
        personList.add(new Person("Оскар", "де Ля Хойя", 25));
        personList.add(new Person("Гай", "Юлий Цезарь", 55));
        personList.add(new Person("Владимир", "Красное Солнышко", 50));
        personList.add(new Person("Вася", "Иванов", 15));
        personList.add(new Person("Вася", "Пупкин", 17));
        personList.add(null);

        personList.sort(personComparator);

        System.out.println("Список->>");
        for (Person person : personList) {
            System.out.println(person);
        }

        personList.removeIf(human -> (human == null || human.getAge() < 18));

        System.out.println("Список->>");
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}