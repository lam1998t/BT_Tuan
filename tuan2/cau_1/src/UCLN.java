public class UCLN {
    public static int GCD(int a, int b){
        if (a > b){
            a -= b;
        } else {
            b -= a;
        }
        return a;
    }
}
