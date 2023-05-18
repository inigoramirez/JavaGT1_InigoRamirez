package indra.talentCamp.generics;

public class Safe<T, S> {

	private S password;
	private T value;
	
	public Safe(S password) {
		// TODO Auto-generated constructor stub
		this.password = password;
	}
	
	public void updateValue(T value) {
		this.value = value;
	}
	
	public T readValue(S password) {
		if(this.password == password) {
			return value;
		}
		
		throw new Error("¡¡¡Unauthorized access!!!");
		
	}
}
