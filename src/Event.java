public class Event {
    private final String title;
    private final int releaseYear;
    private final int age;

    @Override
    public String toString(){
        return "Title = " + getTitle()
                + ", ReleaseYear = " + getReleaseYear()
                + ", Age = " + getAge();
    }

    public Event(String title, int releaseYear, int age) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getAge() {
        return age;
    }
}
