import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(8, 8, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три", "три"));

        System.out.println("Task 1");
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        System.out.println("\nTask 2");
        Set<Integer> set = new TreeSet<>(nums);
        for (Integer setMember : set) {
            if (setMember % 2 == 0) {
                System.out.println(setMember);
            }
        }

        System.out.println("\nTask 3");
        Set<String> setOfStrings = new HashSet<>(strings);
        for (String string : setOfStrings) {
            System.out.println(string);
        }

        System.out.println("\nTask 4");
        Map<String, Integer> mapOfStrings = new HashMap<>();
        for (String string : setOfStrings) {
            int wordCounter = 0;
            for (String s : strings) {
                if (s.equals(string)) {
                    mapOfStrings.put(string, ++wordCounter);
                }
            }
        }
        for (Integer wordCounter : mapOfStrings.values() ) {
            System.out.println(wordCounter);
        }
    }
}