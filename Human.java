public class Human {
    String name;
    int yearOfBirth;
    String town;
    String jobTitle;

    public Human(String name, int yearOfBirth, String town, String jobTitle) {
        if (yearOfBirth > 1900) this.yearOfBirth = yearOfBirth;
        else this.yearOfBirth = 0;

        if (name == null || name.equals("")) this.name = "Информация не указана";
        else this.name = name;
        if (town == null || town.equals("")) this.town = "Информация не указана";
        else this.town = town;
        if (jobTitle == null || jobTitle.equals("")) this.jobTitle = "Информация не указана";
        else this.jobTitle = jobTitle;

    }
    @Override
    public String toString() {
        return String.format("Привет! Меня зовут %s. Я из города %s. Я родился в %d году." +
                " Я работаю на должности %s. Будем знакомы!", name, town, yearOfBirth, jobTitle);
    }
}
