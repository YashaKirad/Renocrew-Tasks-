import java.util.Scanner;
public class PS3 {
    public static void main(String [] args)

    {
        //Q1. String to Lowercase
        String name = "YashsHrEe";
        name=name.toLowerCase();
        System.out.println(name);

        //Q2. Replace space by _
        String st ="Yashshree hello good morning";
        st=st.replace(" ", "_");
        System.out.println(st);

        //Q3. Letter Template
        String letter = "Dear <|name|>, thanks a lot.";
        letter = letter.replace("<|name|>", "Yashshree");
        System.out.println(letter);

        //Q4. Detect double and triple space in string
        String st2= "This is a   program for detecting double and triple space in string";
        System.out.println(st2.indexOf("  "));
        System.out.println(st2.indexOf("   "));


        //Q5. Format using escape sequence charecters
        String l= "Dear Harry, \n\t This Java course is Nice. \n\t Thanks";
        System.out.println(l);



    }
    
}
 