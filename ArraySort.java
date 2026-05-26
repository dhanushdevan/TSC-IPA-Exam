import java.util.*;
public class ArraySort{

public static void main(String[] args){

int [] arr={1,3,0,8,9,0,0};
int index=0;
for(int num:arr){
if(num!=0){
arr[index]=num;
index++;
}
}
while(index<arr.length){
arr[index]=0;
index++;
}
System.out.println("Array"+Arrays.toString(arr));
}

}