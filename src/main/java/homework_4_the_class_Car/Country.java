package homework_4_the_class_Car;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public class Country {
    String countryName;
     char countrySign;

     public String toString(){
         return countryName + " - " + countrySign;
     }
}
