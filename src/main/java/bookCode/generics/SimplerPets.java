package bookCode.generics;//: generics/SimplerPets.java

import net.mindview.util.*;
import bookCode.typeinfo.pets.*;

import java.util.List;
import java.util.Map;

public class SimplerPets {
  public static void main(String[] args) {
    Map<Person, List<? extends Pet>> petPeople = New.map();
    // Rest of the code is the same...
  }
} ///:~
