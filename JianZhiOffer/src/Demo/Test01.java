package Demo;
/**
 * Created by fang on 2020/4/18.
 */
/**
 * 数组
 *
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一
 * 个整数，判断数组中是否含有该整数。
 */
public class Test01 {
    public static void main(String[] args) {
        int [] [] arr = {{1,2,4,5},{2,3,5,6}};//输入该数组
        int a = 6;//输入对应的整数
        boolean b = Find(a,arr);//调用该函数
        System.out.println("该数组中是否包含整数" + a+"："+b);
    }

    /**
     * 判断二维数组中是否含有整数的函数
     * @param arr
     * @param a
     * @return
     */
    public static boolean Find( int a, int[][] arr) {
        boolean bl = false;//定义标记
        //遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==a) {
                    //如果二维数组中含有该整数，返回true
                    bl = true;
                }
            }
        }
        return bl;
    }
}

