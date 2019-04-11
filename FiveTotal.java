package day02;

import java.util.Scanner;

public class FiveTotal {
public static void main(String[] args){
	Scanner inputScanner =new Scanner(System.in);
	int[][] array = new int[5][5];//第一个五是指五个班，第二个五是指五个人
	//循环录入每个班级的学员成绩
	//外层循环班
	for(int i = 0;i<array.length;i++){
		System.out.println("——————————————请输入第"+(i+1)+"个班的成绩————————————————————");
		//内层循环：当前每个班的人
		for(int j =0;j<array[i].length;j++){
			System.out.println("请输入第"+(j+1)+"个同学的成绩");
			array[i][j] = inputScanner.nextInt();
		}
	}
	//计算各个班分别的总成绩
	//外层循环班
	//记录总和
	System.out.println("*******成绩统计**********");
	int sum = 0;
	for(int i = 0;i<array.length;i++){
		System.out.println("这是第"+(i+1)+"个班");
		sum =0;//每个班进来统计时 ，sum要清零
		//内层循环每个班的人
		for(int j = 0;j<array[i].length;j++){
			sum+=array[i][j];
		}
		System.out.println("这个班的总成绩是："+sum);
	}
}
}
