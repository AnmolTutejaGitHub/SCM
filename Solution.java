import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<String> printNtimes(int n) {
        // Write your code here.
        List<String> ans = new ArrayList<>();

        if (n == 0)
            return ans;

        ans = printNtimes(n - 1);

        ans.add("Coding Ninjas");

        return ans;

    }

    public static void main(String[] args) {
        System.out.println(printNtimes(3));
    }
}
