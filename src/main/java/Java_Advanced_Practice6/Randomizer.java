package Java_Advanced_Practice6;

import java.util.Random;

@FunctionalInterface
public interface Randomizer {
    int random();

    default int random(int max){
        return (int) (Math.random()*max);
    }

    static boolean randomBoolean() {
        return new Random().nextBoolean();
    }

}
