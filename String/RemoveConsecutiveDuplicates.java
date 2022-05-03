package String;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {

    public static String removeConsecutiveDuplicates(String str){
        String x="";
        int n = str.length();
        
        for(int i = 1; i < n; i++){
            if(i < n - 1 && str.charAt(i) == str.charAt(i + 1)){
               continue;
            }
             else{
                x = str.charAt(i) + x;
             }
        }
        return x;
		/*x=x+str.charAt(0);
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)!=x.charAt(x.length()-1)) {
				x=x+str.charAt(i);
			}
		}
		return x;*/
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String str = removeConsecutiveDuplicates(st);
        System.out.println(str);
        sc.close();
    }
}
