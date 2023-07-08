import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Write your favorite movie:");
        String movie = read.nextLine();

        System.out.println("What's the release year for that movie?");
        int releaseYear = read.nextInt();

        System.out.println("Tell your evaluation to that movie");
        double evaluation = read.nextDouble();

        System.out.println(movie);
        System.out.println(releaseYear);
        System.out.println(evaluation);

    }
}
