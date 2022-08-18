public class Person implements Comparable<Person>{

    private String name;
    private String surname;
    private int age;

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
        return "Слов в фамилии: " + surname.split(" ").length
                + "| Возраст: " + age + "| ФИО: " + name + " " + surname;
    }

    @Override
    public int compareTo(Person o) {

        int surname1 =surname.split(" ").length;
        int surname2 =o.getSurname().split(" ").length;
        int age1 = age;
        int age2 = o.getAge();

        /*if (surname1 >= maxWords && surname2 >= maxWords) {
            return Integer.compare(age1, age2);
        }*/

        if (surname1 > surname2) {
            return 1;
        } else if (surname1 < surname2) {
            return -1;
        } else {
            return Integer.compare(age1, age2);
        }
    }
}
