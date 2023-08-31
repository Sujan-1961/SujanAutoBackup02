package week6.day1.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
                  public static void main(String[] args) {
                	  String[] name= {"Hcl","WIPRO","Aspire Systems","CTS"};
                		int len=name.length;
                		List<String> name02=new ArrayList<String>();
                		//Set<String> name03=new LinkedHashSet<String>();
                		for(int i=len-1;i>=0;i--) {
                			name02.add(name[i]);
                		}
                		Collections.sort(name02);
                		Collections.reverse(name02);
                		System.out.println(name02);
				}
}
