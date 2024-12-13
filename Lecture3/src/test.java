public class test {

    public static void main(String[] args) {
        int[] values = new int[12];
        int size = values.length;
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            values[i] = i;
            System.out.println(values[i]);
        }

    }

}
