package pack.default_method_example;

import java.math.BigDecimal;
import java.util.Objects;

public class DefaultEmployeeEx extends DefaultEmployee implements BonusCalculator {

	private final BigDecimal bonusPercent;

	/**
	 * Ideally we should apply builder pattern if consturctor parameters are too
	 * many.
	 */
	DefaultEmployeeEx(String id, String name, String dept, BigDecimal salary, BigDecimal bonusPercent) {
		super(id, name, dept, salary);
		Objects.requireNonNull(bonusPercent);
		this.bonusPercent = bonusPercent;
	}

	@Override
	public BigDecimal getBonusPercent() {
		return bonusPercent;
	}

	@Override
	public BigDecimal getBonus() {
		return BonusCalculator.super.getBonus();
	}
}