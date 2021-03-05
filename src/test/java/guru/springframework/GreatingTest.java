package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreatingTest {

    Greating greating;

    @BeforeAll
    public static void beforeClass(){
        System.out.println("iam only called once - before");
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before each");
        greating = new Greating();
    }

    @Test
    void helloWorld() {
        System.out.println(greating.helloWorld());
    }

    @Test
    void HelloWorld1() {
        System.out.println(greating.helloWorld("john"));
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("After all - only once");

    }
}