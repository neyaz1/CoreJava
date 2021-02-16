package pack.function_examples;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		retrieveExchangeRate(Currency.getInstance("USD"), (rate) -> System.out.println(rate));
	}

	public static void retrieveExchangeRate(Currency currency, Consumer<BigDecimal> rateConsumer) {
		System.out.println("Retrieving rate for currency " + currency);
		Executors.newSingleThreadExecutor()
				.submit(() -> rateConsumer.accept(new BigDecimal(Math.round(Math.random() * 100))));
	}
}
