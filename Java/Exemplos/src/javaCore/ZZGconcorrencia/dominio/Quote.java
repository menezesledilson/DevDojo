package javaCore.ZZGconcorrencia.dominio;

public class Quote {
    private final String store;
    private final  double price;
    private  final  Discount.Code discountCode;

    public Quote(String store, double price, Discount.Code discountCode) {
        this.store = store;
        this.price = price;
        this.discountCode = discountCode;
    }

    /*
    * Create new Quote object from the value the pattern storeName:price disco
    * @param Value containing storeName: price discountCode
    * @return new Quote with  values from @param value
    * */
    public  static  Quote newQuote (String value){
        String[] values = value.split(":");
        String store = values[0];
        double price = Double.parseDouble(values[1].replace(',','.'));
        Discount.Code discountCode = Discount.Code.valueOf(values[2].toUpperCase());

        return new Quote(store, price, discountCode);

    }
    @Override
    public String toString() {
        return "Quote{" +
                "store='" + store + '\'' +
                ", price=" + price +
                ", discountCode=" + discountCode +
                '}';
    }

    public String getStore() {
        return store;
    }

    public double getPrice() {
        return price;
    }

    public Discount.Code getDiscountCode() {
        return discountCode;
    }
}
