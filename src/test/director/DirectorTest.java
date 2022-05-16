package director;

import builders.Builder;
import builders.IngredientsBuilder;
import components.*;
import models.Ingredients;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectorTest {

    Director director;
    IngredientsBuilder ingredientsBuilder;
    Ingredients ingredients;

    @BeforeEach
    void setUp() {
        this.director = new Director();
        this.ingredientsBuilder = new IngredientsBuilder();
    }

    @Test
    void constructOreoStandard() {
        director.constructOreoStandard(ingredientsBuilder);
        ingredients = ingredientsBuilder.getResult();

        assertNotNull(ingredients);
        assertNotNull(ingredients.getWafer());
        assertNotNull(ingredients.getFlavor());
        assertNotNull(ingredients.getSprinkles());

        assertNull(ingredients.getTopping());
        assertNull(ingredients.getExtras());

        assertEquals(Wafer.SMALL, ingredients.getWafer());
        assertEquals(Flavor.CREAMY, ingredients.getFlavor());
        assertEquals(Sprinkles.OREO, ingredients.getSprinkles());
    }

    @Test
    void constructChocoSurprise() {
        director.constructChocoSurprise(ingredientsBuilder);
        ingredients = ingredientsBuilder.getResult();

        assertNotNull(ingredients);
        assertNotNull(ingredients.getWafer());
        assertNotNull(ingredients.getFlavor());
        assertNotNull(ingredients.getTopping());
        assertNotNull(ingredients.getSprinkles());

        assertNull(ingredients.getExtras());

        assertEquals(Wafer.SMALL, ingredients.getWafer());
        assertEquals(Flavor.STRAWBERRY, ingredients.getFlavor());
        assertEquals(Sprinkles.COCONUT, ingredients.getSprinkles());
        assertEquals(Topping.CHOCO, ingredients.getTopping());
    }

    @Test
    void constructSweetMadness() {
        director.constructSweetMadness(ingredientsBuilder);
        ingredients = ingredientsBuilder.getResult();

        assertNotNull(ingredients);
        assertNotNull(ingredients.getWafer());
        assertNotNull(ingredients.getFlavor());
        assertNotNull(ingredients.getTopping());
        assertNotNull(ingredients.getExtras());

        assertNull(ingredients.getSprinkles());

        assertEquals(Wafer.SMALL, ingredients.getWafer());
        assertEquals(Flavor.MIXED, ingredients.getFlavor());
        assertEquals(Topping.TOFFEE, ingredients.getTopping());
        assertEquals(Extras.FRUITS, ingredients.getExtras());
    }

    @Test
    void constructEvesDream() {
        director.constructEvesDream(ingredientsBuilder);
        ingredients = ingredientsBuilder.getResult();

        assertNotNull(ingredients);
        assertNotNull(ingredients.getWafer());
        assertNotNull(ingredients.getFlavor());
        assertNotNull(ingredients.getTopping());
        assertNotNull(ingredients.getSprinkles());

        assertNull(ingredients.getExtras());

        assertEquals(Wafer.SMALL, ingredients.getWafer());
        assertEquals(Flavor.CREAMY, ingredients.getFlavor());
        assertEquals(Sprinkles.GOLD, ingredients.getSprinkles());
        assertEquals(Topping.APPLE, ingredients.getTopping());
    }

    @Test
    void constructFruityFall() {
        director.constructFruityFall(ingredientsBuilder);
        ingredients = ingredientsBuilder.getResult();

        assertNotNull(ingredients);
        assertNotNull(ingredients.getWafer());
        assertNotNull(ingredients.getFlavor());
        assertNotNull(ingredients.getTopping());
        assertNotNull(ingredients.getExtras());

        assertNull(ingredients.getSprinkles());
        
        assertEquals(Wafer.LARGE, ingredients.getWafer());
        assertEquals(Flavor.MIXED, ingredients.getFlavor());
        assertEquals(Topping.WHIPPED_CREAM, ingredients.getTopping());
        assertEquals(Extras.FRUITS, ingredients.getExtras());
    }
}