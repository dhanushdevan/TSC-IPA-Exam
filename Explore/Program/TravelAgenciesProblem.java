import java.util.*;



public class TravelAgenciesProblem{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
List<TravelAgencies> listTravelAgencies= new ArrayList<>();
for(int i=0;i<4;i++){
int a=sc.nextInt(); 
sc.nextLine();
String b=sc.nextLine();
String c=sc.nextLine();
int d=sc.nextInt();  
sc.nextLine();
Boolean e=sc.nextBoolean();
listTravelAgencies.add(new TravelAgencies(a,b,c,d,e));
}
int regNo=sc.nextInt();
sc.nextLine();
String agencyName=sc.nextLine();
findAgencyWithHighestPackagePrice(listTravelAgencies);
agencyDetailsForGivenldAndType(regNo,agencyName,listTravelAgencies);
}
public static void findAgencyWithHighestPackagePrice(List<TravelAgencies> listTravelAgencies){
int max=0;
for(TravelAgencies t:listTravelAgencies){
if(t.getPrice()>max){
max=t.getPrice();
}
}
System.out.println(max);
}

public static void agencyDetailsForGivenldAndType( int regNo ,String packageType,List<TravelAgencies> listTravelAgencies2 ){
String name=null;
int number=0;
for(TravelAgencies t:listTravelAgencies2){
if(t.getFlightFacility().equals(true)){
if(t.getRegNo()==regNo && t.getPackageType().equals(packageType)){
name=t.getAgencyName();
number=t.getPrice();
}
}
}
System.out.println(name +" : "+number);
}
}