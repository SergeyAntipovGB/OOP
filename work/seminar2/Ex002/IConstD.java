package work.seminar2.Ex002;

public class IConstD implements IConst {
    static int[] nums = new int[MAX];

    public static void main(String[] args) {
        for (int i= MIN; i< 11;i++) {
            if (i>=MAX) {
                System.out.println(ERROR);
            }else {
                nums[i] = i;
                System.out.println(nums[i]);
            }
        }
    }
}
