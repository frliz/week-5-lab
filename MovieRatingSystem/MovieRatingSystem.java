import java.util.Scanner;

public class MovieRatingSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Hello, " + name + "!");



    String[] movies = new String[5];
int[] ratings = new int[5];

for (int i = 0; i < 5; i++) {

    System.out.print("Enter movie " + (i + 1) + ": ");
    movies[i] = input.nextLine();

    System.out.print("Rate " + movies[i] + " from 1-10: ");
    ratings[i] = input.nextInt();

    while (ratings[i] < 1 || ratings[i] > 10) {
        System.out.print("Invalid rating. Enter a rating from 1-10: ");
        ratings[i] = input.nextInt();
    }

    input.nextLine();
}

int total = 0;

for (int i = 0; i < 5; i++) {
    total = total + ratings[i];
}

double average = total / 5.0;

System.out.println("Your average movie rating is " + average);

if (average >= 9) {
    System.out.println("You are a cinephile!");
} else if (average >= 7) {
System.out.println("You enjoy movies quite a bit."); 
} else if (average >= 5) { 
System.out.println("You have mixed feelings about movies.");
} else {
System.out.println("You are a tough critic!");
}

for (int i = 0; i < 5; i++) {

    if (ratings[i] == 10) {
        System.out.println("Wow! You found a masterpiece.");
    }

    if (ratings[i] < 4) {
        System.out.println("That movie didn't impress you much.");
    }

    
}

if (ratings[0] >= 7 && ratings[1] >= 7 && ratings[2] >= 7
        && ratings[3] >= 7 && ratings[4] >= 7) {

    System.out.println("You seem to enjoy most movies.");

} else if (ratings[0] < 3 || ratings[1] < 3 || ratings[2] < 3
        || ratings[3] < 3 || ratings[4] < 3) {

    System.out.println("You have strong opinions on movies!");
}
System.out.println("Enter your favorite genre (Action, Comedy, Horror, Drama, Sci-Fi):");
String genre = input.nextLine();

switch (genre) {

    case "Action":
        System.out.println("You love excitement and thrills!");
        break;

    case "Comedy":
        System.out.println("You enjoy a good laugh.");
        break;

    case "Horror":
        System.out.println("You have a taste for fear!");
        break;

    case "Drama":
        System.out.println("You appreciate deep storytelling.");
        break;

    case "Sci-Fi":
        System.out.println("You love futuristic and imaginative worlds!");
        break;
        default:
    System.out.println("Genre not recognized.");
    break;
}

String recommendation = genre.equals("Sci-Fi") ? "Interstellar" : "The Dark Knight";
System.out.println("Movie recommendation: " + recommendation);

input.close();
    }


}