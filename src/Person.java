public class Person {

    private final String name;
    private final String surname;
    private final int age;

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Слов в фамилии: " + surname.split(" ").length
                + "| Возраст: " + age + "| ФИО: " + name + " " + surname;
    }
}
