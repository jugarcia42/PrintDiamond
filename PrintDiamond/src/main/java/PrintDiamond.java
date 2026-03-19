public class PrintDiamond {
    public String makeDiamond(char max){
        String result = "";

        for (char c = 'A'; c <= max; c++){
            result += makeLine(c, max) + "\n";
        }
        for (char c = (char)(max - 1); c >= 'A'; c--) {
            result += makeLine(c, max) + "\n";
        }
        return result;
    }
    public String makeLine(char letter, char max) {
        int outerSpaces = max - letter;
        int innerSpaces = letter - 'A';
        String line = repeat("*", outerSpaces);
        line += letter;
        if (letter != 'A') {
            line += repeat("*", innerSpaces * 2 - 1);
            line += letter;
        }
        return line;
    }
    private String repeat(String s, int n) {
        return s.repeat(n);
    }
}

