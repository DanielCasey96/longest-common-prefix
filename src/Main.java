import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.longestCommonPrefix(new String[]{"cir","car"});
    }

    public String longestCommonPrefix(String[] strs) {

        int i = 0;
        int j;
        String word1;
        String word2;
        String word3;
        String placeholder = "";

        String shortest = strs[0];
        for(j = 0; j<strs.length; j++) {
            if(strs[j].length()<shortest.length()) {
                shortest = strs[j];
            }
        }

        if(strs.length == 1) {
            word1 = strs[i];
            for (i = 0; i < shortest.length(); i++) {
                placeholder += String.valueOf(word1.charAt(i));
                System.out.println(placeholder);
            }
        } else if(strs.length == 2) {
            word1 = strs[i];
            word2 = strs[i+1];

            for (i = 0; i < shortest.length(); i++) {

                if(word1.charAt(i) == word2.charAt(i)) {
                    placeholder += String.valueOf(word1.charAt(i));
                } else break;
            }
        } else if(strs.length == 3) {
            word1 = strs[i];
            word2 = strs[i+1];
            word3 = strs[i+2];

            for (i = 0; i < shortest.length(); i++) {

                if(word1.charAt(i) == word2.charAt(i) && word1.charAt(i) == word3.charAt(i)) {
                    placeholder += String.valueOf(word1.charAt(i));
                } else break;
            }
        }
        System.out.println(placeholder);
        return placeholder;
    }
}


//class Solution {
//    public String longestCommonPrefix(String[] strs) {
//
//        int i = 0;
//        String word1 = strs[i];
//        String word2 = strs[i+1];
//        String word3 = strs[i+2];
//
//        String placeholder = "";
//        for (i = 0; i < strs.length; i++) {
//
//            if(word1.charAt(i) == word2.charAt(i) && word1.charAt(i) == word3.charAt(i)) {
//                placeholder += String.valueOf(word1.charAt(i));
//                System.out.println(placeholder);
//            } else break;
//        }
//        return placeholder;
//    }
//}