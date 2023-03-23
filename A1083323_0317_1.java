import java.util.Scanner;

public class A1083323_0317_1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        System.out.print("請輸入n值:");
        int n = sc.nextInt();
        
        System.out.print("請輸入m值:");
        int m = sc.nextInt();
        
        int[][] arr = new int[n][m];
        
        //for
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=m; j++) {
                arr[i-1][j-1]=i*j;
            }
        }
        
        //foreach
        System.out.println("二維陣列中的元素:");
        for(int[] row:arr){
            for(int e:row){
                System.out.print(e+" ");
            }
            System.out.println();
        }
	}
}