import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeTest {

    private Coffee coffee;
    private INGREDIENT_TYPE ingredientType;
    @BeforeEach
    void setUp() {
        coffee = new Coffee();
    }

    @Test
    void getQuantity() {
        Assertions.assertEquals(coffee.getQuantity(), 12);
    }

    @Test
    void setQuantity() {
        int init = 10;
        coffee.setQuantity(init);

        assertEquals(coffee.getQuantity(), 9);
    }

    @Test
    void getIngredientType() {
        assertEquals(coffee.getIngredientType(), INGREDIENT_TYPE.WATER);
    }
}