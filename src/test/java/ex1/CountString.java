package ex1;

public class CountString {
    public int countStrings(String str) {
        String result = "";
        int count = 0;
        int input = str.length();
        for (int i = 0; i < input; i++) {
            if (Character.isUpperCase(str.charAt(i)))
                count++;

        }
        return count;
    }

    public String capitalizeInitials(String str) {
        boolean foundSpace = true;
        char[] input = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                if (foundSpace) {
                    input[i] = Character.toUpperCase(input[i]);
                    foundSpace = false;
                }

            } else
                foundSpace = true;
        }
        return String.valueOf(input);

    }

//    public String changeDotsInitial(String str) {
//        String result = "";
//        String[] input = str.split(".");
//        for (int i = 0; i < str.length(); i++) {
//            input[i].trim();
//            input[i].toLowerCase();
//            result += input[i].substring(0, 1).toUpperCase();
//            result += input[i].substring(1) + "";
//
//        }
//        return result;
//    }


}
