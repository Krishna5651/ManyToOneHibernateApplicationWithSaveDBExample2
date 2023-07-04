package org.example.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UniversityTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link University}
     *   <li>{@link University#setId(int)}
     *   <li>{@link University#setUniversity_Code(String)}
     *   <li>{@link University#setUniversity_Name(String)}
     *   <li>{@link University#getId()}
     *   <li>{@link University#getUniversity_Code()}
     *   <li>{@link University#getUniversity_Name()}
     * </ul>
     */
    @Test
    void testConstructor() {
        University actualUniversity = new University();
        actualUniversity.setId(1);
        actualUniversity.setUniversity_Code("University Code");
        actualUniversity.setUniversity_Name("University Name");
        assertEquals(1, actualUniversity.getId());
        assertEquals("University Code", actualUniversity.getUniversity_Code());
        assertEquals("University Name", actualUniversity.getUniversity_Name());
    }
}

