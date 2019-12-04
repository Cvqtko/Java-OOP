package exercise_05;

import java.util.ArrayList;

public class StackOfStrings {
	private ArrayList<String> data;

	StackOfStrings() {
		this.data = new ArrayList<>();
	}

	public boolean isEmpty() {
		return this.data.isEmpty();
	}

	public void push(String item) {
		this.data.add(item);
	}
	
	public String pop() {
		return this.data.remove(getLastIndex());
	}

	public String peek() {
		return this.data.get(getLastIndex());
	}
	
	private int getLastIndex() {
		return this.data.size()-1;
	}
}
