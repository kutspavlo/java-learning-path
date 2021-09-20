package Java_Advanced_Practice2;

import java.util.Collection;

public class  Test {
      public static class Generic {
          public static void eatTest(Collection<? extends Creature> collection) {
              for (Creature c : collection) {
                  c.eat();
              }
          }
      }
}
