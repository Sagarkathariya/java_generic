//write a program using generic to implement a single method to print different array of element and call them from main method.
//write a program to sort an array of item of type integer , float, double, and string using single sort method using generic.
public class phoneBook{
	public static <E>void printArray(E[] inputArray) {
		// TODO Auto-generated method stub
		for(E element: inputArray) {
			System.out.println(element+ " ");
		}
		System.out.println();
			
	}  
	public static void main(String[] args) {
		Integer[] ints= {1,2,3,4,5};
		Float[] floats= {1.2f,1.3f,1.4f,1.5f};
		String[] str= {"BCA","BBA","BE. Com","BE. Civil"};
		printArray(ints);
		printArray(floats);
		printArray(str);
	}

}
