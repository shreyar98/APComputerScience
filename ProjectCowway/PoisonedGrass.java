public class PoisonedGrass extends Grass {
	PoisonedGrass(int x, int y) {
		super(x, y);
	}
		
	public void increaseAmount() {
		this.amount += 2;
	}
}
