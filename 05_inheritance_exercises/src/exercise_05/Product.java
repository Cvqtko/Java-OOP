package exercise_05;

import java.math.BigDecimal;

public abstract class Product {
	private String name;
	private BigDecimal price;

	public Product(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}

}
