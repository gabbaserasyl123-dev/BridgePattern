public class Main{
    public static void main(String[] args) {
        Competition sprint = new Sprint();
        Competition marathon = new Marathon();
        Competition swimming = new Swimming();
        Registration athlete1 = new Beginner("Dexter", "male", sprint);
        Registration athlete2 = new Beginner("Anna", "female", marathon);
        Registration athlete3 = new Beginner("Mark", "male", swimming);
        athlete1.competitor();
        athlete2.competitor();
        athlete3.competitor();
    }
}
