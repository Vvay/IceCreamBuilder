public class IngredientsBuilder implements Builder {
    private Wafer wafer;
    private Flavor flavor;
    private Sprinkles sprinkles;
    private Topping topping;
    private Extras extras;

    public Ingredients getResult() {
        return new Ingredients(wafer, flavor, sprinkles, topping, extras);
    }

    @Override
    public void setFlavor(Flavor flavor) {
        this.flavor = flavor;
    }

    @Override
    public void setWafer(Wafer wafer) {
        this.wafer = wafer;
    }

    @Override
    public void setSprinkles(Sprinkles sprinkles) {
        this.sprinkles = sprinkles;
    }

    @Override
    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    @Override
    public void setExtras(Extras extras) {
        this.extras = extras;
    }
}
