package ch11;

public class C02MainArg {

	public static void main(String[] args) {
//		String args1[] = new String [5];
//		파일을 우클릭하여 run as를 누른후 run configuration의 argument에서 글자를 추가했다
		System.out.println("배열 길이 : " + args.length);
		for (String s: args) {
			System.out.println(s);
		}
			
	}

}
