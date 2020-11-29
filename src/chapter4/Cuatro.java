package chapter4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Cuatro {

    public static void main(String[] args) {
        String[] os = new String[]{"Windows","Mac", "Linux"};
        Arrays.sort(os);
        System.out.println("MAC: " + Arrays.binarySearch(os, "Mac"));
        System.out.println("O: " + Arrays.binarySearch(os,os[0]));
    }
}
