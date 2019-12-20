import javax.naming.OperationNotSupportedException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import p01_Database.Database;

public class DatabaseTest {

	private static Integer[] numbers = { 1, 2, 3 };
	private Database database;

	@Before
	public void setDatabaseField() throws OperationNotSupportedException {
		this.database = new Database(numbers);
	}

	@Test
	public void databaseCreationTestShouldCreateObjectWithValidParameters() {

		Integer[] elements = this.database.getElements();
		Assert.assertEquals(numbers.length, elements.length);
	}

	@Test(expected = OperationNotSupportedException.class)
	public void databaseShoudThrowOperationNotSupportedException() throws OperationNotSupportedException {
		this.database = new Database();
	}

	@Test(expected = OperationNotSupportedException.class)
	public void databaseShoudThrowOperationNotSupportedExceptionIfElementsMoreThanSixteen()
			throws OperationNotSupportedException {

		this.database = new Database(new Integer[17]);
	}

	@Test
	public void databaseCreationTestShouldSetElementsInCorrectOrder() {
		Integer[] elements = this.database.getElements();

		Assert.assertArrayEquals(numbers, elements);

	}
}
