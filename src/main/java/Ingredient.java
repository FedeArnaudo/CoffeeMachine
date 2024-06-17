public abstract class Ingredient {
    protected int quantity;
    protected INGREDIENT_TYPE ingredientType;
    public abstract int getQuantity();

    public abstract void setQuantity(int quantity);
    public abstract INGREDIENT_TYPE getIngredientType();

    public void setIngredientType(INGREDIENT_TYPE ingredientType) {
        this.ingredientType = ingredientType;
    }
}
