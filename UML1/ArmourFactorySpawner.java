import java.util.Random;

public class ArmourFactorySpawner implements ArmourFactory {
	
	public ArmourFactorySpawner() {}

	@Override
	public Armour spawnArmour() {
		Random random = new Random();
		int gearSlot = random.nextInt(4);
		if(gearSlot == 0) {
			return (new Helm()); 
		}
		else if(gearSlot == 1) {
			return (new ChestPiece()); 
		}
		else if(gearSlot == 2) {
			return (new Gloves());
		}
		// We can add more Armour here including boots and stuff.
		else {
			return  null;
		}
	}
	
}
