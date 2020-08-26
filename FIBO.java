public class FIBO {

    /**
     * @param n
     */
    public static void dayFibo(int n){
        // in ra n so dau tien trong day Fibonacci
        int fb[]=new int[100];
        int i;     
        fb[0]=0;
        fb[1]=1;

        System.out.print(fb[0]+" "+fb[1]+" ");
        for(i=2;i<n;i++){
            fb[i] = fb[i-1]+fb[i-2];
            System.out.print(fb[i]+" ");
        }
    }
    public static void main(String[] args) {
        // in ra 30 so dau tien trong day Fibonacci
        dayFibo(30);     
    }
    
}
