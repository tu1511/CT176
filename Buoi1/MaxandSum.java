package buoi1;

public class MaxandSum {

	public static void main(String[] args) {
		double sum = 0, d, max = Double.MIN_VALUE;
		for(String str: args){
			try {
				d = Double.parseDouble(str);
			} catch (NumberFormatException e) {
				d = 0;
			}
			if(d>max)
				max = d;
			sum += d;
		}
		System.out.println("Sum: "+sum+"\nMax: "+max);
	}

}
