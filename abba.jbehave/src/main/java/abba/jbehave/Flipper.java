package abba.jbehave;

public class Flipper {
	int value;
	
	Flipper (){
		this.value = 1;
	}
	
	public void flipState(){
		value = 2;
	}
	
	public int getValue(){
		return value;
	}
	
	public void setValue(int numero){
		this.value =numero;
	}
	
	

}
