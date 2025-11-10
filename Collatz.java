// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		char mode = args[1].charAt(0);

		for (int i = 1; i <= seed; i++) {
			int curr = i;
			int steps = 1;
			boolean reachedOne = false;
			if (mode == 'v') {
				System.out.print(curr + " ");
			}
			while (!reachedOne) {
				if (curr % 2 == 0) {
					curr = curr / 2;
				} else {
					curr = curr * 3 + 1;
				}
				steps += 1;
				if (mode == 'v') {
					System.out.print(curr + " ");
				}
				if (curr == 1) {
					reachedOne = true;
				}
			}
			if (mode == 'v') {
					System.out.print("(" + steps + ")\n");
				}
		}
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
	}
}
