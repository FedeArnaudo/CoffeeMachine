import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeTest {

    private Coffee coffee;
    private int k;
    private int result;
    private INGREDIENT_TYPE ingredientType;
    @BeforeEach
    void setUp() {
        coffee = new Coffee();
        k = 10;
    }

    @Test
    void getQuantity() {
        result = coffee.getQuantity() + k;
        coffee.setQuantity(k);
        Assertions.assertEquals(coffee.getQuantity(), 14);
    }

    @Test
    void setQuantity() {
        result = coffee.getQuantity() + k;
        coffee.setQuantity(result);

        assertEquals(coffee.getQuantity(), result);
    }

    @Test
    void getIngredientType() {
        assertEquals(coffee.getIngredientType(), INGREDIENT_TYPE.COFFEE);
    }
}
