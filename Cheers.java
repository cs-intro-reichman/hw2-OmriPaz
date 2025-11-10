// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String cheer = args[0];
            int index = Integer.parseInt(args[1]);

            char[] anLetters = {'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R', 'S', 'X'};
            for (int i = 0; i < cheer.length(); i++) {
                String prefix = "a ";

                for (char letter : anLetters) {
                        if (letter == cheer.charAt(i)) {
                                prefix = "an ";
                        }
                }
                char letterToPrint = Character.toUpperCase(cheer.charAt(i));
                System.out.println("Give me " + prefix + letterToPrint + ": " + letterToPrint + "!");

            }
            System.out.println("What does that spell?");
            for (int i = 1; i <= index; i++) {
                System.out.println(cheer + "!!!");
            }

        }
}
