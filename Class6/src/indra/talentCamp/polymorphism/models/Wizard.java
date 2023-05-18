package indra.talentCamp.polymorphism.models;

public class Wizard extends Player {
	
	private int mana;
	private int magicPower;
	
	public Wizard(String name) {
		super(name);
		this.mana = 100;
		this.magicPower = 10;
	}
	
	@Override
	public void action(Player enemy) {
		if(mana > magicPower) {
			System.out.format("%s hechiza a %s y modifica sus stats\n",
					this.getName(),
					enemy.getName());
			enemy.setModStrength(-this.magicPower);
			this.mana -= this.magicPower;
		}
	}
	
	@Override
	public void endTurn() {
		super.endTurn();
		this.mana += 1;
	}
}
