public class Person {

    private String name;
    private String surname;
    private Integer age;

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Слов в фамилии: " + (surname != null ? surname.split(" ").length + "" : "0")
                + "| Возраст: " + age + "| ФИО: " + name + " " + surname;
    }
}
