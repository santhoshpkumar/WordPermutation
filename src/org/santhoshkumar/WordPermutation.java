package org.santhoshkumar;
import java.util.*;

public class WordPermutation {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        String input  = sc.nextLine();
        char[] characters = input.toCharArray();
        WordPermutation wp = new WordPermutation();
        wp.printAllPermutations(characters, 0, input.length());
    }

    public void printAllPermutations(char[] characters, int start, int end){
        if(start == end){
            for (char character: characters ){
                System.out.print(character);
            }
            System.out.println();
        }else{
            for(int i = start; i < end; i++){
                swap(characters, start, i);
                printAllPermutations(characters, start+1, end);
                swap(characters, start, i);
            }
        }
    }

    public void swap(char[] characters, int from, int to){
        char temp = characters[from];
        characters[from] = characters [to];
        characters[to] = temp;
    }
}
