package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {

  private Greeting greeting;

  @BeforeAll
  public static void beforeClass() {
    System.out.println("Before all...");
  }

  @BeforeEach
  void setUp() {
    System.out.println("Before each...");
    greeting = new Greeting();
  }

  @Test
  void helloWorld() {
    System.out.println(greeting.helloWorld());
  }

  @Test
  void testHelloWorld() {
    System.out.println(greeting.helloWorld("Fabio"));
  }

  @AfterEach
  void tearDown() {
    System.out.println("After each...");
  }

  @AfterAll
  public static void afterClass() {
    System.out.println("After all...");
  }
}
