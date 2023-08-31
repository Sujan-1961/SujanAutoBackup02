package week6.day1.assignment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumbers {
                      public static void main(String[] args) {
						int[] num = {3,4,6,7,8,9,6,1};
						
						Arrays.sort(num);
						
						Set<Integer> no = new HashSet <Integer>();
						for (int i = 0; i < num.length; i++) {
							no.add(num[i]);
						}
						System.out.println(no);
						for (int j = 1; j < num.length; j++) {
							if (!no.contains(j)) {
								System.out.println(j);
								break;
							}
						}
					}
}
