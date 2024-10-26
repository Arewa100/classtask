import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentTest {

    @Test
    public void testThatStudentIsAnInStanceOfStudent() {
        Student student = new Student();
        assertTrue(student instanceof Student);
    }

}
