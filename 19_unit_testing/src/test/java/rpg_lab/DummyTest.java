package rpg_lab;

import org.junit.Test;

import junit.framework.Assert;

public class DummyTest {
	@Test
	public void dummyShouldLoseHealthWhenAttacked() {

		Dummy dummy = new Dummy(10, 10);
		Axe axe = new Axe(50, 5);
		axe.attack(dummy);

		Assert.assertTrue(axe.getDurabilityPoints() == 4);
	}
}
