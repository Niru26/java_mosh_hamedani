import java.util.*;

public class workshop_4 {
//    public static void main(String[] args) {
//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new LinkedList<>();
//        long timeStart = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            list1.add(0,  i);
//        }
//        long timeFinish = System.currentTimeMillis();
//        System.out.println(timeFinish - timeStart);
//    }
public static void main(String[] args) {
        /*
        Реализовать консольное приложение, которое:

        Принимает от пользователя строку вида
        text~num
        Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
        Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
         */
    Scanner scanner = new Scanner(System.in);
    boolean work = true;
    LinkedList<String> list = new LinkedList<>();
    while (work) {
        System.out.println("Введите команду");
        String line = scanner.nextLine();
        String[] splitLine = line.split("~");
        switch (line) {
            case "print":
                ListIterator<String> iterator = list.listIterator(list.size());
                while (iterator.hasPrevious()) {
                    System.out.println(iterator.previous());
                }
                break;
            case "exit":
                System.out.println("До новых встреч");
                work = false;
                break;
            default:
                list.add(Integer.parseInt(splitLine[1]), splitLine[0]);
        }
    }
}
}