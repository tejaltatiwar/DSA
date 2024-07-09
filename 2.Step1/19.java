// Designer PDF Viewer
// When a contiguous block of text is selected in a PDF viewer, the selection is highlighted with a blue rectangle. In this PDF viewer, each word is highlighted independently. For example:

// PDF-highighting.png

// There is a list of  character heights aligned by index to their letters. For example, 'a' is at index  and 'z' is at index . There will also be a string. Using the letter heights given, determine the area of the rectangle highlight in  assuming all letters are  wide.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class MyClass {
    public static void main(String args[]) {
      
      
      Scanner sc = new Scanner(System.in);
      int arr[]=new int[26];
      for(int i=0;i<26;i++){
          arr[i]=sc.nextInt();
      }
      String word=sc.next();
      
      int heightWord=0;
      for(int i=0;i<word.length();i++){
          int hightChar=arr[word.charAt(i)-'a'];
          if(hightChar>heightWord){
              heightWord=hightChar;
          }
      }
      System.out.print(heightWord*word.length());
    }
}
