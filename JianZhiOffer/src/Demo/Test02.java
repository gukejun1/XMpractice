package Demo;
/**
 * 字符串
 *
 *请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 *例如，当字符串为We Are Happy.则经过替换之后的字符串
 *为We%20Are%20Happy。
 */
public class Test02 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("We Are Happy");
        String arr = replaceSpace(str);
        System.out.println(arr);
    }

    /**
     * 将空格替换为%20的函数
     * @param str
     * @return
     */
    public static String replaceSpace(StringBuffer str) {
        String newStr = "";//定义初始字符串
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' ') {
                //如果字符串中含有空格，就替换成%20
                newStr = newStr + "%20";
            }else {
                //不含有的话，不变化
                newStr = newStr + str.charAt(i);
            }
        }
        return newStr;
    }
}

