import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        long result = getArithmeticProgressionSum(10000000, 1000000000);
        System.out.println(result);

    }

    public static long getArithmeticProgressionSum(int a, int b) {
        if(b <= a) {
            throw new IllegalArgumentException("b должно быть больше a");
        }
        return LongStream.range(a, b).sum();
    }
}