public class Runner {

    //your main containing tests and output
    public static void main(String[] args) {

        System.out.println(helloName("Matt"));
        System.out.println(helloName("Jim"));
        System.out.println(helloName("Maria"));
        System.out.println(helloName("Kate"));

        //System.out.println(nextMethod(true));
    }

    //your codingbat method here - must match
    // the method name from codingbat
    public static String helloName(String name) {
        return "hi " + name;
    }

    // next codingbat method here
    //warmup 1
    public boolean icyHot(int temp1, int temp2) {
        if(((temp1 > 100) && (temp2 < 0))||((temp1 < 0) && (temp2 > 100))){
            return true;
        }else{
            return false;
        }
    }

    //warmup2
    public int arrayCount9(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 9){
                count ++;
            }
        }
        return count;
    }

    //string1
    public String withouEnd2(String str) {
        if(str.length() == 3){
            return str.substring(1, 2);
        }else{
            if(str.length() <=2){
                return "";
            }else{
                return (str.substring(1, (str.length() - 1)));
            }
        }
    }
    //array1
    public int[] makeLast(int[] nums) {
        int last = nums[nums.length-1];
        int[] result = new int[(nums.length * 2)];
        for(int i = 1; i < (nums.length * 2); i++){
            if(i == ((nums.length*2) -1)){
                result[i] = last;
            }else{
                result[i] = 0;
            }
        }
        return result;
    }
    //logic 1
    public int teenSum(int a, int b) {
        if(((a >12)&& (a < 20))  || ((b > 12) && (b < 20))){
            return 19;
        }else{
            return (a + b);
        }
    }

}
