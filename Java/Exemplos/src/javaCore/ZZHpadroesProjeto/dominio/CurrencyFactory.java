package javaCore.ZZHpadroesProjeto.dominio;

public class CurrencyFactory {
    public  static  Currency newCurrency(Country country){
        switch (country){
            case USA:
                return  new Currency.UsDollar();
            case BRAZIL:
                return  new Currency.Real();
            default: throw new IllegalArgumentException("No currency found for this coutry");
        }
    }
}
