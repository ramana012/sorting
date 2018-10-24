
package sorting;

public class BubbleSort{
	public static void main(String arge[]){
		int array[]={15,4,8,63,45,0,5,6,8,100};
		int arrLength=array.length-1;
		boolean isSorted=false; 
		while(!isSorted){
			isSorted=true;
			for(int i=0;i<arrLength;i++ ){
				if(array[i]>array[i+1])
				{
				/**	sort by useing method calling  */ 
					//swap(array,i,i+1);
					
					int temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
					
					isSorted=false;
				}
			}
			arrLength--;
		}
		for(int element:array){
		System.out.print(element+" ");
		}
		
	}
		public static void swap(int arr[],int i,int j){
		
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
	
}