public class Voting {
    String name;
    int age;
    Voting(String s, int age){
        this.age = age;
        this.name = s;
    }

    public static void main(String[] args) {
        Voting obj = new Voting("Mani", 15);
        if (obj.age < 19){
            throw new AgeException();
        }
    }
}
