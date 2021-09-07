package guru.springframework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingTest {

  private Greeting greeting;

  @BeforeEach
  void setUp() {
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
}
