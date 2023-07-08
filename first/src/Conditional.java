public class Conditional {
    public static void main(String[] args) {
        int releaseYear = 1990;
        boolean includeOnPlain = true;
        double movieNote = 8.1;
        String typeOfPlan = "plus";

        if(releaseYear >= 2022){
            System.out.println("The movie is New");
        } else {
            System.out.println("The movie is old");
        }

        if(includeOnPlain && typeOfPlan.equals("plus")){
            System.out.println("Movie available");
        } else {
            System.out.println("Movie not available");
        }
    }
}
