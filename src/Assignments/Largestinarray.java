package Assignments;
public class Largestinarray {

	public static void main(String[] args) {
		int arr[]= {10,20,22,11,44};
		int temp =arr[ 0];
		for(int i=0;i<arr.length;i++) {
			if(temp<arr[i]) {
				temp=arr[i];
				
			}
			
		}
		System.out.println(temp);
		
	}

}
