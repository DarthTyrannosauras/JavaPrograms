package trial.genericTrial.tester;

public class HolderGeneric <T>{
	private T ref;
	
	public HolderGeneric(T obj){
		this.ref=obj;
	}
	
	public T getRef() {
		return this.ref;
	}
}
