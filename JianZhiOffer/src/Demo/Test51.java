package Demo;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
 * 不能使用除法。
 * （注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
 */
/*
 * B[i]的值可以看作下图的矩阵中每行的乘积。
 * 下三角用连乘可以很容求得，上三角，从下向上也是连乘。
 * 因此我们的思路就很清晰了，先算下三角中的连乘，即我们先
 * 算出B[i]中的一部分，然后倒过来按上三角中的分布规律，把另一部分也乘进去。
 */
public class Test51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A0[] = sc.nextLine().split(" ");//将字符存储起来，保存到A0字符数组中去
        int [] A = new int[A0.length];
        for (int i = 0; i < A.length; i++) {
            //将字符数组A0转换为数字数组A
            A[i] = Integer.valueOf(A0[i]);
        }
        int [] B = multiply(A);
        System.out.println(Arrays.toString(B));
    }

    public static int[] multiply(int[] A) {//传入A数组，传出B数组
        int n = A.length;
        int [] B = new int[n];
        if(n!=0) {
            B[0] = 1;
            //计算下三角乘积
            for (int i = 1; i < n; i++) {
                B[i] = B[i-1]*A[i-1];
            }

            int te = 1;
            //计算上三角乘积
            for (int j = n-2; j >=0; j--) { }
        }
        return B;
    }
}