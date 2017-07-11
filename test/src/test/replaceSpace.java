/*
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
package test;

public class replaceSpace {
	public String replace(StringBuffer str) {
    	String s=str.toString();
        char[] array=s.toCharArray();
        StringBuffer newStr=new StringBuffer();
        for(int i=0;i<array.length;i++){
            if(array[i]==' '){
                newStr.append("%20");
                
            }
            else{
                newStr.append(array[i]);
            }
        }
        return newStr.toString();
    }
}
