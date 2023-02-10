package lambdas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;


public class principal {

	public static void main(String[] args) {
		
		Function<String,Integer> size1 =  s1 -> s1.length();
		
		BinaryOperator<Integer> suma = (x1, x2) -> x1 + x2;
		BinaryOperator<Integer> resta = (x1, x2) -> x1 - x2;
		BinaryOperator<Integer> multi = (x1, x2) -> x1 * x2;
		BinaryOperator<Integer> div = (x1, x2) -> x1 / x2;

		
		List<Integer> op = new ArrayList<Integer>();
		op.add(suma.apply(size1.apply("hola mundo"),size1.apply("mundo")));
		op.add(resta.apply(size1.apply("hola mundo"),size1.apply("mundo")));
		op.add(multi.apply(size1.apply("hola mundo"),size1.apply("mundo")));
		op.add(div.apply(size1.apply("hola mundo"),size1.apply("mundo")));
		
		op.stream().filter(x -> x > 10)
		.forEach(System.out::println);;
		
		System.out.println("-----------------------");
		
		
		op.forEach(System.out::println);
		
		
	}

}
