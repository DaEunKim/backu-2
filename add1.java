package ex;


import java.io.*;

public class  add1 {

	public static void main(String[] args) throws IOException {
		
		add1 a = new add1();
		
		int x;
//		x=a.Load();
//		a.Store(x);
		for(int i =0;i<1000;i++){
			x=a.Load();
			x=a.Add(i,1);
			a.Store(x);
			System.out.print(a.Add(i, 0)+" ");
			
		}
		System.out.println(" ");
		
	}
	public int Load() throws IOException{
		FileReader reader = new FileReader("/Users/kimdaeun/Documents/workspace/example/bin/ex/input.txt");
		int ch;
		
		while((ch=reader.read())!=reader.read()){
			System.out.print((char)ch);
		}
		reader.close();
		
		return 0;
		
	}
	public void Store(int data) throws IOException{
		FileWriter reader = new FileWriter("/Users/kimdaeun/Documents/workspace/example/bin/ex/input.txt");
		reader.write(0);
		reader.append(" ");
		reader.close();
		
	}
	public int Add(int i, int j){
		return i+j;
	}
	

}
