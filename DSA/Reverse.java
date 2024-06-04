/**
 * Reverse
 */
public class Reverse {

    public static void main(String[] args) {
        long a = 9646324351;
        long b = -321;
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(a).substring(1));
        sb.reverse();
        long y;
        y = Long.parseLong(sb.toString()) * -1;
        System.out.println(y);
    }
}