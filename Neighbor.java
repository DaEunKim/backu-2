//*********************************************************
//* Name: 김다은   
//* Student ID : 20135179
//* Program ID : HW #2
//* Description: 처음 시작하는 원점을 입력받아서, 최소값을 가지는 간선으로 따라간 후 원점으로 돌아온다. 
//* Algorithm : Neighbor algorithm --> 모든 정점을 한 번씩 다 돌고 원점으로 돌아온다.    
//* Variables Used
//* V : 배열을 이용한 그래프 표
//* select : 선택된 vertex
//* firstselect : 처음 선택된 vertex 
//* 
//********************************************************** 

package ex;

import java.util.Scanner;

public class Neighbor {
	public static void main(String[] args) {
		System.out.println("1~4사이의 숫자를 입력하시오. (1=a, 2=b, 3=c, 4=d )");
		Scanner in = new Scanner(System.in);
		int select = in.nextInt(); //선택한 vertex
		int firstselect = select;
		
		
		
		int[][] V={{0,5,6,8},
				{5,0,7,10},
				{6,7,0,3},
				{8,10,3,0}};
		
		int [] marker={0,0,0,0};
		marker[select] = 1;
		
		
		printPath(firstselect);
		for(int j=1; j<4; j++){
			select = min(select, V, marker);
			
			}
		printPath(firstselect);
		
	}
	public static int min(int select, int [][] V, int[] marker){//최소값 판별하는 함수 
		
		int m = 9999;
		int vertex = 1;
		select--;
		
		for(int i=1; i<4; i++){
			if(V[select][i] != 0 && V[select][i] < m && marker[i]==0){
				m = V[select][i];
				vertex = i;
				marker[i]=1;
				}
			}
		
		printPath(vertex);
		return vertex;

	}
	
	public static void printPath(int vertex){//vertex 출력하는 함수 
		if(vertex==1){
			System.out.println(" a ");
		}
		else if(vertex==2){
			System.out.println(" b ");
		}
		else if(vertex==3){
			System.out.println(" c ");
		}
		else if (vertex==4){
			System.out.println(" d ");
		}
	}
	
}

//**********************************************************
//* function: 행렬 
//* description: 행렬을 만든 후 행의 원소끼리 최소값을 판별하여 저장한다. 
//* variables used
//* min : 최소값을 판별하는 함수, printPath : vertex 출력해주는 함수 
//**********************************************************
