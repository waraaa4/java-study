package main;

public class Quiz4 {
	
	public static int ArrList(int[] num) {
		
        if (num.length < 3) {
            return -999;
        }
        
        int sum = 0;
        for (int n : num) {
            sum = sum + n;
        }
        return sum;
        
    }

	public static void main(String[] args) {
		
		int[] arr1 = new int[] {2, 4, 6, 8, 10};
	    int result1 = ArrList(arr1);
	    
	    int[] arr2 = new int[] {2, 4};
	    int result2 = ArrList(arr2);
	    System.out.println("첫번째 배열의 합계: " + result1);
	    System.out.println("두번째 배열의 합계: " + result2);
		
	}

}

