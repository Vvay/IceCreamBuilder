public class IceCream {
    private final Wafer wafer;
    private final Flavor flavor;
    private final Sprinkles sprinkles;
    private final Topping topping;
    private final Extras extras;

    public IceCream(Wafer wafer, Flavor flavor, Sprinkles sprinkles, Topping topping, Extras extras) {
        this.wafer = wafer;
        this.flavor = flavor;
        this.sprinkles = sprinkles;
        this.topping = topping;
        this.extras = extras;
    }

    public Wafer getWafer() {
        return wafer;
    }

    public Flavor getFlavor() {
        return flavor;
    }

    public Sprinkles getSprinkles() {
        return sprinkles;
    }

    public Topping getTopping() {
        return topping;
    }

    public Extras getExtras() {
        return extras;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "wafer=" + wafer +
                ", flavor=" + flavor +
                ", sprinkles=" + sprinkles +
                ", topping=" + topping +
                ", extras=" + extras +
                '}';
    }
}
