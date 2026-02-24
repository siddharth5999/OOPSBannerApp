import java.util.HashMap;

public class uc7 {
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[] {
            "  ***  ",
            " **  **",
            " **  **",
            " **  **",
            " **  **",
            " **  **",
            "  ***  "
        });

        charMap.put('P', new String[] {
            "****** ",
            "**   **",
            "**   **",
            "****** ",
            "**     ",
            "**     ",
            "**     "
        });

        charMap.put('S', new String[] {
            " *****",
            "**    ",
            "**    ",
            " **** ",
            "     **",
            "     **",
            " *****"
        });

        charMap.put(' ', new String[] {
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       ",
            "       "
        });

        return charMap;
    }

    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int patternHeight = charMap.get('O').length;

        for (int row = 0; row < patternHeight; row++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.get(ch);
                sb.append(pattern[row]).append("   ");
            }

            System.out.println(sb);
        }
    }

    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();
        displayBanner("OOPS", charMap);
    }
}