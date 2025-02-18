public class LargeSmallString {
    public static void main(String[] args) {
        String str = "vision without action is day dream";
        String[] words = str.split(" ");
        String smallest = words[0];
        String largest = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < smallest.length()) {
                smallest = words[i];
            }
            if (words[i].length() > largest.length()) {
                largest = words[i];
            }
        }
        System.out.println("Smallest Word: " + smallest);
        System.out.println("Largest Word: " + largest);
    }
}

