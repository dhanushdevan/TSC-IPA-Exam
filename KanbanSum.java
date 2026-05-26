public class KanbanSum{

public static void main(String[] args){

 int[] arr ={-2,1,-3,4,-1,2,1,-5,4};

int max=arr[0];
int cur=0;
for(int num:arr){
cur+=num;

if(cur>max){
max=cur;
}
if(cur<0){
cur=0;
}

}
System.out.print("Max sum"+max);
}

}