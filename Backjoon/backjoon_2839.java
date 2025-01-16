import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.StringTokenizer;

public class backjoon_2839 {
    public static int count = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in)); //선언

        int N = Integer.parseInt(br.readLine());
        Find(N);

        System.out.println(count);
    }

    public static void Find(int N){
        int x = N/5;
        int y = N%5;
        count += x;
        if (y<4){
            count +=1;
        }
        else{
            count +=2;
        }
        
    }
}
