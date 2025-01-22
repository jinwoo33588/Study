import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon_1010 {
    static int dp[][] = new int[30][30];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            
        }
    }

    public static int Comb(int n, int m){
        if(n==m || m==0){
            return dp[n][m]=1;
        }

        return dp[n][m] = Comb(n-1,m-1) + Comb(n-1,m);
    }
}