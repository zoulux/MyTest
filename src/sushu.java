public class sushu {  
    public static void main(String[] args) {  
        int n = 100, sqrt = (int) Math.sqrt(n), sum = 0;  
        boolean[] isPrime = new boolean[n + 1];  
        //初始化数组，除了2以外，偶数肯定不是素数，素数肯定是奇数。  
        isPrime[2] = true;  
        for (int i = 3; i < n; i += 2)  
            isPrime[i] = true;  
        for (int i = 3; i < sqrt; i += 2)  
            if (isPrime[i]) //从奇数中选出素数  
                for (int j = i * 3; j <= n; j += i<<1) //排除素数的所有奇数倍  
                    isPrime[j] = false;  
        for (int i = 2; i < n; i++)  
            if (isPrime[i])  
                System.out.print(i + " ");  
    }  
}  