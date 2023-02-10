package obserbable;

public class Subscritor3 extends Observable {
	
	Subscritor3(Subject sb){
		super(sb);
	}

	@Override
	void update() {
		// TODO Auto-generated method stub
		entregar();
		}
	
	void entregar(){
		System.out.println("recibio revista semanal Subscritor 3");
	}
}
