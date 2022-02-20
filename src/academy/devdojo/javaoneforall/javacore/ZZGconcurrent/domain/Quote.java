package academy.devdojo.javaoneforall.javacore.ZZGconcurrent.domain;

//243 - Concurrency pt 15 - CompletableFuture pt 04 - Chaining calls pt 01

public final class Quote {
    private final String store;
    private final double price;
    private final Discount.Code disountCode;

    private Quote(String store, double price, Discount.Code disountCode) {
        this.store = store;
        this.price = price;
        this.disountCode = disountCode;
    }

    /**
     * Creates new Quote obhect from value following the pattern storeName:price:discountCode
     * @param value containing storeName:price:discountCode
     * @return new Quote with values parsed from @param value
     */

    public static Quote newQuote(String value){
        String[] values = value.split(":");
        return new Quote(values [0], Double.parseDouble(values[1]),
                Discount.Code.valueOf(values[2]));
    }

    @Override
    public String toString() {
        return "Quote{" +
                "store='" + store + '\'' +
                ", price=" + price +
                ", disountCode=" + disountCode +
                '}';
    }

    public String getStore() {
        return store;
    }

    public double getPrice() {
        return price;
    }

    public Discount.Code getDisountCode() {
        return disountCode;
    }
}
