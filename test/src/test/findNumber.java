/*
 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
 * �����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
 * 
 * ����˼·�����½ǿ�ʼ���������ƣ���С���ƣ�ֱ�������߽綼û�ҵ�����false�������true��
 */
package test;

public class findNumber {
	public boolean Find(int target,int [][]array){
		int m,n,x,y;
		m=array.length;
		n=array[0].length;
		x=0;
		y=n-1;
		while(x<m && y>=0){
			if(target>array[x][y])
				x++;
			else if(target<array[x][y])
				y--;
			else
				return true;
		}
		return false;
	}
}
