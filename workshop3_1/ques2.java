package workshop3_1;

public class ques2 {

	public static void main(String[] args) {
		 float[] numbers = {10.5f, 20.0f, 30.5f, 40.0f, 50.5f};

	        float sum = 0;

	        
	        for (int i = 0; i < numbers.length; i++) {
	            sum += numbers[i];
	        }

	        
	        float average = sum / numbers.length;

	        
	        System.out.println("Sum = " + sum);
	        System.out.println("Average = " + average);

	}

}
