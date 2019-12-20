import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InstockTest {

	private static final String[] LABEL = { "A", "B", "C", "D", "E" };

	private Instock instock;
	private Product product;

	@Before
	public void setup() {
		instock = new Instock();
		product = new Product("Cosmos", 3.14, 2);
	}

	@Test
	public void instockGetCOuntShouldReturnZeroOnEmptyInstock() {

		int count = instock.getCount();

		assertEquals(0, count);
	}

	@Test
	public void addingProductShouldAddIncreaseCount() {

		this.instock.add(product);

		assertEquals(1, instock.getCount());
	}

	@Test
	public void containsShouldReturnTrueWhenProductIsPresent() {

		this.instock.add(this.product);

		assertTrue(this.instock.contains(product));
	}

	@Test
	public void containsShouldReturnFalseWhenProductIsNotPresent() {

		this.instock.add(this.product);

		assertFalse(this.instock.contains(new Product("Cosmoss", 3.14, 2)));
	}

	@Test
	public void findShouldReturnCorrectProductAccordingToInsertionOrder() {
		fillWithProducts();
		int order = LABEL.length / 2;
		Product returnedProduct = this.instock.find(order);

		assertEquals(LABEL[order], returnedProduct.getLabel());

	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void findWithInvalidIndexShouldThrowException() {
		fillWithProducts();
		this.instock.find(this.LABEL.length);
	}
	
	@Test
	public void changeQuantityShouldReplaceOldQuantityValue() {
		this.instock.add(product);
		this.instock.changeQuantity(product.getLabel(), 69);
		
		assertEquals(69, product.getQuantity());
	}

	private void fillWithProducts() {
		for (int i = 0; i < LABEL.length; i++) {
			this.instock.add(new Product(LABEL[i], i, i));
		}

	}

}
