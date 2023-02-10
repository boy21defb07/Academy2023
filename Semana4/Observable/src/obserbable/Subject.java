package obserbable;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

List<Observable> listaObservers = new ArrayList<>();
	
	void attach(Observable o) {
		listaObservers.add(o);
	}

	void detach(Observable o) {
		listaObservers.remove(o);
	}

	void notificar() {
		for(Observable o:listaObservers)
			o.update();
	}
}
