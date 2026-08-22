import java.util.Scanner;

// ======================================================
// Class 1 - Movie Management
// ======================================================
class MovieManagement {
    static String[] movieNames;
    static float[] ratings;
    static String[] genres;
    static int count = 0;

    void movieMenu() {
        int choice;
        do {
            System.out.println();
            System.out.println("========== MOVIE MANAGEMENT ==========");
            System.out.println("1. Enter Movies");
            System.out.println("2. Display Movies");
            System.out.println("3. Search Movie");
            System.out.println("4. Update Movie");
            System.out.println("5. Insert Movie");
            System.out.println("6. Delete Movie");
            System.out.println("7. Find Highest Rated Movie");
            System.out.println("8. Find Lowest Rated Movie");
            System.out.println("9. Calculate Average Rating");
            System.out.println("10. Count Total Movies");
            System.out.println("11. Back to Main Menu");
            System.out.println();

            System.out.print("Enter your choice ");
            choice = MovieManagementSystem.sc.nextInt();
            MovieManagementSystem.sc.nextLine();

            switch (choice) {
                case 1:
                    enterMovies();
                    break;
                case 2:
                    displayMovies();
                    break;
                case 3:
                    searchMovie();
                    break;
                case 4:
                    updateMovie();
                    break;
                case 5:
                    insertMovie();
                    break;
                case 6:
                    deleteMovie();
                    break;
                case 7:
                    findHighestRatedMovie();
                    break;
                case 8:
                    findLowestRatedMovie();
                    break;
                case 9:
                    calculateAverageRating();
                    break;
                case 10:
                    countTotalMovies();
                    break;
                case 11:
                    System.out.println("Back To Menu ");
                    break;
                default:
                    System.out.println("Invalid Choice ");
            }
        } while (choice != 11);
        System.out.println();
    }

    void enterMovies() {
        System.out.print("How many new movies do you want to add? Enter the size: ");
        int size = MovieManagementSystem.sc.nextInt();
        MovieManagementSystem.sc.nextLine();

        movieNames = new String[size];
        ratings = new float[size];
        genres = new String[size];

        // Input movie, rating and genres
        for (int i = 0; i < movieNames.length; i++) {
            System.out.print("Enter Movie name ");
            movieNames[i] = MovieManagementSystem.sc.nextLine();

            System.out.print("Enter Movie Rating ");
            ratings[i] = MovieManagementSystem.sc.nextFloat();
            MovieManagementSystem.sc.nextLine();

            System.out.print("Enter Movie genres ");
            genres[i] = MovieManagementSystem.sc.nextLine();

            count++;
            System.out.println();
        }
    }

    void displayMovies() {
        if (movieNames == null) {
            System.out.println("Empty Movie list ");
        } else {
            // Display all details
            for (int i = 0; i < movieNames.length; i++) {
                System.out.println((i + 1) + " Movie Name " + movieNames[i]);
                System.out.println("  Movie Rating " + ratings[i]);
                System.out.println("  Movie Genres " + genres[i]);
                System.out.println();
            }
        }
    }

    void searchMovie() {
        if (movieNames == null) {
            System.out.println("Empty Movie list ");
        } else {
            System.out.print("Enter Movie name to search in this list ");
            String key = MovieManagementSystem.sc.nextLine();
            boolean found = false;

            for (int i = 0; i < movieNames.length; i++) {
                if (movieNames[i].equals(key)) {
                    System.out.println("Movie Available");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Movie Not Available");
            }
        }
        System.out.println();
    }

    void updateMovie() {
        if (movieNames == null) {
            System.out.println("Empty Movie list ");
        } else {
            System.out.println("Enter old Movie name ");
            String oldName = MovieManagementSystem.sc.nextLine();

            System.out.println("Enter new Movie name to update ");
            String newName = MovieManagementSystem.sc.nextLine();

            boolean found = false;

            for (int i = 0; i < movieNames.length; i++) {
                if (movieNames[i].equals(oldName)) {
                    movieNames[i] = newName;
                    System.out.println("Movie Updated Successfully");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Movie Not Found");
            }
        }
        System.out.println();
    }

    void insertMovie() {
        if (movieNames == null) {
            System.out.println("Empty Movie list ");
        } else {
            String[] insertMovie = new String[movieNames.length + 1];
            float[] insetRating = new float[ratings.length + 1];
            String[] insetGenres = new String[genres.length + 1];

            for (int i = 0; i < movieNames.length; i++) {
                insertMovie[i] = movieNames[i];
                insetRating[i] = ratings[i];
                insetGenres[i] = genres[i];
            }

            System.out.print("Enter Movie name ");
            String newMoive = MovieManagementSystem.sc.nextLine();
            insertMovie[insertMovie.length - 1] = newMoive;

            System.out.print("Enter Movie rating ");
            float newRating = MovieManagementSystem.sc.nextFloat();
            MovieManagementSystem.sc.nextLine();
            insetRating[insetRating.length - 1] = newRating;

            System.out.print("Enter movie genres ");
            String newGenres = MovieManagementSystem.sc.nextLine();
            insetGenres[insetGenres.length - 1] = newGenres;

            movieNames = insertMovie;
            ratings = insetRating;
            genres = insetGenres;
            count++;
        }
        System.out.println();
    }

    void deleteMovie() {
        if (movieNames == null) {
            System.out.println("Empty Movie list ");
        } else {

            System.out.println("Enter Movie name to delete ");
            String delMovie = MovieManagementSystem.sc.nextLine();

            int idx = -1;

            for (int i = 0; i < movieNames.length; i++) {
                if (movieNames[i].equals(delMovie)) {
                    idx = i;
                    break;
                }
            }

            if (idx == -1) {
                System.out.println("Movie not found ");
                return;
            }

            if (count == 1) {
                movieNames = null;
                ratings = null;
                genres = null;
                count = 0;
                System.out.println("Movie Deleted Successfully");
                return;
            }

            String[] deleteMovie = new String[movieNames.length - 1];
            float[] deleteRating = new float[ratings.length - 1];
            String[] deleteGenres = new String[genres.length - 1];

            int j = 0;

            for (int i = 0; i < movieNames.length; i++) {

                if (i == idx) {
                    continue;
                }

                deleteMovie[j] = movieNames[i];
                deleteRating[j] = ratings[i];
                deleteGenres[j] = genres[i];

                j++;
            }

            movieNames = deleteMovie;
            ratings = deleteRating;
            genres = deleteGenres;
            count--;
            System.out.println("Movie Deleted Successfully");
        }
        System.out.println();
    }

    void findHighestRatedMovie() {
        if (movieNames == null) {
            System.out.println("Empty Movie list ");
        } else {
            float highRating = ratings[0];
            String highMovie = movieNames[0];
            String highGenres = genres[0];

            for (int i = 0; i < ratings.length; i++) {
                if (highRating < ratings[i]) {
                    highRating = ratings[i];
                    highMovie = movieNames[i];
                    highGenres = genres[i];
                }
            }
            System.out.println("Highest Rating Movie name is " + highMovie);
            System.out.println("Rating is " + highRating);
            System.out.println("Genres is " + highGenres);

        }
        System.out.println();
    }

    void findLowestRatedMovie() {
        if (movieNames == null) {
            System.out.println("Empty Movie list ");
        } else {
            float lowRating = ratings[0];
            String lowMovie = movieNames[0];
            String lowGenres = genres[0];

            for (int i = 0; i < ratings.length; i++) {
                if (lowRating > ratings[i]) {
                    lowRating = ratings[i];
                    lowMovie = movieNames[i];
                    lowGenres = genres[i];
                }
            }
            System.out.println("Highest Rating Movie name is " + lowMovie);
            System.out.println("Rating is " + lowRating);
            System.out.println("Genres is " + lowGenres);
        }
        System.out.println();
    }

    void calculateAverageRating() {
        if (movieNames == null) {
            System.out.println("Empty Movie list ");
        } else {
            float sum = 0;

            for (int i = 0; i < ratings.length; i++) {
                sum += ratings[i];
            }

            float avg = sum / count;

            System.out.println("Average Rating is " + avg);
        }
        System.out.println();
    }

    void countTotalMovies() {
        if (movieNames == null) {
            System.out.println("Empty Movie list ");
        } else {
            System.out.println("Total Movie in this list is " + count);
        }
        System.out.println();
    }

}

// ======================================================
// Class 2 - Theatre Seat Management
// ======================================================
class TheatreSeatManagement {

    static int[][] seats;

    void seatMenu() {

        int choice;

        do {
            System.out.println();
            System.out.println("========== THEATRE SEAT MANAGEMENT ==========");
            System.out.println("1. Enter Theatre Seats");
            System.out.println("2. Display Seats");
            System.out.println("3. Book Seat");
            System.out.println("4. Cancel Seat");
            System.out.println("5. Check Seat");
            System.out.println("6. Count Booked Seats");
            System.out.println("7. Count Available Seats");
            System.out.println("8. Row-wise Display");
            System.out.println("9. Column-wise Display");
            System.out.println("10. Back to Main Menu");
            System.out.println();

            System.out.print("Enter your choice ");
            choice = MovieManagementSystem.sc.nextInt();

            switch (choice) {

                case 1:
                    enterSeats();
                    break;

                case 2:
                    displaySeats();
                    break;

                case 3:
                    bookSeat();
                    break;

                case 4:
                    cancelSeat();
                    break;

                case 5:
                    checkSeat();
                    break;

                case 6:
                    countBookedSeats();
                    break;

                case 7:
                    countAvailableSeats();
                    break;

                case 8:
                    rowWiseDisplay();
                    break;

                case 9:
                    columnWiseDisplay();
                    break;

                case 10:
                    System.out.println("Back To Main Menu");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 10);

        System.out.println();
    }

    void enterSeats() {

    }

    void displaySeats() {

    }

    void bookSeat() {

    }

    void cancelSeat() {

    }

    void checkSeat() {

    }

    void countBookedSeats() {

    }

    void countAvailableSeats() {

    }

    void rowWiseDisplay() {

    }

    void columnWiseDisplay() {

    }
}

// ======================================================
// MAIN CLASS
// ======================================================
public class MovieManagementSystem {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        MovieManagement movie = new MovieManagement();
        TheatreSeatManagement seats = new TheatreSeatManagement();

        int mainchoice;

        String adminPassword = "admin@123";
        String userPassword = "user@123";

        do {

            System.out.println();
            System.out.println("======================================");
            System.out.println("       MOVIE MANAGEMENT SYSTEM");
            System.out.println("======================================");

            System.out.print("Enter Username ");
            String username = sc.nextLine();

            System.out.print("Enter Password ");
            String password = sc.nextLine();

            // ==================================================
            // ADMIN
            // ==================================================

            if (username.equalsIgnoreCase("admin")
                    && password.equals("admin@123")) {

                int adminchoice;

                do {

                    System.out.println();
                    System.out.println("========== MOVIE MANAGEMENT SYSTEM ==========");
                    System.out.println("1. Movie Management");
                    System.out.println("2. Theatre Seat Management");
                    System.out.println("3. Exit");
                    System.out.println();

                    System.out.print("Enter Your Choice ");
                    adminchoice = sc.nextInt();
                    sc.nextLine();

                    switch (adminchoice) {

                        case 1:
                            movie.movieMenu();
                            break;

                        case 2:
                            seats.seatMenu();
                            break;

                        case 3:
                            System.out.println("Exiting...");
                            System.out.println("Thank you");
                            break;

                        default:
                            System.out.println("Invalid Choice");
                    }

                } while (adminchoice != 3);
            }

            else if (username.equalsIgnoreCase("user") 
                    && password.equals("user@123")) {

                int userChoice;

                do {

                    System.out.println();
                    System.out.println("========== USER MENU ==========");
                    System.out.println("Welcome " + username);
                    System.out.println();
                    System.out.println("1. Display Movies");
                    System.out.println("2. Search Movie");
                    System.out.println("3. Book Ticket");
                    System.out.println("4. Check Seat");
                    System.out.println("5. Logout");
                    System.out.println();

                    System.out.print("Enter your choice: ");
                    userChoice = sc.nextInt();
                    sc.nextLine();

                    switch (userChoice) {

                        case 1:
                            movie.displayMovies();
                            break;

                        case 2:
                            movie.searchMovie();
                            break;

                        case 3:
                            seats.bookSeat();
                            break;

                        case 4:
                            seats.checkSeat();
                            break;

                        case 5:
                            System.out.println("User Logged Out");
                            break;

                        default:
                            System.out.println("Invalid Choice");
                    }

                } while (userChoice != 5);
            }
            else{
                System.out.println("Invalid Username or Password ");
            }

            System.out.println();
            System.out.println("1. Login Again");
            System.out.println("2. Exit");

            System.out.print("Enter choice: ");
            mainchoice = sc.nextInt();
            sc.nextLine();

        } while (mainchoice != 3);

        sc.close();
    }
}