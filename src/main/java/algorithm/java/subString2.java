package algorithm.java;

public class subString2 {

    public String solution(String[] strs) {

        if (strs.length == 0)
            return "";

        String firstStr = strs[0];

        for (int i =1; i< strs.length; i++) {

            while (strs[i].indexOf(firstStr) != 0) {
                firstStr = firstStr.substring(0, firstStr.length() - 1);
            }

        }

        return firstStr;

    }

    public static void main(String[] args) {

        String str[] = {"test", "teacher"};
        System.out.println(new subString2().solution(str));

    }


}
