import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.Person;
public class PersonTest {

    @Test
     void fullNameTest()
    {
        Person person = new Person("CHELLOUF","Charf",24) ;
        String fullName = person.getFullName();
        Assertions.assertEquals("Charf CHELLOUF",fullName);
    }

    @Test
    void shouldReturnTrueTest()
    {
        Person person = new Person("CHELLOUF","Charf",18) ;
        Assertions.assertTrue(person.isAdult());

    }

    @Test
    void shouldReturnFalseTest()
    {
        Person person = new Person("CHELLOUF","Charf",14) ;
        Assertions.assertFalse(person.isAdult());

    }
}
