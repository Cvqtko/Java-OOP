import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Instock implements ProductStock {
	private Map<String, Product> products;

	public Instock() {
		this.products = new LinkedHashMap<String, Product>();
	}

	@Override
	public void add(Product product) {
		this.products.put(product.getLabel(), product);
	}

	@Override
	public int getCount() {
		return this.products.size();
	}

	@Override
	public boolean contains(Product product) {
		return this.products.containsKey(product.getLabel());
	}

	@Override
	public Product find(int index) {
		Product product = this.products.entrySet().stream().skip(index).map(Map.Entry::getValue).findFirst()
				.orElse(null);
		if(product==null) {
			throw new IndexOutOfBoundsException();
		}else {
			return product;
		}
	}

	@Override
	public void changeQuantity(String product, int quantity) {
		this.products.get(product).setQuantity(quantity);
	}

	@Override
	public Product findByLabel(String label) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Iterable<Product> findFirstByAlphabeticalOrder(int count) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Iterable<Product> findAllInRange(double lo, double hi) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Iterable<Product> findAllByPrice(double price) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Iterable<Product> findFirstMostExpensiveProducts(int count) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Iterable<Product> findAllByQuantity(int quantity) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Iterator<Product> iterator() {
		throw new UnsupportedOperationException();
	}
}
