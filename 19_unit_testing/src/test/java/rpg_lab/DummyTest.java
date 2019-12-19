package rpg_lab;

import org.junit.Test;

import junit.framework.Assert;

public class DummyTest {
	@Test
	public void dummyShouldLoseHealthWhenAttacked() {

		Dummy dummy = new Dummy(10, 10);
		dummy.takeAttack(5);

		Assert.assertTrue(dummy.getHealth() == 5);
	}

	@Test(expected = IllegalStateException.class)
	public void shouldThrowExceptionWhenAttackingDeadDummy() {
		Dummy dummy = new Dummy(-5, 10);
		dummy.takeAttack(5);

		Assert.assertTrue(dummy.getHealth() == 5);
	}

	@Test
	public void shouldGiveExperienceWhenKilled() {
		Dummy dummy = new Dummy(-5, 10);
		int actual = dummy.giveExperience();

		Assert.assertTrue(actual == 10);

	}
}
