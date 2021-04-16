import java.util.*;

public class GFG{

	public static void reverse(int[] num, int start, int end){
		int temp;
		while(end>start){
			temp = num[start] ;
			num[start] = num[end];
			num[end] = temp;
			start++;
			end--;
      
      // if(start>=end){
			// 	return;
			// }
			// temp = num[start];
			// num[start] = num[end];
			// num[end] = temp;
			// reverse(num, start +1, end+1); 
		}
			
		
	}

	public static void print(int[] num){
		for(int i = 0; i<= num.length-1; i++){
			System.out.println(num[i]);
		}
	}
	public static void main(String[] args) {

		int[] array = {2,3,4,5};
		System.out.println("Print array");
		print(array);
		System.out.println("Printing reverse");
		reverse(array, 0, array.length-1);
		print(array);
		
	}
}
