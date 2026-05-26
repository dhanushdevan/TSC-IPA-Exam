import java.util.*;
public class Rearrange{
public static void main(String[] args){

int[] arr={2,-4,6,-8,-5,7};

List<Integer> po=new ArrayList<>();
List<Integer> ne=new ArrayList<>();

for(int num:arr){
if(num>=0){
po.add(num);
}else{
ne.add(num);
}
}

int k=0,j=0,i=0;
while(po.size()>j && ne.size()>i){
arr[k++]=po.get(i++);
arr[k++]=ne.get(j++);
}

while(po.size()>j){
arr[k++]=po.get(j++);
}

while(ne.size()>j){
arr[k++]=ne.get(i++);
}

System.out.println(Arrays.toString(arr));
}
}