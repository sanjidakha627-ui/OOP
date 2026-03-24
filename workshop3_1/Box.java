package workshop3_1;

public class Box {
	// 9 Box Class (Constructor Overloading)

	
	    int width, height, depth;

	    // Cube constructor (one parameter)
	    Box(int length) {
	        width = height = depth = length;
	    }

	    // Cuboid constructor (3 parameters)
	    Box(int w, int h, int d) {
	        width = w;
	        height = h;
	        depth = d;
	    }

	    // No-argument constructor
	    Box() {
	        width = 10;
	        height = 8;
	        depth = 12;
	    }

	    // Method to calculate volume
	    void getVolume() {
	        int volume = width * height * depth;
	        System.out.println("Volume: " + volume);
	    }
	

}
