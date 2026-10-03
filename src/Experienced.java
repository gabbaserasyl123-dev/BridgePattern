public class Experienced extends Registration {

    public Experienced(String name, String gender, Competition competition) {
        super(name, gender, competition);
    }

    @Override
    public void competitor() {
        System.out.println(name + " is an experienced competitor");
        competition.registration();
    }
}
