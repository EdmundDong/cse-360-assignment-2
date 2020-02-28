/**
 * The SimpleList program creates simple lists of integers. 
 * The program can add, append, remove from/to lists.
 * The program can search, size, sizeUp, sizeDown, and toString lists.
 * The program can output count, first element, last element of list.
 * 
 * @author: Edmund Dong
 * @classID: 348
 * @assignmentNumber: 1
 * @git: https://github.com/EdmundDong/cse360
 */
package cse360assign2;

public class SimpleList {
    private int[] list;
    private int count;

    /*
     * This method constructs SimpleLists by initializing an integer array to
     * size 10 and count to 0.
     */
    public SimpleList() {
        list = new int[10];
        count = 0;
    }

    /*
     * This method adds new integers to SimpleLists by shifting all integers to
     * the right and inserting the new integer at the head.
     */
    public void add(int newNumber) {
        if (count == list.length)
            sizeUp();
        // starting at the end of array, shift all numbers right
        for (int index = list.length - 1; index > 0; index--)
            list[index] = list[index - 1];
        list[0] = newNumber; // insert new number in first position
        count++;
    }

    /*
     * This method appends new integers to SimpleLists inserting the new integer
     * at the end.
     */
    public void append(int newNumber) {
        if (count == list.length)
            sizeUp();
        list[count] = newNumber; // insert new number in first position
        count++;
    }

    /*
     * This method removes integers from SimpleLists by finding the number and
     * then shifting all integers to the left to replace the integer.
     */
    public void remove(int removeThisNumber) {
        for (int index = 0; index < list.length; index++)
            if (list[index] == removeThisNumber) {
                for (int subIndex = index; subIndex < list.length - 1; subIndex++)
                    list[subIndex] = list[subIndex + 1];
                count--;
            }
        if (list.length - count > (int) (list.length * 0.25)) {
            sizeDown();
        }
    }

    /*
     * @return int Returns the number of integers in the SimpleList.
     */
    public int count() {
        return count;
    }

    /*
     * @return int Returns current number of possible spots in list
     */
    public int size() {
        return list.length;
    }

    /*
     * @return int Returns first number in list.
     */
    public int first() {
        int temp;
        if (count > 0)
            temp = list[0];
        else
            temp = -1;
        return temp;
    }

    /*
     * @return int Returns last number in list.
     */
    public int last() {
        int temp;
        if (count > 0)
            temp = list[count - 1];
        else
            temp = -1;
        return temp;
    }

    /*
     * @return String Returns a string with all integers in the SimpleList.
     */
    public String toString() {
        String outputString = "";
        for (int index = 0; index < count; index++)
            outputString = outputString + list[index] + " ";
        for (int index2 = count; index2 < list.length; index2++)
            outputString = outputString + 0 + " ";
        return outputString.trim();
    }

    /*
     * @return int Returns the index number of an integer in a SimpleList.
     * Returns -1 if not found.
     */
    public int search(int i) {
        int returnValue = -1; // returns -1 if value is not found
        for (int index = 0; index < list.length; index++)
            if (list[index] == i)
                returnValue = index;
        return returnValue;
    }

    /*
     * This method increases list size by ~50% if list is full.
     */
    public void sizeUp() {
        int[] temp = new int[(int) (list.length * 1.5)];
        temp = transfer(temp, list);
        list = temp;
    }

    /*
     * This method decreases list size when the list is at least 25% empty.
     */
    public void sizeDown() {
        int[] temp = new int[(list.length - ((int) (list.length * 0.25)))];
        if (temp.length == 0)
            temp = new int[1]; // ensures size is always at least 1
        temp = transfer(temp, list);
        list = temp;
    }

    /*
     * @return int[] Returns new list with contents of old list transfered over.
     */
    public int[] transfer(int[] newList, int[] eraseList) {
        for (int i = 0; i < newList.length && i < eraseList.length; i++)
            newList[i] = eraseList[i];
        return newList;
    }
}