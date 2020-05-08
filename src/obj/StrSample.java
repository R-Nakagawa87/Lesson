package obj;

public class StrSample {

	public static void main(String[] args) {

		String s1 = "This is Java";
		String s2 = "java";


		if(s1.equals(s2)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}


		//文字列の、文字の大小を無視した比較
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}


		//文字列は空か？
		if(s1.isEmpty()) {
			System.out.println("s1 is Empty");
		}else {
			System.out.println("s1 is not Empty");
		}


		//文字列に"Java"は含まれているか？
		if(s1.contains("Java")) {
			System.out.println("Yes, Java");
		}else {
			System.out.println("No, Java");
		}


		//文字列は"Java"で終わるか？
		if(s1.endsWith("Java")) {
			System.out.println("End Java");
		}else {
			System.out.println("Not End Java");
		}


		//文字列は"Java"からはじまるか？
		if(s1.startsWith("Java")) {
			System.out.println("Start Java");
		}else {
			System.out.println("Not Start Java");
		}


		System.out.println(s1.indexOf("Java"));	//”Java”が出てくる文字は何番目？
		System.out.println(s1.indexOf("is"));
		System.out.println(s1.lastIndexOf("is"));	//”is”が出てくる文字は後ろから何番目？


		System.out.println(s1.substring(4));	//4文字目以降を表示
		System.out.println(s1.substring(0, 4));	//"This is Java"の"this"のみを抜き出す

		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.replace("Java", "C++"));


		StringBuilder sb1 = new StringBuilder();

		sb1.append("abc");
		sb1.append("def");
		sb1.append("ghi");

		String s3 = sb1.toString();

		System.out.println(s3);
	}

}
