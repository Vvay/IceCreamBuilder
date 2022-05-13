package builders;

import components.*;

public interface Builder {
    void setFlavor(Flavor flavor);

    void setWafer(Wafer wafer);

    void setSprinkles(Sprinkles sprinkles);

    void setTopping(Topping topping);

    void setExtras(Extras extras);

}
