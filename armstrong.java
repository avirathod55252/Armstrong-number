public class armstrong1 {
    static String armstrongNumber(int n){
        // code here
        int x=n%10;
        int y=(n/10)%10;
        int z = n/100;
        if (x*x*x+ y*y*y+z*z*z==n)
            return "Yes";
            else
            return "No";
    }
    public static void main(String args[])
    {
        System.out.println(armstrongNumber(153));
    }
}
