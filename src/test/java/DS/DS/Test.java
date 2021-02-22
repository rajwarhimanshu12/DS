package DS.DS;

import java.util.HashMap;
import java.util.Map;

public class Test {

static String mystring ="My name is Himanshu";
static StringBuffer result = new StringBuffer();

public static String reverse(String s){
    String rev= "";
         for(int i=s.length()-1;i>=0;i--){
         rev = rev + s.charAt(i);
         }
    return rev;
}

public static void main(String args[]) {
String arr[] = mystring.split(" ");

	for(int i = 0 ; i < arr.length; i++){
             String word = arr[i];
             result = result.append(reverse(word));
             if(!(i==arr.length-1))
             result = result.append(" ");    
        }
       System.out.println(result);
       }

}

