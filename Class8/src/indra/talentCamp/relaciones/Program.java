package indra.talentCamp.relaciones;

import org.mozilla.javascript.Context;
import indra.talentCamp.relaciones.composite.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation calculation = new Sum(
				new Value(2),
				new Multiplication(new Value(2), new Value(3)));
		
		System.out.println("2 + 2 * 3 = " + calculation.calculate());
		System.out.println(2 + 2 * 3 == calculation.calculate());
		
		Operation calculation2 = new Sum(
				new Multiplication(new Value(6), new Value(5)),
				new Multiplication(new Value(3), new Value(8)));
		
		System.out.println("6 * 5 + 3 * 8 = " + calculation2.calculate());
		System.out.println(6 * 5 + 3 * 8 == calculation2.calculate());
		
		Operation calculation3 = new Sum(5.0,
				new Sum(
						new Multiplication(3.0,8.0),
						new Multiplication(4.0,3.0)
				));
		
		System.out.println("5 + 3 * 8 + 4 * 3 = " + calculation3.calculate());
		System.out.println(5 + 3 * 8 + 4 * 3 == calculation3.calculate());
		
		String expression = "5+3*8+4*3";
		
		/* No válido para la versión actual de java
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		try {
			var result = engine.eval(expression);
			System.out.println("The result is " + result);
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			System.out.println("Error when executing " + expression + e.getMessage());
		}
		*/
		
		Context jsContext = Context.enter();
		try {
			var res = jsContext.evaluateString(jsContext.initSafeStandardObjects(),
					expression,
					"Calculus",
					1,
					null);
			System.out.println("\n------------- JS ---------------");
			System.out.println(expression + "=" + res);
		} finally {
			Context.exit();
		}
	}

}
