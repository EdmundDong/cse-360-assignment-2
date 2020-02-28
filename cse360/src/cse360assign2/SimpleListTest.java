/**
 * The SimpleListTest program is a JUnit test file that ensure the SimpleList program works.
 * 
 * @author: Edmund Dong
 * @classID: 348
 * @assignmentNumber: 1
 */
package cse360assign2;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class SimpleListTest {

    @Test
    void testSimplelist() {
        SimpleList simpleList = new SimpleList();
        assertEquals(simpleList.count(), 0);
    }

    @Test
    void testAdd() {
        SimpleList simpleList = new SimpleList();
        int i = simpleList.count();
        simpleList.add(5);
        assertEquals(simpleList.count(), i + 1);
        assertEquals(simpleList.search(5), i);
    }

    @Test
    void testRemove() {
        SimpleList simpleList = new SimpleList();
        simpleList.add(2);
        simpleList.add(3);
        simpleList.add(5);
        int i = simpleList.count();
        simpleList.remove(5);
        assertEquals(simpleList.count(), i - 1);
        assertEquals(simpleList.search(5), -1);
        assertEquals(0, simpleList.search(3));
    }

    @Test
    void testCount() {
        SimpleList simpleList = new SimpleList();
        int i = simpleList.count();
        assertEquals(simpleList.count(), i);
    }

    @Test
    void testToString() {
        String expectedResult = "0 0 0 0 0 0 0 0 0 0";
        SimpleList simpleList = new SimpleList();
        assertEquals(expectedResult, simpleList.toString());
    }

    @Test
    void testSearch() {
        SimpleList simpleList = new SimpleList();
        simpleList.add(2);
        simpleList.add(3);
        simpleList.add(5);
        assertEquals(0, simpleList.search(5));
        assertEquals(1, simpleList.search(3));
        assertEquals(2, simpleList.search(2));
    }
}