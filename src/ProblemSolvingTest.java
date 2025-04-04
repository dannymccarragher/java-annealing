import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class ProblemSolvingTest {
  @Test
  void testAllStartWithA_trueMixedCase() {
    // arrange
    Set<String> input = Set.of("armadillo", "Arcanine", "asbestos", "ABBA");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    //assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_falseOneElement() {
    // arrange
    Set<String> input = Set.of("armadillo", "utopia", "Arcanine");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testAllStartWithA_firstElementFalse(){
    Set<String> input = Set.of("Salamander", "Arcanine");

    boolean actual = ProblemSolving.allStartWithA(input);

    assertFalse(actual);
  }

  @Test
  void testAllStartWithA_lastElementFalse(){
    Set<String> input = Set.of("Cow", "Salamander");

    boolean result = ProblemSolving.allStartWithA(input);

    assertFalse(result);
  }

  // TODO:
  // Come up with more tests to thoroughly test testAllStartWithA
  // Suggestions:
  //  - test an empty set
  @Test 
  void testAllStartWithAEmptySet() {
    Set<String> input = new HashSet<>();
    boolean actual = ProblemSolving.allStartWithA(input);

    //if set is empty return true
    assertTrue(actual);
  }
  //  - test a set where none start with A

  @Test
  void testNoneStartWithA() {
    Set<String> input = Set.of("Lion", "Salamander", "Zebra");

    boolean result = ProblemSolving.allStartWithA(input);

    assertFalse(result);
  }

  //  - test a set with only a single element
  @Test
  void OneStartsWithA() {
    Set<String> input = Set.of("Armadillo");

    boolean result = ProblemSolving.allStartWithA(input);

    assertTrue(result);
  }
  //  - more you can think of!

  void SingleCharStartsWithA() {
    Set<String> input = Set.of("a");

    boolean result = ProblemSolving.allStartWithA(input);

    assertTrue(result);
  }

//  hasEmptyString test cases

  @Test
  void testHasEmptyString_falseAllNonEmpty() {
    // arrange
    Set<String> input = Set.of("armadillo", "Arcanine", "utopia");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_trueOneEmpty() {
    // arrange
    Set<String> input = Set.of("armadillo", "", "utopia", "yeah");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertTrue(actual);
  }


  // TODO:
  // Come up with more tests to thoroughly test hasEmptyString
  // Use your creativity here!

  @Test
  void testHasEmptyString_FirstEmpty(){
    Set<String> animals = Set.of("", "Zebra", "Cow");

    boolean result = ProblemSolving.hasEmptyString(animals);

    assertTrue(result);
  }

  @Test
  void testEmptyString_EmptySet() {
    Set<String> emptySet = new HashSet<>();

    boolean result = ProblemSolving.hasEmptyString(emptySet);

    assertFalse(result);
  }

  @Test
  void testEmptyString_EmptyString() {
    Set<String> set = Set.of("");

    boolean result = ProblemSolving.hasEmptyString(set);

    assertTrue(result);
  }


  @Test
  void testMaxLength_multipleWords() {
    // arrange
    Set<String> input = Set.of("by", "a", "commodius", "vicus");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(9, actual);
  }

  @Test
  void testMaxLength_SameLengthMultipleWord() {
    Set<String> input = Set.of("Dog", "dog", "Cat");

    int result = ProblemSolving.maxLength(input);
    
    assertEquals(3, result);
  }

  @Test
  void testMaxLength_EmptySet() {
    Set<String> input = new HashSet<>();

    int result = ProblemSolving.maxLength(input);

    assertEquals(0, result);
  }

  @Test
  void testMaxLength_EmptyString() {
    Set<String> input = Set.of("");

    int result = ProblemSolving.maxLength(input);
    assertEquals(0, result);
  }


  @Test
  void testMinLength_multipleWords() {
    Set<String> input = Set.of("by", "a", "commodius", "vicus");

    int actual = ProblemSolving.minLength(input);

    assertEquals(1, actual);
  }


  @Test
  void testMinLength_SameLengthMultipleWord() {
    Set<String> input = Set.of("Fox", "dog", "Cat");

    int result = ProblemSolving.minLength(input);

    assertEquals(3, result);
  }

  @Test
  void testMinLength_EmptySet() {
    Set<String> input = new HashSet<>();

    int result = ProblemSolving.minLength(input);

    assertEquals(Integer.MAX_VALUE, result);
  }
  
  // TODO:
  // Come up with ALL tests to thoroughly test minLength
  // Use your creativity here, and consider looking back at the maxLength
  // tests for inspiration

}
