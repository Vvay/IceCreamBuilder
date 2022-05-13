import builders.IceCreamBuilder;
import builders.IngredientsBuilder;
import director.Director;
import models.IceCream;
import models.Ingredients;

public class Main {
    // MENU
    // 1. Oreo Standard  (S) - Creamy with oreo sprinkles
    // 2. Choco surprise (S) - Strawberry with chocolate glaze and coconut flakes
    // 3. Sweet madness  (S) - Mixed with toffee topping and fruits
    // 4. Eve's dream    (S) - Creamy with apple glaze and gold sprinkles
    // 5. Fruity Fall    (L) - Mixed with whipped cream and fruits

    public static void main(String[] args) {
        Director director = new Director();
        IngredientsBuilder ingredientsBuilder = new IngredientsBuilder();
        director.constructSweetMadness(ingredientsBuilder);
        Ingredients ingredients = ingredientsBuilder.getResult();
        System.out.println(ingredients.toString());

        IceCreamBuilder builder = new IceCreamBuilder();
        director.constructChocoSurprise(builder);
        IceCream iceCream = builder.getResult();
        System.out.println(iceCream.toString());
    }
}
