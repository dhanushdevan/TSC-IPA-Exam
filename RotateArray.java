import java.util.*;
public class RotateArray{

public static void main(String[] args){

int[] arr= {1,2,3,4,6,7};
int k=3;
reverse(0,arr.length-1,arr);
reverse(0,k-1,arr);
reverse(k,arr.length-1,arr);
System.out.println(Arrays.toString(arr));
}
public static void reverse(int l,int r,int[] arr){

while(l<r){
int temp=arr[l];
arr[l]=arr[r];
arr[r]=temp;
l++;
r--;
}
}
}