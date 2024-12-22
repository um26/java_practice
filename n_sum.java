//Write a program to find the sum of the given series 1+2+3+ . . . . . . (n terms)

public class n_sum {
    public static long seriesSum(int n) {
        // code here
        long sum =0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}
