
/**
 * Write a description of findgene here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.lang.String;
public class findgene {
public static String findSimplegene(String s){
String gene;
int findex=s.indexOf("ATG");
int sindex=s.indexOf("TAA",findex+3);
gene=s.substring(findex,sindex+3);
    return gene;
}
public static boolean testSimplegene(String gene){
    int length=gene.length()-3;
    if(length%3==0)
    {
        return true;
    }else return false;
    }
    public static void main(String[] args){
System.out.print("Enter the string:");
Scanner input=new Scanner(System.in);
String s=input.next();
String gene=findSimplegene(s);
if(testSimplegene(gene)){
System.out.println("The gene is : " + gene);
}else
System.out.println("No gene is present");
}
}
