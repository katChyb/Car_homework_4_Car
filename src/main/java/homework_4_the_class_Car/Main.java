package homework_4_the_class_Car;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {


        Country countryPoland = new Country("Poland", 'P');
        Country countryGermany = new Country("Germany", 'G');
        Country countryChina = new Country("China", 'C');
        Country countryNetherlands = new Country("Netherlands", 'N');
        Country countryKoreaSouth = new Country("South Korea", 'K');

        List<Market> markets = new ArrayList<>();
        markets.add(new Market("Business", new ArrayList<>(asList(countryPoland, countryGermany, countryNetherlands))));
        markets.add(new Market("Cargo", new ArrayList<>(asList(countryChina, countryKoreaSouth, countryNetherlands))));
        markets.add(new Market("Transport", new ArrayList<>(asList(countryGermany, countryKoreaSouth, countryNetherlands))));
        markets.add(new Market("Taxi", new ArrayList<>(asList(countryGermany, countryPoland, countryNetherlands))));
        markets.add(new Market("Bus", new ArrayList<>(asList(countryGermany, countryPoland, countryChina))));


        List<Dimension> dimensions = new ArrayList<>();
        dimensions.add(new Dimension(12, 15, 560));
        dimensions.add(new Dimension(75, 145, 240));
        dimensions.add(new Dimension(80, 165, 280));
        dimensions.add(new Dimension(100, 185, 260));
        dimensions.add(new Dimension(90, 190, 200));
        dimensions.add(new Dimension(85, 170, 190));
        dimensions.add(new Dimension(120, 150, 250));
        dimensions.add(new Dimension(120, 130, 250));
        dimensions.add(new Dimension(130, 100, 310));
        dimensions.add(new Dimension(60, 90, 180));


        Producent producent1 = new Producent("Corolla", "Toyota");
        Producent producent2 = new Producent("X5", "BMW");
        Producent producent3 = new Producent("Cuore V", "Daihatsu");
        Producent producent4 = new Producent("MX-30", "Mazda");
        Producent producent5 = new Producent("19MY", "Subaru");
        Producent producent6 = new Producent("Eclipse Cross", "Mitsubishi");
        Producent producent7 = new Producent("3000GT", "Mitsubishi");
        Producent producent8 = new Producent("A8", "Audi");
        Producent producent9 = new Producent("XC60", "Volvo");
        Producent producent10 = new Producent("Caro Plus", "Polonez");


        List<Car> cars = new ArrayList<>();
        cars.add(new Car(producent1, false, markets.get(0), "Standard", dimensions.get(0)));
        cars.add(new Car(producent2, true, markets.get(3), "Premium", dimensions.get(8)));
        cars.add(new Car(producent3, false, markets.get(2), "Premium", dimensions.get(4)));
        cars.add(new Car(producent3, false, markets.get(4), "Premium", dimensions.get(3)));
        cars.add(new Car(producent10, false, markets.get(1), "Standard", dimensions.get(9)));
        cars.add(new Car(producent7, true, markets.get(3), "Medium", dimensions.get(2)));
        cars.add(new Car(producent5, true, markets.get(1), "Premium", dimensions.get(1)));
        cars.add(new Car(producent4, true, markets.get(2), "Medium", dimensions.get(6)));
        cars.add(new Car(producent6, true, markets.get(4), "Medium", dimensions.get(5)));
        cars.add(new Car(producent2, false, markets.get(1), "Medium", dimensions.get(8)));


        Car.searchCar(cars, markets);

    }

}
