package binarynumbers;

public class BinaryNumbers {

    public static void main(String[] args) {
        int n = 125;
        String s = Integer.toBinaryString(n);

        int count = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                count = 0;
            } else {
                count++;
                max = Math.max(count, max);
            }
        }

        System.out.println(max);
    }
}
