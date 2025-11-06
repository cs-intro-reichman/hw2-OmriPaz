public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];  // hh:mm
        int minutesToAdd = Integer.parseInt(args[1]);

		int hours = Integer.parseInt("" + time.charAt(0) + time.charAt(1));
        int minutes = Integer.parseInt("" + time.charAt(3) + time.charAt(4));

        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int totalHours = totalMinutes / 60;
        String newHour = Integer.toString(totalHours % 24);
        String newMinutes = Integer.toString(totalMinutes - totalHours * 60);  // Generates the remainder

        if (newHour.length() == 1) {
            newHour = "0" + newHour;
        }
        if (newMinutes.length() == 1) {
            newMinutes = "0" + newMinutes;
        }

        System.out.println(newHour + ":" + newMinutes);
    }
}
