package app.patterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evgeny_Akulenko on 11/30/2017.
 */
public class Context {

	private Algorithm algorithm;

	public String calculateResponse() {
		return algorithm.calculateResponse();
	}

	public void setAlgorithm(Algorithm algorithm) {
		this.algorithm = algorithm;
	}

	public static void main(String[] args) {
		List<Algorithm> algorithms = new ArrayList<>();
		algorithms.add(new AlgorithmImplFirst());
		algorithms.add(new AlgorithmImplSecond());

		Context context = new Context();
		for (Algorithm a : algorithms) {
			context.setAlgorithm(a);
			String result = context.calculateResponse();
			System.out.println(result);
		}
	}
}
