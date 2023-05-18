package indra.talentCamp.generics;


@FunctionalInterface
public interface Operation<T> {
	
	// Interfaz funcional  -> Solo un método
	T Operate(T a, T b);
}
