package head_first;

public class Program {
    public static void main(String[] args) {
        System.out.println("This is a Head first project samples");
        System.out.println("Chapter 4");
        dog smallDog = new dog();
        dog averageDog = new dog();
        dog bigDog = new dog();
        smallDog.setName("Shrik");
        averageDog.setName("Bobik");
        bigDog.setName("Polkan");
        smallDog.dogBark(25);
        averageDog.dogBark(39);
        bigDog.dogBark(69);
    }
}
