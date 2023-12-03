package trial.genericTrial.tester;

public class genericTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HolderNonGeneric intHolder = new HolderNonGeneric(12345);//1
		HolderNonGeneric stringHolder = new HolderNonGeneric("12345");//2
		int data = (int)intHolder.getRef();//3
		System.out.println(intHolder.getRef().getClass());
		System.out.println(stringHolder.getRef().getClass());
		String s = (String)stringHolder.getRef();//4
		intHolder=stringHolder;//5
		data = (int)intHolder.getRef();//6
	}
}
