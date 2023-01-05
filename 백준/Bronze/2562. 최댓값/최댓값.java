import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> nums = Arrays.asList(sc.nextInt(), sc.nextInt(), sc.nextInt(),
                sc.nextInt(), sc.nextInt(), sc.nextInt(),
                sc.nextInt(), sc.nextInt(), sc.nextInt());

//        Arrays.sort(nums);
//
//        System.out.println(nums[nums.length - 1]);
//        System.out.println(nums.length - 1);

        int val = Collections.max(nums);
        int idx = nums.indexOf(val) + 1;

        System.out.println(val);
        System.out.println(idx);
    }
}
