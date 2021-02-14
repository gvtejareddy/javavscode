package interview.Collections;


public class EnumSet {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
      } public static void main(String[] args) {  

          System.out.println(Level.HIGH);

          for (Level myVar : Level.values()) {
            System.out.println(myVar);
          }
      }

    
}
