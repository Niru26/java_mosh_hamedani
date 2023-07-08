public class MyStack {
    private Integer[] testArray = new Integer[10];
    private int size = 0;
    int size(){
        return size;
    }
    boolean empty() {
        return size == 0;
    }
    void push(int number) {
        if (size == testArray.length) {
            Integer[] newArray = new Integer[testArray.length + 10];
            System.arraycopy(testArray, 0, newArray, 0, testArray.length);
            testArray = newArray;
        }
        testArray[size++] = number;
    }
    int peek() {
        return testArray[size - 1];
    }
    int pop() {
        return testArray[--size];
    }

}