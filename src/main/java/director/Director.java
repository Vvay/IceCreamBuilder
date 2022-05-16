package director;

import builders.Builder;
import components.*;

public class Director {
    // MENU
    // 1. Oreo Standard  (S) - Creamy with oreo sprinkles
    // 2. Choco surprise (S) - Strawberry with chocolate glaze and coconut flakes
    // 3. Sweet madness  (S) - Mixed with toffee topping and fruits
    // 4. Eve's dream    (S) - Creamy with apple glaze and gold sprinkles
    // 5. Fruity Fall    (L) - Mixed with whipped cream and fruits

    public void constructOreoStandard(Builder builder) {
        builder.setWafer(Wafer.SMALL);
        builder.setFlavor(Flavor.CREAMY);
        builder.setSprinkles(Sprinkles.OREO);
    }

    public void constructChocoSurprise(Builder builder) {
        builder.setWafer(Wafer.SMALL);
        builder.setFlavor(Flavor.STRAWBERRY);
        builder.setTopping(Topping.CHOCO);
        builder.setSprinkles(Sprinkles.COCONUT);
    }

    public void constructSweetMadness(Builder builder) {
        builder.setWafer(Wafer.SMALL);
        builder.setFlavor(Flavor.MIXED);
        builder.setTopping(Topping.TOFFEE);
        builder.setExtras(Extras.FRUITS);
    }

    public void constructEvesDream(Builder builder) {
        builder.setWafer(Wafer.SMALL);
        builder.setFlavor(Flavor.CREAMY);
        builder.setTopping(Topping.APPLE);
        builder.setSprinkles(Sprinkles.GOLD);
    }

    public void constructFruityFall(Builder builder) {
        builder.setWafer(Wafer.LARGE);
        builder.setFlavor(Flavor.MIXED);
        builder.setTopping(Topping.WHIPPED_CREAM);
        builder.setExtras(Extras.FRUITS);
    }
}
