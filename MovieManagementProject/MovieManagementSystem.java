import java.util.Scanner;

//Class 1 Movie
class MovieManagement {
    static String[] movieNames;
    static int[] ratings;
    static String[] genres;
    static int count;

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
        ratings = new int[size];
        genres = new String[size];

        // Input movie, rating and genres
        for (int i = 0; i < movieNames.length; i++) {
            System.out.print("Enter Movie name ");
            movieNames[i] = MovieManagementSystem.sc.nextLine();

            System.out.print("Enter Movie Rating ");
            ratings[i] = MovieManagementSystem.sc.nextInt();
            MovieManagementSystem.sc.nextLine();

            System.out.print("Enter Movie genres ");
            genres[i] = MovieManagementSystem.sc.nextLine();

            System.out.println();
        }
    }

    void displayMovies() {

    }

    void searchMovie() {

    }

    void updateMovie() {

    }

    void insertMovie() {

    }

    void deleteMovie() {

    }

    void findHighestRatedMovie() {

    }

    void findLowestRatedMovie() {

    }

    void calculateAverageRating() {

    }

    void countTotalMovies() {

    }
}

// Class 2 - Movie String Analysis
class MovieStringAnalysis {

    void analysisMenu() {

        int choice;

        do {
            System.out.println();
            System.out.println("========== MOVIE STRING ANALYSIS ==========");
            System.out.println("1. Count Characters");
            System.out.println("2. Convert Movie Name to Uppercase");
            System.out.println("3. Convert Movie Name to Lowercase");
            System.out.println("4. Search Keyword");
            System.out.println("5. Check Starts With");
            System.out.println("6. Check Ends With");
            System.out.println("7. Find Character Position");
            System.out.println("8. Find Longest Movie Name");
            System.out.println("9. Find Shortest Movie Name");
            System.out.println("10. Compare Two Movie Names");
            System.out.println("11. Back to Main Menu");
            System.out.println();

            System.out.print("Enter your choice ");
            choice = MovieManagementSystem.sc.nextInt();

            switch (choice) {

                case 1:
                    countCharacters();
                    break;

                case 2:
                    toUpperCase();
                    break;

                case 3:
                    toLowerCase();
                    break;

                case 4:
                    searchKeyword();
                    break;

                case 5:
                    startsWith();
                    break;

                case 6:
                    endsWith();
                    break;

                case 7:
                    findCharacterPosition();
                    break;

                case 8:
                    findLongestMovieName();
                    break;

                case 9:
                    findShortestMovieName();
                    break;

                case 10:
                    compareMovieNames();
                    break;

                case 11:
                    System.out.println("Back To Main Menu");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 11);

        System.out.println();
    }

    void countCharacters() {

    }

    void toUpperCase() {

    }

    void toLowerCase() {

    }

    void searchKeyword() {

    }

    void startsWith() {

    }

    void endsWith() {

    }

    void findCharacterPosition() {

    }

    void findLongestMovieName() {

    }

    void findShortestMovieName() {

    }

    void compareMovieNames() {

    }
}

// Class 3 - Theatre Seat Management
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

public class MovieManagementSystem {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MovieManagement movie = new MovieManagement();
        MovieStringAnalysis analysis = new MovieStringAnalysis();
        TheatreSeatManagement seats = new TheatreSeatManagement();

        int choice;
        do {
            System.out.println("========== MOVIE MANAGEMENT SYSTEM ==========");
            System.out.println("1. Movie Management");
            System.out.println("2. Movie String Analysis");
            System.out.println("3. Theatre Seat Management");
            System.out.println("4. Exit");
            System.out.println();

            System.out.print("Enter Your Choice ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    movie.movieMenu();
                    break;
                case 2:
                    analysis.analysisMenu();
                    break;
                case 3:
                    seats.seatMenu();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.out.println("Thank you ");
                    break;
                default:
                    System.out.println("Invalid Choice ");
            }
        } while (choice != 4);

        sc.close();
    }
}