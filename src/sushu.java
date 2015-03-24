public class sushu {  
    public static void main(String[] args) {  
        int n = 100, sqrt = (int) Math.sqrt(n), sum = 0;  
        boolean[] isPrime = new boolean[n + 1];  
        //��ʼ�����飬����2���⣬ż���϶����������������϶���������  
        isPrime[2] = true;  
        for (int i = 3; i < n; i += 2)  
            isPrime[i] = true;  
        for (int i = 3; i < sqrt; i += 2)  
            if (isPrime[i]) //��������ѡ������  
                for (int j = i * 3; j <= n; j += i<<1) //�ų�����������������  
                    isPrime[j] = false;  
        for (int i = 2; i < n; i++)  
            if (isPrime[i])  
                System.out.print(i + " ");  
    }  
}  