public class UCLN {
    
    
    /**
     * @param a
     * @param b
     * @return 
     */
    //a va b la 2 so nguyen can xet
    public static int ucln(int a, int b){
	int i;
        while(b!=0){
            i=b;
	    b=a%b;
	    a=i;
        }
        return a;
    };
    public static void main(String[] args) {
        // In ra uoc chung lon nhat cua a va b
        System.out.println(ucln(150,200));
    }
}
