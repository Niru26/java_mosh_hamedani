package head_first;

public class dog {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void dogBark(int dogWeight) {
        System.out.printf("%s: ", name);
        if (dogWeight < 30 && dogWeight > 0) {
            System.out.println("Tiaf - Tiaf");
        } else if (dogWeight < 50) {
            System.out.println("Gav - gav");
        } else {
            System.out.println("Pow - pow");
        }
    }
}
