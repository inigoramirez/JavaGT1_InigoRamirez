package indra.talentCamp.banco;

public class Client {

	private int id;
	private String name;
	private String surname;

	/*
	public Client(int id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	*/
	
	// Solo el builder puede crear clientes
	private Client() {
		super();
	}

	public int getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	// Inner Class
	public static class ClientBuilder {
		
		private int id = 0;
		private String name = null;
		private String surname = null;
		
		// Setters con Fluent Interfaces
		public ClientBuilder setID(int id) {
			this.id = id;
			return this;
		}
		
		public ClientBuilder setName(String name) {
			this.name = name;
			return this;
		}
		
		public ClientBuilder setSurname(String surname) {
			this.surname = surname;
			return this;
		}
		
		public Client build() {
			assert this.name != null;
			assert this.surname != null;
			assert this.id > 0;
			
			Client c = new Client();
			c.id = this.id;
			c.name = this.name;
			c.surname = this.surname;
			return c;
		}
	}
	
	public static ClientBuilder builder() {
		return new ClientBuilder();
	}
}
