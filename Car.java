public class Car {
    String brand;
    String model;
    double engineVolume;
    String colour;
    int year;
    String country;

    public Car(String brand, String model, double engineVolume, String colour, int year, String country) {
        if (brand == null || brand.equals("")) this.brand = "default";
        else this.brand = brand;

        if (model == null || model.equals("")) this.model = "default";
        else this.model = model;

        if (engineVolume <= 0) this.engineVolume = 1.5;
        else this.engineVolume = engineVolume;

        if (colour == null || colour.equals("")) this.colour = "default";
        else this.colour = colour;

        if (year <= 0) this.year = 2000;
        else this.year = year;

        if (country == null || country.equals("")) this.country = "default";
        else this.country = country;
    }

    @Override
    public String toString() {
        return String.format ("%s %s, %d год выпуска, сборка: %s, цвет: %s, объем двигателя: %.01f л.",
                brand, model, year, country, colour, engineVolume);
    }
}
