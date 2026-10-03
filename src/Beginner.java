public class Beginner extends Registration {

    public Beginner(String name, String gender, Competition competition) {
        super(name, gender, competition);
    }

    @Override
    public void competitor() {
        System.out.println(name + " is a beginner competitor");
        competition.registration();
    }
}
