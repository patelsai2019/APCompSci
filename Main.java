public class Main {

    public static void main(String[] args) {
        String[] testSuite = {"Palindrome", "Civic", "Radar", "Level", "Eva, can I stab bats in a cave?", "A man, a plan, a canal, Panama", "Mr. Owl ate my metal worm", "Never odd or even", "Doc, Note: I Dissent. A fast never prevents a fatness. I diet on cod."};
        for (int i = 0; i < testSuite.length; i++) {
            boolean check = tester(testSuite[i]);
            if (check) System.out.printf("\n\"%s\" is a valid palindrome.", testSuite[i]);
            else System.out.printf("\n\"%s\" is not a valid palindrome.", testSuite[i]);
            System.out.println();
        }
    }
    public static boolean tester(String palin) {
        palin = removal(palin);
        String lap = "";
        int len = palin.length() - 1;
        for (int i = 0; i < palin.length(); i++) {
            lap += palin.charAt(len - i);
        }
        return palin.equalsIgnoreCase(lap);
    }
    public static String removal(String palin) {
        String newPalin = "";
        for (int i = 0; i < palin.length(); i++) {
            if ((palin.charAt(i) == ' ') || (palin.charAt(i) == '.') ||(palin.charAt(i) == ',') || (palin.charAt(i) == '?') || (palin.charAt(i) == '!') || (palin.charAt(i) == ':') || (palin.charAt(i) == ';')) {
                newPalin = newPalin;
            }
            else newPalin += palin.charAt(i);
        }
        return newPalin;
    }
}
