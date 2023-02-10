package obserbable;

public class Subscritor2 extends Observable {

	
	Subscritor2(Subject sb){
		super(sb);
	}
	
	
	@Override
	void update() {
		// TODO Auto-generated method stub
		entregar();
		}
	
	void entregar(){
		System.out.println("recibio revista semanal Subscritor 2");
	}

}
