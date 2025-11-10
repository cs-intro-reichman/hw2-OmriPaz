// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int numOfTerms = Integer.parseInt(args[0]);
		double sum = 0;

		for (int i = 0; i < numOfTerms; i++) {
			if (i % 2 == 0) {
				sum += (double) 1 / (1 + (i * 2));
			} else {
				sum -= (double) 1 / (1 + (i * 2));
			}
		}

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + sum * 4);
	}
}
