/*
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 
 * 解题思路：左下角开始，遇大右移，遇小上移，直到超过边界都没找到，得false。否则得true。
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
