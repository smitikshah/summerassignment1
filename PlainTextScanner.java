
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

//This is my solution to the letter frequency analyzer problem. I have some issues having it print to an array, but at least this is the basic solution.

class PlainTextScanner{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("stuff.txt"));
        String inputString = input.nextLine();
        String inputCharactersOnly = inputString.replaceAll("[^a-zA-Z\\s]", "").toLowerCase();
        String lineWithoutSpaces = inputCharactersOnly.replaceAll("\\s+","");
        char[] s = lineWithoutSpaces.toCharArray (); 
        double stringSize = s.length;//This is what I have to use to find the percentages
        int i=0;
        int r = 0;
        int counter = 0;
        for(i=0;i<stringSize;i++){
            counter = 0; //Without this line, the counter doesn't rest for every time a new character is used.
            for(r=0;r<stringSize;r++){
                if(r<i && s[i] == s[r]){
                    break; //this is so that both pointers in the array don't point to several instances of a character. without this the character counts show up several times.
                }
                if (s[i] == s[r]){
                    counter++;}
                if (r == stringSize-1){
                   DecimalFormat df2 = new DecimalFormat("###.##");
                   double percent = ((counter*100)/stringSize);
                   System.out.println(s[i]+" is present "+(df2.format(percent))+ "% " + "of the time");
                }     
        }//r loop ends
    }//main first loop ends  
    } }
