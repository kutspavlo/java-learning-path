package Java_Basic_Practice4;

import java.io.Console;
import java.util.Comparator;

public enum Color implements Printable {
    RED ((short)300, (short) -20, (short) -20),
    GREEN ((short)0, (short) 255, (short) 0),
    BLUE ((short)0, (short) 0, (short) 255),
    WHITE ((short)255, (short) 255, (short) 255),
    BLACK ((short)0, (short) 0, (short) 0),
    ORANGE ((short)255, (short) 165, (short) 0);

    private Short red;
    private Short green;
    private Short blue;

     Color(Short red, Short green, Short blue) {
         if (red > 255){
             this.red = 255;
         } else if (red < 0) {
             this.red = 0;
         } else this.red = red;

         if (blue > 255){
             this.blue = 255;
         } else if (blue < 0) {
             this.blue = 0;
         } else this.blue = blue;

         if (green > 255){
             this.green = 255;
         } else if (green < 0) {
             this.green = 0;
         } else this.green = green;
    }

    public Short getBlue() {
        return blue;
    }

    public Short getGreen() {
        return green;
    }

    public Short getRed() {
        return red;
    }

    public void getColorSpec(){
        switch (this) {
            case GREEN: case BLUE: case BLACK: case WHITE:
                System.out.println(String.format("%s is cold color", this));
                break;

            case RED: case ORANGE:
                System.out.println(String.format("%s is warm color", this));
                break;
        }
    }

//    @Override
//    public String toString() {
//        return String.format("RGB: %s, %s, %s", this.getRed(), this.getGreen(), this.getBlue());
//    }


    @Override
    public void print() {
         String color = this.toString();
         System.out.print(ConsoleColor.valueOf(color));
         System.out.println(color);
         System.out.print(ConsoleColor.RESET);
         System.out.println();
    }
}
