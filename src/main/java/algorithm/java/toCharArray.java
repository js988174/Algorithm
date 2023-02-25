package algorithm.java;

public class toCharArray {

    public String solution(String str) {

        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.StringBuilder result = new java.lang.StringBuilder();
        int openBrace = 0;

        for (char c : str.toCharArray()) {
            if (c == '(') {
                openBrace++;
            } else if (c == ')') {
                if (openBrace == 0);
                openBrace--;
            }
            sb.append(c);
        }

        for (int i = sb.length() -1; i >= 0; i--) {
            if (sb.charAt(i) == '(' && openBrace-- > 0) continue;
            result.append(sb.charAt(i));
        }
        return result.reverse().toString();

    }

    public static void main(String[] args) {

        String s = "(a(b(c)d";
        System.out.println("result: " + new toCharArray().solution(s));

    }
}
