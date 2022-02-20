package academy.devdojo.javaoneforall.javacore.ZZGconcurrent.service;

//243 - Concurrency pt 15 - CompletableFuture pt 04 - Chaining calls pt 01
//245 - Concurrency pt 17 - CompletableFuture pt 06 - allOf, anyOf

import academy.devdojo.javaoneforall.javacore.ZZGconcurrent.domain.Discount;
import academy.devdojo.javaoneforall.javacore.ZZGconcurrent.domain.Quote;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiceWithDiscount {

    public String getPricesSync(String storeName){
        double price =  priceGenerator();
        Discount.Code discountCode = Discount.Code.values()
                [ThreadLocalRandom.current().nextInt(Discount.Code.values().length)];
        return String.format("%s:%.2f:%s", storeName, price, discountCode);
    }

    public String applyDiscount(Quote quote){
        delay();
        double discountValue = quote.getPrice() *
                (100 - quote.getDisountCode().getPercentage()) / 100;
        return String.format("'%s' original price: '%.2f'. Applying discount code: '%s'. Final price: '%.2f'",
                quote.getStore(),
                quote.getPrice(),
                quote.getDisountCode(),
                discountValue);
    }

    private double priceGenerator(){
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500)*10;
    }

    private void delay(){
        try {
            int milli = ThreadLocalRandom.current().nextInt(200, 2500);
            TimeUnit.MILLISECONDS.sleep(milli);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
