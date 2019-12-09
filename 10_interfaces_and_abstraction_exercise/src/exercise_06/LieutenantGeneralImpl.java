package exercise_06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {
	private List<Soldier> soldiers;

	protected LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
		super(id, firstName, lastName, salary);
		this.soldiers = new ArrayList<Soldier>();
	}

	@Override
	public void addPrivate(Soldier p) {
		this.soldiers.add(p);

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());

		sb.append(System.lineSeparator())
		.append("Privates:")
		.append(System.lineSeparator());

		soldiers.sort((f, s) -> s.getId() - f.getId());

		for (Soldier soldier : soldiers) {
			sb.append(" ");
			sb.append(soldier.toString()).append(System.lineSeparator());
		}

		return sb.toString();
	}
}
