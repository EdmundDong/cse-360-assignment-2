/**
 * The SimpleList program creates simple lists of integers. The program add, remove, count, toString, and search lists.
 * 
 * @author: Edmund Dong
 * @classID: 348
 * @assignmentNumber: 1
 */
package cse360assign2;

public class SimpleList {
    private int[] list;
    private int count;

    /*
     * This method constructs SimpleLists by initializing an integer array to size
     * 10 and count to 0.
     */
    public SimpleList() {
        list = new int[10];
        count = 0;
    }

    /*
     * This method adds new integers to SimpleLists by shifting all integers to the
     * right and inserting the new integer at the head.
     */
    public void add(int newNumber) {
        for (int index = list.length - 1; index > 0; index--) // starting at the end of array, shift all numbers left
            list[index] = list[index - 1];
        list[0] = newNumber; // insert new number in first position
        if (count < 10) // increase count unless count is at max
            count++;
    }

    /*
     * This method removes integers from SimpleLists by finding the number and then
     * shifting all integers to the left to replace the integer.
     */
    public void remove(int removeThisNumber) {
        for (int index = 0; index < 10; index++)
            if (list[index] == removeThisNumber) {
                int[] tempList = new int[10];
                for (int subIndex = index; subIndex < 9; subIndex++)
                    tempList[subIndex] = list[subIndex + 1];
                count--;
                list = tempList;
            }
    }

    /*
     * @return int Returns the number of integers in the SimpleList.
     */
    public int count() {
        return count;
    }

    /*
     * @return String Returns a string containing all integers in the SimpleList.
     */
    public String toString() {
        String outputString = "";
        for (int index = 0; index < count; index++)
            outputString = outputString + list[index] + " ";
        for (int index2 = count; index2 < 10; index2++)
            outputString = outputString + 0 + " ";
        return outputString.trim();
    }

    /*
     * @return int Returns the index number of an integer in a SimpleList. Returns
     * -1 if not found.
     */
    public int search(int i) {
        int returnValue = -1; // returns -1 if value is not found
        for (int index = 0; index < 10; index++)
            if (list[index] == i)
                returnValue = index;
        return returnValue;
    }
}