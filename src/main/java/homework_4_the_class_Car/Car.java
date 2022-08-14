package homework_4_the_class_Car;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public class Car {

    Producent producent;
    boolean isAutomaticGear;
    Market market;
    String segment;
    List<Dimension> dimension;


}
