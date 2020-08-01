public class TimUCLN {
    public static int timUCLN(int a, int b){
        while (a != b){
            if (a > b){
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
}
