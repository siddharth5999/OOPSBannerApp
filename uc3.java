public class OopsBanner {

    public static void main(String[] args) {
        printOOPS();
    }

    private static void printOOPS() {
        System.out.println(line1());
        System.out.println(line2());
        System.out.println(line3());
        System.out.println(line4());
        System.out.println(line5());
        System.out.println(line6());
        System.out.println(line7());
        System.out.println(line8());
    }

    private static String line1() {
        return String.join("   ",
                "  ***  ",
                "  ***  ",
                "******",
                " *****");
    }

    private static String line2() {
        return String.join("   ",
                " **  **",
                " ** ** ",
                "**   **",
                "**   **");
    }

    private static String line3() {
        return String.join("   ",
                " **  **",
                " ** ** ",
                "**   **",
                "      ");
    }

    private static String line4() {
        return String.join("   ",
                " **  **",
                " ** ** ",
                "******",
                " **** ");
    }

    private static String line5() {
        return String.join("   ",
                " **  **",
                " ** ** ",
                "**     ",
                "     **");
    }

    private static String line6() {
        return String.join("   ",
                " **  **",
                " ** ** ",
                "**     ",
                "      **");
    }

    private static String line7() {
        return String.join("   ",
                " **  **",
                " ** ** ",
                "**     ",
                "      **");
    }

    private static String line8() {
        return String.join("   ",
                "  ***  ",
                "  ***  ",
                "**     ",
                " *****");
    }
}