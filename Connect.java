//*********************************************************
//* Name: 김다은   
//* Student ID : 20135179
//* Program ID : HW #2
//* Description: 주어진 정점이 이어진 그래프가 몇 개인지를 알려주는 프로그램.
//* Algorithm : Connectivity algorithm --> 이어져있는 그래프를 파악하고, 파악된 정점을 지워가며 연결된 그래프의 갯수를 파악한다.   
//* Variables Used
//* C : count, V = 2차원 배열로 그래프 표현
//* select: 선택된 정점 ,  marker: 정점이 지워질 때마다 체크하는 1차원 배열 
//********************************************************** 

package ex;

import java.util.LinkedList;
import java.util.Queue;

public class Connect {

	public static void main(String[] args) {
		Queue que = new LinkedList();
		int C=0;//count
		int select = 1;//선택한 vertex
		int[][] V={{0,1,0,1,0,0,0,0,0,0},
				{1,0,1,0,0,0,0,0,0,0},
				{0,1,0,1,0,0,0,0,0,0},
				{1,0,1,0,0,0,0,0,0,0},
				{0,0,0,0,0,1,0,0,0,0},
				{0,0,0,0,1,0,1,0,0,0},
				{0,0,0,0,0,1,0,0,1,0},
				{0,0,0,0,0,0,0,0,1,0},
				{0,0,0,0,0,0,1,1,0,0},
				{0,0,0,0,0,0,0,0,0,0}};//그래프 표현. 
		
		int [] marker={0,0,0,0,0,0,0,0,0,0};
		
		for(int j=0;j<10;j++){
			for (int i=0;i<10;i++){
				if(V[select-1][i]==1 && marker[i]==0){
					que.add(i);
					C++;//이어져있는 그래프를 카운트한다. 
					}
				}
			select = (int) que.remove(); 
			marker[select-1] = 1;
			}
		System.out.println("Connectivity Number : "+select);
		
		
		
		}
	}

//**********************************************************
//* function: ENQUEUE
//* description: enqueue 의 사용목적은 정점이 연결되어 만드는 그래프의 갯수를 알기 위함이다.  
//* variables used
//* que.add : que를 이용하여 이어져있는 정점을 구분한다. 
//* aue.remove : que를 이용하여 이미 파악된 정점은 지운후 저장한다. 
//**********************************************************



