# number
import java.io.*;
import java.util.*;
public class number{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int k,l,m;
System.out.println("Enter the number");
k=sc.nextInt();
l=sc.nextInt();
m=sc.nextInt();
if(k>=l && k>=m)
{
System.out.println("Largest number is"+k);
}
if(l>=k && l>=m){
System.out.println("Largest number is"+l);
}
if(m>=k && m>=l){
System.out.println("Largest number is"+m);
}
