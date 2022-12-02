package arrayprogram;

public class OddEvenNumbers{  
	
public static void main(String args[]){  
int a[]={3,8,13,7,16,5}; 

System.out.println("Odd Numbers:");  
for(int i=0;i<a.length;i++){  
	
if(a[i]%2!=0){  
System.out.println(a[i]);  
} 

}  
System.out.println("Even Numbers:");  
for(int i=0;i<a.length;i++){  
if(a[i]%2==0){  
	
System.out.println(a[i]);  
} 

}  

}
} 