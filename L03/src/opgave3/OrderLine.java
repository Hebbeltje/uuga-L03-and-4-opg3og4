package opgave3;

public class OrderLine {
    private final int lineNumber;
    private final int count;

    // association 0..* --> 1 Product
    private final Product product;

    public OrderLine(int lineNumber, int count, Product product) {
        this.lineNumber = lineNumber;
        this.count = count;
        this.product = product;
    }

    public int getLineNumber() {
        return this.lineNumber;
    }

    public int getCount() {
        return this.count;
    }

    public Product getProduct() {
        return product;
    }

    public double orderLinePrice(){
        return count * product.getUnitPrice();
    }
}
