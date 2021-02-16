package pack.function_examples;

import java.math.BigDecimal;
import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {
		displayCurrencyCode(currency -> getCurrencyRateForCurrencyCode(currency));
	}

	private static void displayCurrencyCode(Function<String, BigDecimal> currencyRateFunction) {
		BigDecimal rate = currencyRateFunction.apply("USD");
		System.out.println("Currency rate for USD : " + rate);
	}

	private static BigDecimal getCurrencyRateForCurrencyCode(String currency) {
		return new BigDecimal(Math.round(Math.random() * 100));
	}
}
