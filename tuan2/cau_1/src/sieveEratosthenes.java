public class sieveEratosthenes {
    public static void SieveEratosthenes(int n) {
        int i = 0;
        int num = 0;
        String trang = "";
        for (i = 1; i <= n; i++) {
            int count = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count = count + 1;
                }
            }
            if (count == 2){
                trang = trang + i + " ";
            }
        }
        System.out.println("số nguyên trong dãy : "+trang);
    }
}
