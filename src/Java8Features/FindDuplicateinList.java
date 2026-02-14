/*
 remove duplicates in list using java 8
 */

package Java8Features;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateinList {
    public static void main(String args[]) {

            List<Integer> list=Arrays.asList(10,23,23,23,44,11,44,23,10,12,67,90);

            List<Integer> unique = list.stream()
                                        .distinct()  // Remove duplicates
                                        .collect(Collectors.toList());


            System.out.println("unique number is:" + unique);
        }
    }


