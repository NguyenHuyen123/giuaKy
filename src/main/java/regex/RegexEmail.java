package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmail {
    public static void main(String[] args) {
        String regex = "[\\w\\.]+@([\\w]+\\.)+[\\w]{2,4}";
        String input = "abc@gmail.com, abc.123@gmail.com, abc_123@gmail.com.com, abc_1_1@gmail.com.vn";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        boolean matchFound = m.find();
        while (matchFound) {
            String date = input.substring(m.start(), m.end());
            System.out.println(date);
            matchFound = m.find();
        }
    }
}
