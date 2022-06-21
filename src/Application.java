import leetcode.BackspaceStringCompare;
import leetcode.TwoSum;

public class Application {

    public static void main(String[] args) {
        BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();
        boolean isEqual = backspaceStringCompare.backspaceCompare("ab##", "c#d#");
        System.out.println(isEqual);

        TwoSum twoSumClass = new TwoSum();
        int[] twoSum = twoSumClass.twoSum(new int[]{3,2,4}, 6);
        System.out.println(twoSum[0] +", "+ twoSum[1]);

    }
}
