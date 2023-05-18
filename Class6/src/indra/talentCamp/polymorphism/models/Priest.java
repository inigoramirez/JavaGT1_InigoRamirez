package indra.talentCamp.polymorphism.models;

public class Priest extends Player {
	
	public Priest(String name, int playerType) {
		super(name);
	}
	
	@Override
	public void action(Player enemy) {
		System.out.format("%s cura a %s por %d puntos de daño\n",
				this.getName(),
				enemy.getName(),
				this.getSkill());
		enemy.setHp(enemy.getHp() + this.getSkill());
	}
}
