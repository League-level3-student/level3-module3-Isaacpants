import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		Cow c = new Cow();
		Pig p = new Pig();
		ArrayList<Animal> farm = new ArrayList<>();

		farm.add(new Cow());
		farm.add(new Pig());
		farm.add(new Cow());
		farm.add(new Pig());
		farm.add(new Cow());
		farm.add(new Pig());
		for (int i = 0; i < farm.size(); i++) {
			farm.get(i).makeNoise();
			farm.get(i).eat();
			farm.get(i).drink();
			farm.get(i).walk();
			farm.get(i).poop();

		}

	}
}
