public abstract class Registration {

    protected String name;
    protected String gender;
    protected Competition competition;

    public Registration(String name, String gender, Competition competition){
        this.name = name;
        this.gender = gender;
        this.competition = competition;
    }

    public abstract void competitor();
}
