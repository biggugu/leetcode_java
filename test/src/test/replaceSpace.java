/*
 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
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
