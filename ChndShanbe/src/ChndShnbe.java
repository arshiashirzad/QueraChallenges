import java.util.HashMap;
import java.util.Scanner;

    public static void main(String[] args) {
        HashMap<String, Integer> dates = new HashMap<>();
        dates.put("Farvardin", 31);
        dates.put("Ordibehesht", 31);
        dates.put("Khordad", 31);
        dates.put("Tir", 31);
        dates.put("Mordad", 31);
        dates.put("Shahrivar", 31);
        dates.put("Mehr", 30);
        dates.put("Aban", 30);
        dates.put("Azar", 30);
        dates.put("Dey", 30);
        dates.put("Bahman", 30);
        dates.put("Esfand", 29);

        String[] days = {"shanbe", "1shanbe", "2shanbe", "3shanbe", "4shanbe", "5shanbe", "jome"};
        String[] dateKeys = {"Farvardin", "Ordibehesht", "Khordad", "Tir", "Mordad", "Shahrivar", "Mehr", "Aban", "Azar", "Dey", "Bahman", "Esfand"};

        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < testCases; i++) {
            String[] today = scanner.nextLine().split(" ");
            String[] goal = scanner.nextLine().split(" ");

            if (indexOf(dateKeys, today[1]) == indexOf(dateKeys, goal[1])) {
                if (Integer.parseInt(today[0]) - Integer.parseInt(goal[0]) >= 0) {
                    System.out.println(days[(indexOf(days, today[2]) - ((Integer.parseInt(today[0]) - Integer.parseInt(goal[0])) % 7) + 7) % 7]);
                } else {
                    System.out.println(days[(indexOf(days, today[2]) + ((Integer.parseInt(goal[0]) - Integer.parseInt(today[0])) % 7) + 7) % 7]);
                }
            } else if (indexOf(dateKeys, today[1]) > indexOf(dateKeys, goal[1])) {
                int step = Integer.parseInt(today[0]);
                int temp = indexOf(dateKeys, today[1]) - 1;
                int goalTemp = indexOf(dateKeys, goal[1]);

                while (temp != goalTemp) {
                    step += dates.get(dateKeys[temp]);
                    temp--;
                    if (temp < 0) {
                        temp = dateKeys.length - 1;
                    }
                }

                System.out.println(days[(indexOf(days, today[2]) - ((step + dates.get(goal[1]) - Integer.parseInt(goal[0])) % 7) + 7) % 7]);
            } else {
                int temp = indexOf(dateKeys, today[1]) + 1;
                int goalTemp = indexOf(dateKeys, goal[1]);
                int step = dates.get(today[1]) - Integer.parseInt(today[0]);

                while (temp != goalTemp) {
                    step += dates.get(dateKeys[temp]);
                    temp++;
                    if (temp >= dateKeys.length) {
                        temp = 0;
                    }
                }

                System.out.println(days[(indexOf(days, today[2]) + (step + Integer.parseInt(goal[0])) % 7) % 7]);
            }
        }
    }

    private static int indexOf(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
}
