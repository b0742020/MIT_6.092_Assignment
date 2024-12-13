public class Marathon {

    public static void sortTimes(int[] times, String[] names) {
        for (int i = 0; i < times.length; i++) {
            for (int j = i + 1; j < times.length; j++) {
                if (times[i] > times[j]) {
                    int temp = times[i];
                    times[i] = times[j];
                    times[j] = temp;
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }
    }

    public static void printFastest(int[] times, String[] names) {
        for (int i = 0; i < 2; i++) {
            System.out.println("Name : " + names[i] + " " + "Times are:" + times[i]);

        }

    }

    public static void newLine() {
        System.out.println();
    }

    public static void main(String[] arguments) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };

        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }

        newLine();

        sortTimes(times, names);

        printFastest(times, names);
    }
}
