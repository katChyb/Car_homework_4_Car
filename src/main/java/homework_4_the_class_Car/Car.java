package homework_4_the_class_Car;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Car {

    Producent producent;
    boolean isAutomaticGear;
    Market market;
    String segment;
    Dimension dimensions;


    public static void searchCar(List<Car> cars, List<Market> markets) {

        for (Car c : cars) {
            if (c.getProducent().getType().equals("BMW") && c.isAutomaticGear && c.dimensions.getTrankCapacity() > 300) {
                System.out.println("Here is the list of  Country Names and Country Signs where producer is BMW, car is "
                        + "with automatic gear and a trank capacity is larger than 300 liters: ");
                for (int i = 0; i < markets.get(i).getCountries().size(); i++) {
                    System.out.println(c.market.getCountries().get(i).getCountryName() + " - "
                            + c.market.getCountries().get(i).getCountrySign());
                }
            }
        }
    }
}
