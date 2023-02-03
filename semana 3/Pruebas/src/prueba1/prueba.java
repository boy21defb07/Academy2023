package prueba1;

public class prueba {

	 public static int Min(int[] list) {
		    int min = list[0];
		    for (int number : list) {
		      if (number < min) {
		        min = number;
		      }
		    }
		    return min;
		  }
		  
		  public static int max(int[] list) {
		    int max = list[0];
		    for (int number : list) {
		      if (number > max) {
		        max = number;
		      }
		    }
		    return max;
		  }
	
}
