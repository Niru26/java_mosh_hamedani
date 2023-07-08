import java.util.*;

public class workshop_4_1 {
    public static void main(String[] args) {
//        exercise_1();
//        exercise_2();
//        exercise_3();
//        exercise_4();
        exercise_5();

    }
    static void exercise_1() {
        List<Integer> ListArray = new ArrayList<>();
        List<Integer> ListLinkedList = new LinkedList<>();
        long timeStart = System.currentTimeMillis();

        for (int i = 0; i < 100_000_0; i++) {
            ListArray.add(0, i);
//            ListLinkedList.add(0, i);
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart);
    }
    static void exercise_2() {
        Scanner dataEntry = new Scanner(System.in);
        LinkedList<String> listOfLinks = new LinkedList<>();
        boolean workState = true;

        while(workState) {
            System.out.println("Enter data in format \"text~num\"");
            String[] splitString = dataEntry.nextLine().split("~");
            switch (splitString[0]) {
                case "print":
                    System.out.println(listOfLinks.remove(Integer.parseInt(splitString[1])));
//                    listOfLinks.remove(Integer.parseInt(splitString[1]));
                    break;
                case "exit":
                    workState = false;
                    System.out.println("See you later");
                    break;
                default:
                    listOfLinks.add(Integer.parseInt(splitString[1]), splitString[0]);
            }
        }
    }
    static void exercise_3() {
        Scanner entryData = new Scanner(System.in);
        LinkedList<String> splitStringList = new LinkedList<>();
        boolean workStatus = true;

        while (workStatus) {
            System.out.println("Enter data in format \"String\"");
            String message = entryData.nextLine();
            switch (message) {
                case "print":
                    ListIterator<String> linkedIterator = splitStringList.listIterator(splitStringList.size());
                    while (linkedIterator.hasPrevious()) {
                        System.out.println(linkedIterator.previous());
                    }
                    break;
                case "revert":
                    splitStringList.remove();
                    break;
                case "exit":
                    workStatus = false;
                    System.out.println("Have a nice day");
                    break;
                default:
                    splitStringList.add(message);
            }
        }


    }
    static void exercise_4() {
        Stack<Integer> stackInteger = new Stack<>();
        stackInteger.add(1);
        stackInteger.add(2);
        stackInteger.add(3);
        stackInteger.add(4);
        stackInteger.add(5);
        while (!stackInteger.isEmpty()) {
            System.out.println(stackInteger.pop());
        }
        System.out.println();
        Queue<Integer> queueList = new LinkedList<>();
        queueList.add(1);
        queueList.add(2);
        queueList.add(3);
        queueList.add(4);
        queueList.add(5);
//        while (!queueList.isEmpty()) {
//            System.out.println(queueList.poll());
//        }
        for (Integer value:
             queueList) {
            System.out.println(value);
        }
    }
    static void exercise_5() {
        MyStack test = new MyStack();
        test.push(10);
        test.push(100);
        test.push(1);
        System.out.println(test.size());
//        System.out.println(test.pop());
//        System.out.println(test.pop());
//        System.out.println(test.pop());

    }
}

