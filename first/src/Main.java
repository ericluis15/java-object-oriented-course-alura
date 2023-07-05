public class Main {
    public static void main(String[] args) {
        System.out.println("This is Screen Match");
        System.out.println("Movie: Top Gun: Maverick");

        int releaseYear = 2022;
        System.out.println("Release Year: " + releaseYear);

        boolean includeOnPlain = true;

        double movieNote = 8.1;

        //Var to calculate the average
        double average = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("Medium: " + average);

        String synopsis = """
                Top Gun Movie
                Adventure movie with handsome man
                Very nice
                Release year: 
                        """ + releaseYear;
        System.out.println(synopsis);

        int stars = (int) (average/2);
        System.out.println(stars);
    }
}