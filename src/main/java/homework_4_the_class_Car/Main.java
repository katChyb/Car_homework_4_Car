package homework_4_the_class_Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Country countryPoland = new Country("Poland", 'P');
        Country countryGermany = new Country("Germany", 'G');
        Country countryChina = new Country("China", 'C');
        Country countryNetherlands = new Country("Netherlands", 'N');
        Country countryKoreaSouth = new Country("South Korea", 'K');


        Market marketBusiness = new Market ("Buisness", List.of(countryPoland,countryGermany, countryNetherlands));
        Market marketCargo = new Market ("Cargo", List.of(countryChina,countryKoreaSouth, countryNetherlands));
        Market marketTransport = new Market ("Transport", List.of(countryGermany,countryKoreaSouth, countryNetherlands));
        Market marketTaxi = new Market ("Taxi", List.of(countryGermany,countryPoland, countryNetherlands));
        Market marketBus = new Market ("Bus", List.of(countryGermany,countryPoland, countryChina));


        Dimension dimension1 = new Dimension(75,145,240);
        Dimension dimension2 = new Dimension(80,165,280);
        Dimension dimension3 = new Dimension(100,185,260);
        Dimension dimension4 = new Dimension(90,190,200);
        Dimension dimension5 = new Dimension(85,170,190);
        Dimension dimension6 = new Dimension(120,150,250);
        Dimension dimension7 = new Dimension(120,130,250);
        Dimension dimension8 = new Dimension(130,100,310);
        Dimension dimension9 = new Dimension(60,90,180);
        Dimension dimension10 = new Dimension(65,185,240);


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
        cars.add(new Car(producent1, false, marketBusiness, "Standard", List.of(dimension1)));
        cars.add(new Car(producent2, true, marketTaxi, "Premium", List.of(dimension8)));
        cars.add(new Car(producent3, false, marketTransport, "Premium", List.of(dimension8)));
        cars.add(new Car(producent3, false, marketTaxi, "Premium", List.of(dimension1)));
        cars.add(new Car(producent10, false, marketCargo, "Standard", List.of(dimension1)));
        cars.add(new Car(producent7, true, marketBus, "Medium", List.of(dimension10)));
        cars.add(new Car(producent5, true, marketBusiness, "Premium", List.of(dimension4)));
        cars.add(new Car(producent4, true, marketTransport, "Medium", List.of(dimension6)));
        cars.add(new Car(producent6, true, marketTransport, "Medium", List.of(dimension8)));
        cars.add(new Car(producent2, false, marketTransport, "Medium", List.of(dimension8)));


       int i=0;
        for (Car c: cars) {
            if (c.getProducent().equals(producent2))  {  // get producent BMW
                // is auto gear
                if (c.isAutomaticGear == true) {
                    i++;}
            }

      }
        System.out.println(i);

    }


}
