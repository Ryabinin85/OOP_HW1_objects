public class Main {
    public static void main(String[] args) {

        Human maxim = new Human("Максим", 1988, "Минск", "бренд-менеджер");
        Human anna = new Human("Аня", 1993, "Москва", "методист образовательных программ");
        Human ekaterina = new Human("Катя", 1992, "Калининград", "продакт-менеджер");
        Human artyom = new Human("Артем", 1995, "Москва", "директор по развитию бизнеса");

        System.out.println(maxim);
        System.out.println(anna);
        System.out.println(ekaterina);
        System.out.println(artyom);

        System.out.println();

        Car granta = new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia");
        Car a8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany");
        Car z8 = new Car("BMW", "Z8", 3.0, "yellow", 2021, "Germany");
        Car sportage = new Car("Kia", "Sportage 4", 1.7, "red", 2018, "South Korea");
        Car avante = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea");

        System.out.println(granta);
        System.out.println(a8);
        System.out.println(z8);
        System.out.println(sportage);
        System.out.println(avante);
    }
}
