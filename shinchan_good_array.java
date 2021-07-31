import java.io.*;
import java.util.*;

class Solution {
    public void solution(int N, int[] A){
        int[] B = new int[N];
        for(int i = 0; i < N; i++){
            B[i] = A[i];
        }
        int swap = 0;
        
        int evenpos = 1;
        
        int oddpos = 0;
        
        for(int i = 0; i < N; i++){
            int temp = 0;
            //int lar = 0;
            //int lar1 = 0;
            if(A[i]%2 == 0){
                temp = A[i];
                
                for(int j = 0; j < N; j++){
                    if(A[j]%2 == 0 && B[j] != 0){
                        if(A[j] < temp){
                            temp = A[j];
                            A[j] = A[evenpos];
                            A[evenpos] = temp;
                            if(evenpos == j){}
                            else{
                                swap++;
                                //System.out.println("here1");
                            }
                            B[evenpos] = 0;
                            evenpos = evenpos + 2;
                            
                        }
                        else{
                            continue;
                        }
                    }
                    else{
                        continue;
                    }
                }
            }
            else{
                continue;
            }
        }
        
        for(int i = 0; i < N; i++){
            int temp = 0;
            //int lar = 0;
            //int lar1 = 0;
            if(A[i]%2 != 0){
                temp = A[i];
                for(int j = 0; j < N; j++){
                    if(A[j]%2 == 1 && B[j] != 0){
                        if(A[j] < temp){
                            temp = A[j];
                            A[j] = A[oddpos];
                            A[oddpos] = temp;
                            if(oddpos == j){}
                            else{
                                swap++;
                                //System.out.println("there1");
                            }
                            B[oddpos] = 0;
                            oddpos = oddpos + 2;
                            
                        }
                        else{
                            continue;
                        }
                    }
                    else{
                        continue;
                    }
                }
            }
            else{
                continue;
            }
        }
        
        if(A[N - 1]%2 == 0){}
        else{
            int temp1 = A[N-1];
            A[N-1] = A[N-2];
            A[N-2] = temp1;
            swap++;
        }
        
        for(int i = 0; i < N; i++){
            System.out.println(A[i]);
        }
        System.out.println(swap);
    }
}

public class shinchan_good_array {
    public static void main(String args[]) throws InterruptedException {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++)
            A[i] = sc.nextInt();
        Solution s = new Solution();
        s.solution(N, A);
    }
}