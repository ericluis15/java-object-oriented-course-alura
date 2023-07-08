import java.util.Scanner;

public class OtherLoop {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double average = 0;
        double note = 0;
        int totalNotes = 0;

        while (note != -1){
            System.out.println("Tell your evaluation to that movie or -1 to stop");
            note = read.nextDouble();
            if(note != -1){
                average += note;
                totalNotes++;
            }
        }

        System.out.println("Average of the notes is: "+ average/totalNotes);

    }
}
