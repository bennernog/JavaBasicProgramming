package tools;

import java.util.Scanner;
import java.util.function.Predicate;

public class InputRequests {

    //INTEGERS
    /**
     * Method that requests an integer from the user and repeats request until user inputs a valid integer
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input.
     *
     * @return  An integer
     */
    public static int requestInt(Scanner scanner, String request) {
        return requestInt(scanner, request, null);
    }

    /**
     * Method that requests an integer from the user and repeats request until user inputs a value matching conditions defined by the Predicate
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input. Repeated if predicate returns false.
     * @param predicate The Predicate that tests whether the input meets desired conditions.
     *
     * @return  An integer validated by the Predicate
     */
    public static int requestInt(Scanner scanner, String request, Predicate<Integer> predicate) {
        return requestInt(scanner, request, predicate, request);
    }

    /**
     * Method that requests an integer from the user and repeats request with an error message until user inputs a value matching conditions defined by the Predicate
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input.
     * @param predicate The Predicate that tests whether the input meets desired conditions.
     * @param errorMessage  The message displayed in case predicate returns false.
     *
     * @return  An integer validated by the Predicate
     */
    public static int requestInt(Scanner scanner, String request, Predicate<Integer> predicate, String errorMessage){

        int number ;
        System.out.println(request);

        while(!scanner.hasNextInt()) {
            String input = scanner.next();
            System.out.printf("\"%s\" is not a valid number. Please try again!%n", input);
        }

        number = scanner.nextInt();

        if (predicate != null) {

            while (! predicate.test(number)) {
                System.out.println(errorMessage);
                number = scanner.nextInt();
            }
        }

        return number;
    }

    //LONGS
    /**
     * Method that requests a long from the user and repeats request until user inputs a valid value
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input.
     *
     * @return  A long
     */
    public static long requestLong(Scanner scanner, String request) {
        return requestLong(scanner, request, null);
    }

    /**
     * Method that requests a long from the user and repeats request until user inputs a value matching conditions defined by the Predicate
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input. Repeated if predicate returns false.
     * @param predicate The Predicate that tests whether the input meets desired conditions.
     *
     * @return  A long validated by the Predicate
     */
    public static long requestLong(Scanner scanner, String request, Predicate<Long> predicate) {
        return requestLong(scanner, request, predicate, request);
    }

    /**
     * Method that requests a long from the user and repeats request with an error message until user inputs a value matching conditions defined by the Predicate
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input.
     * @param predicate The Predicate that tests whether the input meets desired conditions.
     * @param errorMessage  The message displayed in case predicate returns false.
     *
     * @return  A long validated by the Predicate
     */
    public static long requestLong(Scanner scanner, String request, Predicate<Long> predicate, String errorMessage){

        long number ;
        System.out.println(request);

        while(!scanner.hasNextLong()) {
            String input = scanner.next();
            System.out.printf("\"%s\" is not a valid number. Please try again!%n", input);
        }

        number = scanner.nextLong();

        if (predicate != null) {

            while (! predicate.test(number)) {
                System.out.println(errorMessage);
                number = scanner.nextLong();
            }
        }

        return number;
    }

    //DOUBLES
    /**
     * Method that requests a double from the user and repeats request until user inputs a valid value
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input.
     *
     * @return  A double
     */
    public static double requestDouble(Scanner scanner, String request) {
        return requestDouble(scanner, request, null);
    }

    /**
     * Method that requests a double from the user and repeats request until user inputs a value matching conditions defined by the Predicate
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input. Repeated if predicate returns false.
     * @param predicate The Predicate that tests whether the input meets desired conditions.
     *
     * @return  A double validated by the Predicate
     */
    public static double requestDouble(Scanner scanner, String request, Predicate<Double> predicate) {
        return requestDouble(scanner, request, predicate, request);
    }

    /**
     * Method that requests a double from the user and repeats request with an error message until user inputs a value matching conditions defined by the Predicate
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input.
     * @param predicate The Predicate that tests whether the input meets desired conditions.
     * @param errorMessage  The message displayed in case predicate returns false.
     *
     * @return  A double validated by the Predicate
     */
    public static double requestDouble(Scanner scanner, String request, Predicate<Double> predicate, String errorMessage){

        double number ;
        System.out.println(request);

        while(!scanner.hasNextDouble()) {
            String input = scanner.next();
            System.out.printf("\"%s\" is not a valid number. Please try again!%n", input);
        }

        number = scanner.nextDouble();

        if (predicate != null) {

            while (! predicate.test(number)) {
                System.out.println(errorMessage);
                number = scanner.nextDouble();
            }
        }

        return number;
    }

    //DOUBLES
    /**
     * Method that requests a float from the user and repeats request until user inputs a valid value
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input.
     *
     * @return  A float
     */
    public static float requestFloat(Scanner scanner, String request) {
        return requestFloat(scanner, request, null);
    }

    /**
     * Method that requests a float from the user and repeats request until user inputs a value matching conditions defined by the Predicate
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input. Repeated if predicate returns false.
     * @param predicate The Predicate that tests whether the input meets desired conditions.
     *
     * @return  A float validated by the Predicate
     */
    public static float requestFloat(Scanner scanner, String request, Predicate<Float> predicate) {
        return requestFloat(scanner, request, predicate, request);
    }

    /**
     * Method that requests a float from the user and repeats request with an error message until user inputs a value matching conditions defined by the Predicate
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input.
     * @param predicate The Predicate that tests whether the input meets desired conditions.
     * @param errorMessage  The message displayed in case predicate returns false.
     *
     * @return  A float validated by the Predicate
     */
    public static float requestFloat(Scanner scanner, String request, Predicate<Float> predicate, String errorMessage){

        float number ;
        System.out.println(request);

        while(!scanner.hasNextFloat()) {
            String input = scanner.next();
            System.out.printf("\"%s\" is not a valid number. Please try again!%n", input);
        }

        number = scanner.nextFloat();

        if (predicate != null) {

            while (! predicate.test(number)) {
                System.out.println(errorMessage);
                number = scanner.nextFloat();
            }
        }

        return number;
    }

    //STRINGS
    /**
     * Method that request a string from the user and returns that value
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input.
     *
     * @return  A string
     */
    public static String requestString(Scanner scanner, String request) {
        return requestString(scanner, request, null);
    }

    /**
     * Method that requests a string from the user and repeats request until user inputs a value matching conditions defined by the Predicate
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input. Repeated if predicate returns false.
     * @param predicate The Predicate that tests whether the input meets desired conditions.
     *
     * @return  A string validated by the Predicate
     */
    public static String requestString(Scanner scanner, String request, Predicate<String> predicate) {
        return requestString(scanner, request, predicate, request);
    }

    /**
     * Method that requests a string from the user and repeats request with an error message until user inputs a value matching conditions defined by the Predicate
     *
     * @param scanner   The Scanner object that is used to read the console for user input.
     * @param request   The string requesting the user for input.
     * @param predicate The Predicate that tests whether the input meets desired conditions.
     * @param errorMessage  The message displayed in case predicate returns false.
     *
     * @return  A string validated by the Predicate
     */
    public static String requestString(Scanner scanner, String request, Predicate<String> predicate, String errorMessage) {
        String result;

        System.out.println(request);

        result = scanner.nextLine();
        if (predicate != null) {

            while (! predicate.test(result)) {
                System.out.println(errorMessage);
                result = scanner.nextLine();
            }
        }

        return result;
    }
}
