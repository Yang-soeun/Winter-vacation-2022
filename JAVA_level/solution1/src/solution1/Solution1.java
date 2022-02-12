package solution1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1 {
	// 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을때, k번째에 있는 수를 구하는 프로그램
	public static int[] solution1(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];//배열 생성과 값 초기화
		int[] newArray = {};
		
		for(int a = 0; a<commands.length; a++)
		{
			int i = commands[a][0] -1;
			int j = commands[a][1];
			int k = commands[a][2]-1;
			
			newArray = new int[j-i];
			int c = 0;
			for(int b = i; b<j; b++)
			{
				//i번째 숫자부터 j번째 숫자까지 잘라서 넣기
				newArray[c] = array[b];
				c ++;
			}
			
			Arrays.sort(newArray);//정렬하기
			answer[a] = newArray[k];
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a = {1, 5, 2, 6, 3, 7, 4};
        int[][] c = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
        System.out.println(Arrays.toString(solution1(a, c)));

	}

}
