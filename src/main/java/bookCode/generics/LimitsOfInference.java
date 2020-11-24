package bookCode.generics;//: generics/LimitsOfInference.java

import java.bookCode.typeinfo.pets.*;
import java.util.List;
import java.util.Map;

public class LimitsOfInference {
  static void
  f(Map<Person, List<? extends Pet>> petPeople) {}
  public static void main(String[] args) {
    // f(New.map()); // Does not compile
  }
} ///:~
