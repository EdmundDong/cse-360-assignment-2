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
    void test() {
        assertEquals(0, 0);
    }

    @Test
    void testSimplelist() {
        SimpleList simpleList = new SimpleList();
        assertEquals(simpleList.count(), 0);
    }

    @Test
    void testAdd() {
        SimpleList simpleList = new SimpleList();
        simpleList.add(1);
        simpleList.add(2);
        simpleList.add(3);
        simpleList.add(4);
        simpleList.add(5);
        simpleList.add(6);
        simpleList.add(7);
        simpleList.add(8);
        simpleList.add(9);
        simpleList.add(10);
        assertEquals(simpleList.size(), 10);
        simpleList.add(11);
        assertEquals(simpleList.size(), 15);
        assertEquals(simpleList.count(), 11);
        assertEquals(simpleList.search(5), 6);
    }

    @Test
    void testAppend() {
        SimpleList simpleList = new SimpleList();
        simpleList.append(1);
        simpleList.append(2);
        simpleList.append(3);
        simpleList.append(4);
        simpleList.append(5);
        simpleList.append(6);
        simpleList.append(7);
        simpleList.append(8);
        simpleList.append(9);
        simpleList.append(10);
        assertEquals(simpleList.size(), 10);
        simpleList.append(11);
        assertEquals(simpleList.size(), 15);
        assertEquals(simpleList.count(), 11);
        assertEquals(simpleList.search(5), 4);
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
        assertEquals(simpleList.search(3), 0);
    }

    @Test
    void testNewRemove() {
        SimpleList simpleList = new SimpleList();
        simpleList.add(1);
        simpleList.add(2);
        simpleList.add(3);
        simpleList.add(4);
        simpleList.add(5);
        simpleList.add(6);
        simpleList.add(7);
        simpleList.add(8);
        simpleList.add(9);
        simpleList.add(10);
        assertEquals(simpleList.size(), 10);
        simpleList.add(11);
        simpleList.remove(5);
        assertEquals(simpleList.size(), 12);
        simpleList.remove(6);
        simpleList.remove(7);
        simpleList.remove(8);
        assertEquals(simpleList.search(5), -1);
        assertEquals(simpleList.size(), 9);
    }

    @Test
    void testNewRemove2() {
        SimpleList simpleList = new SimpleList();
        simpleList.remove(5);
        assertEquals(simpleList.size(), 8);
    }


    @Test
    void testCount() {
        SimpleList simpleList = new SimpleList();
        int i = simpleList.count();
        assertEquals(simpleList.count(), i);
    }

    @Test
    void testSize() {
        SimpleList simpleList = new SimpleList();
        simpleList.add(1);
        assertEquals(simpleList.size(), 10);
        simpleList.remove(1);
        assertEquals(simpleList.size(), 8);
    }

    @Test
    void testFirst() {
        SimpleList simpleList = new SimpleList();
        assertEquals(simpleList.first(), -1);
        simpleList.add(1);
        assertEquals(simpleList.first(), 1);
        simpleList.append(2);
        assertEquals(simpleList.first(), 1);
        simpleList.add(3);
        assertEquals(simpleList.first(), 3);
    }

    @Test
    void testLast() {
        SimpleList simpleList = new SimpleList();
        assertEquals(simpleList.last(), -1);
        simpleList.add(1);
        assertEquals(simpleList.last(), 1);
        simpleList.append(2);
        assertEquals(simpleList.last(), 2);
        simpleList.add(3);
        assertEquals(simpleList.last(), 2);
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