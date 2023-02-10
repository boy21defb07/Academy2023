package obserbable;



abstract class Observable {
	
	Subject sb;
	
	 Observable(Subject sb){
		this.sb = sb;
		sb.attach(this);
	}
	
	abstract void update();
}


