import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        List list = new ArrayList();

        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                 list.add(nums[i]);
            } else {
                return true;
            }
        }
        return false;

    }
}
