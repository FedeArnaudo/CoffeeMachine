public class Coffee {
    private int quantity;
    private final INGREDIENT_TYPE ingredientType = INGREDIENT_TYPE.COFFEE;
    public Coffee(){

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public INGREDIENT_TYPE getIngredientType() {
        return ingredientType;
    }
}
