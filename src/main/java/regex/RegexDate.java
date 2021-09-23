package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDate {
    public static void main(String[] args) {
        String regex = "\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}";
        String input = "Hello java regex 2-12-2018, hello world 12/12/2018, abc 1-01.2021, abe 12/02/2021";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        //System.out.println("Ngày tháng trong chuỗi : " + input);

        boolean matchFound = m.find();
        while (matchFound) {
            String date= input.substring(m.start(), m.end());
            System.out.println(date);
            matchFound=m.find();
        }
    }
}
