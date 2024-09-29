import java.time.LocalDate; // Импортируем LocalDate для даты рождения

public class PersonalDates extends Human {
    private LocalDate birthDay; // Используем LocalDate
    private int age;
    private String gender; // Переименовываем grade в gender

    public PersonalDates(String name, LocalDate birthDay, int age, String gender) {
        super(name);
        this.birthDay = birthDay;
        this.age = age;
        this.gender = gender;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return super.toString() + ", дата рождения: " + birthDay + ", возраст: " + age + ", пол: " + gender;
    }
}
