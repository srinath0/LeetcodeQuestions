//public class HrToMinutes {
//    public static void main(String[] args) {
////        int hour = 60;
////        int minutes = 1;
////        double seconds = 0.01667;
////        double ms = 0.00001667;
////        System.out.println(1*hour + 5*minutes + 6*seconds + 10*ms +"minutes");
//
//        }
//    }
//}
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class HrToMinutes {
    public static void main(String[] args) {
        String timeStr = "5min 5hrs 60s 15ms";
        Pattern pattern = Pattern.compile("(\\d+)hr|(\\d+)min|(\\d+)s|(\\d+)ms");
        Matcher matcher = pattern.matcher(timeStr);
        int hours = 0, minutes = 0, seconds = 0, milliseconds = 0;
        while (matcher.find()) {
            if (matcher.group(1) != null) hours = Integer.parseInt(matcher.group(1));
            if (matcher.group(2) != null) minutes = Integer.parseInt(matcher.group(2));
            if (matcher.group(3) != null) seconds = Integer.parseInt(matcher.group(3));
            if (matcher.group(4) != null) milliseconds = Integer.parseInt(matcher.group(4));
        }
        double totalMinutes = hours * 60 + minutes + (seconds / 60.0) + (milliseconds / 60000.0);
        System.out.println("Total duration: " + totalMinutes + " minutes");
    }
}
