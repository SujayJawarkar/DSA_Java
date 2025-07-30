package arrays;
import java.util.*;

public class SumOfMinMax {
    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        list.add(-10L);
        list.add(2L);
        list.add(4L);
        list.add(5L);
        list.add(6L);
        System.out.println(sumMinMax(list));

    }
    static long sumMinMax(List<Long> nums){
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        for(long i: nums){
            if (max < i){
                max = i;
            }
        }
        for(long i: nums){
            if (min > i){
                min = i;
            }
        }
        return (max+min);
    }
}
