package Java_Basic_Practice4;

public enum ConsoleColor {
    //Color end string, color reset
    RESET("\033[0m"),

    // Regular Colors. Normal color, no bold, background color etc.
    BLACK("\033[0;30m"),    // BLACK
    RED("\033[0;31m"),      // RED
    GREEN("\033[0;32m"),    // GREEN
    ORANGE("\033[0;33m"),   // YELLOW
    BLUE("\033[0;34m"),     // BLUE
    WHITE("\033[0;37m");    // WHITE

    private final String code;

    ConsoleColor(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }

}
