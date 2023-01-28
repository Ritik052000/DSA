package DSA;

public class Maximum_Difference_in_array {
	
   public static int MaxDifference(int arr[])
   {
	   int res=arr[1]-arr[0];
	   int min_val=Math.min(arr[0],arr[1]);
	   
	   int num=arr.length;
	   for(int i=1;i<num;i++)
	   {
		   res=Math.max(arr[i]-min_val,res);
		   min_val=Math.min(min_val,arr[i]);
	   }
	   return res;
   }

}
