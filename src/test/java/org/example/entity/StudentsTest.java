package org.example.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class StudentsTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Students}
     *   <li>{@link Students#setRoll_No(String)}
     *   <li>{@link Students#setStudent_Id(int)}
     *   <li>{@link Students#setStudent_Name(String)}
     *   <li>{@link Students#setUniversity(University)}
     *   <li>{@link Students#getRoll_No()}
     *   <li>{@link Students#getStudent_Id()}
     *   <li>{@link Students#getStudent_Name()}
     *   <li>{@link Students#getUniversity()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Students actualStudents = new Students();
        actualStudents.setRoll_No("Roll No");
        actualStudents.setStudent_Id(1);
        actualStudents.setStudent_Name("Student Name");
        University university = new University();
        university.setId(1);
        university.setUniversity_Code("University Code");
        university.setUniversity_Name("University Name");
        actualStudents.setUniversity(university);
        assertEquals("Roll No", actualStudents.getRoll_No());
        assertEquals(1, actualStudents.getStudent_Id());
        assertEquals("Student Name", actualStudents.getStudent_Name());
        assertSame(university, actualStudents.getUniversity());
    }
}

