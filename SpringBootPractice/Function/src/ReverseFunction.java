public class ReverseFunction {

	public static void main(String[] args) {
		String str = "This is an awesome opportunity and I want this job";
        reverseString(str);
	}

	private static void reverseString(String str) {
		String splitArray[]=str.split(" ");
		
		for(int i=splitArray.length-1; i>=0;i--) {
			System.out.print(splitArray[i]+" ");			
		}		
	}

}
