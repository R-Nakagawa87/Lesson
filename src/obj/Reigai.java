package obj;

import java.io.FileWriter;
import java.io.IOException;

public class Reigai {

	public static void main(String[] args) {

		sub();

//		try {
//			int num = 3/0;
//		}catch(ArithmeticException e){
//			System.out.println("エラーです");
//		}
//
//
//		try(FileWriter fw = new FileWriter("data.txt");) {
//			fw.write("Hello,World!");
//			System.out.println("正常に動作終了しました");
//		}catch(IOException e){
//			System.out.println("エラーです");
//		}
	}


	public static void sub() {

		try {
			subsub();
		}catch(Exception e) {
			System.out.println("Error");
		}
	}


	public static void subsub() throws IOException{

		int num = 3/0;
		FileWriter fw = new FileWriter("data.txt");

	}

}
