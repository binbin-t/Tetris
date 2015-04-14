
// just a simple utility class to find a minimum position on a list

public class PSOUtility {
	public static int getMinPos(double[] list) {
		int pos = 0;
		double maxValue = list[0];
		
		for(int i=0; i<list.length; i++) {
			if(list[i] > maxValue) {
				pos = i;
				maxValue = list[i];
			}
		}
		
		return pos;
	}
}
