package obserbable;

public class Subscritor1 extends Observable {
	

	
	Subscritor1(Subject sb){
		super(sb);
	}
	

	@Override
	void update() {
		// TODO Auto-generated method stub
		entregar();
		}
	
	void entregar(){
		System.out.println("recibio revista semanal Subscritor 1");
	}
}
