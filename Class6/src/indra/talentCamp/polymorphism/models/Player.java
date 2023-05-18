package indra.talentCamp.polymorphism.models;

public abstract class Player {

	private String name;
	private int hp;
	private int strength;
	private int skill;
	@SuppressWarnings("unused")
	private int modStrength;
	
	public Player(String name) {
		super();
		this.name = name;
		this.hp = 50;
		this.strength = 50;
		this.skill = 50;
		this.modStrength = 0;
	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	protected void setHp(int hp) {
		this.hp = hp;
	}

	public int getStrength() {
		return strength;
	}

	protected void setStrength(int strength) {
		this.strength = strength;
	}

	public int getSkill() {
		return skill;
	}

	protected void setSkill(int skill) {
		this.skill = skill;
	}
	
	protected void setModStrength(int modStrength) {
		this.modStrength = modStrength;
	}
	
	public boolean isAlive() {
		return this.hp > 0;
	}
	
	public abstract void action(Player enemy);
	
	@Override
	public String toString() {
		return String.format("Nuestro personaje %s, llamado %s \n Tiene una salud: %d \n Tiene una destreza: %d \n Tiene fuerza : %d",
				this.getClass().getSimpleName(),
                this.name,
                this.hp,
                this.skill,
                this.strength);
	}
	
	public void endTurn() {
		this.modStrength = 0;
	}
}
