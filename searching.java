//linear search and binary search
public class coding{
	public static int binarySearch(int numbers[],int x){
		int low=0;
		int high=numbers.length-1;
		//int mid=(low+high)/2;

		while(low<=high){
			int mid=(low+high)/2;
			if(numbers[mid]==x){
				return mid;
			}else if(x>numbers[mid]){
				low=mid+1;
			}else{
				high=mid-1;
			}
		}
		return -1;
	}

	public static int linearSearch(int numbers[],int x){
		int n=numbers.length;

		for(int i=0;i<n;i++){
			if(numbers[i]==x){
				return i+1;
			}
		}
		return -1;
	}
	public static void main(String[] Args){
		int[] numbers={1,2,3,4,5};
		int x=4;
		int mid=0;

		int result=binarySearch(numbers,x);

		if(mid==-1){
			System.out.println("number not present");
		}else{
			System.out.println("number present at index:"+result);
		}
	}
}
