public class Main {
    public static void main(String[] args) {
        for (Event event : getMovies()){
            validateEvent(event);
        }
        for (Event event : getTheatres()){
            validateEvent(event);
        }
        System.out.println("Well done!");
    }

    public static Movies[] getMovies(){
        return new Movies[]{
                new Movies("THE DARK KNIGHT", 2008, 13),
                new Movies("FIGHT CLUB", 1999, 18),
                new Movies("INTERSTELLAR", 2014, 13)
        };
    }

    public static Theatres[] getTheatres(){
        return new Theatres[]{
                new Theatres("The Lion King", 1997,3),
                new Theatres("Wicked", 2003, 6),
                new Theatres("Hamilton", 2015, 11)
        };
    }

    public static void validateEvent(Event event){
        try {
            if (event.getTitle() == null || event.getReleaseYear() == 0 || event.getAge() == 0) {
                throw new RuntimeException();
            } else if (event.getTitle() != null || event.getReleaseYear() != 0 || event.getAge() != 0){
                System.out.println(event);
            }

        } catch (RuntimeException r){
            System.out.println("Please check your code");
        }
    }
}
