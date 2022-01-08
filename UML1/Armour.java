public abstract class Armour {
	protected int rarity;
	protected Armour slot;
	protected String mod1;
	protected String mod2;
	protected String mod3;
	
	public Armour () {
		ArmourFactory a = new ArmourFactorySpawner();
		slot = a.spawnArmour();
	}
	
	public abstract String getDescription();
}
