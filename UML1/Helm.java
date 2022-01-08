import java.util.Random;

public class Helm extends Armour {
	
	protected Armour armour;
	
	public Helm() {
		super();
		Random random = new Random();
		int rarity = random.nextInt(4);
		super.rarity = rarity;
		if(rarity == 3) {
			super.mod1 = getRandomAttribute();
			super.mod2 = getRandomAttribute();
			super.mod3 = getRandomAttribute();
		}
		else if(rarity == 2) {
			super.mod1 = getRandomAttribute();
			super.mod2 = getRandomAttribute();
		}
		else if(rarity == 1) {
			super.mod1 = getRandomAttribute();
		}
	}
	
	private String getRandomAttribute() {
		Random random = new Random();
		int r = random.nextInt(3);
		if(r == 0) return ((new Strength(this)).getDescription()); 
		if(r == 1) return ((new Intelligence(this)).getDescription()); 
		return ((new Dexterity(this)).getDescription()); 
	}
	
	
	private String getRarityDescription() {
		if(rarity == 0) return ((new Common(this)).getDescription());
		if(rarity == 1) return ((new Uncommon(this)).getDescription());
		if(rarity == 2) return ((new Rare(this)).getDescription());
		return "Epic";
	}

	@Override
	public String getDescription() {
		String descript = getRarityDescription() + " " + "Helm" + ":\n";
		if(rarity == 3) {
			descript = descript + mod1 + "\n";
			descript = descript + mod2 + "\n";
			descript = descript + mod3 + "\n";
		}
		if(rarity == 2) {
			descript = descript + mod1 + "\n";
			descript = descript + mod2 + "\n";
		}
		if(rarity == 1) {
			descript = descript + mod1 + "\n";
		}
		return descript;
	}

}
