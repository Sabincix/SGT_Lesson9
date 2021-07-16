public class SGT_Lesson9 {

    public static void main(String[] args) {

        int[] firstArray = new int [3];
        firstArray[0] = 55;
        firstArray[1] = 1900;
        firstArray[2] = 1;

        System.out.println("This is the FIRST element: " + firstArray[0]);
        System.out.println("This is the SECOND element: " + firstArray[1]);


//        Another version to define elements. Shorthand array initialization

        int[] temperatureArray = {16, 20, 23, 33,30, 34};
        System.out.println("This is the temperature for friday: " + temperatureArray[4]);

        System.out.println("In temperatures array we have " + temperatureArray.length + " elements");

        System.out.println("Last element in the array is: " + temperatureArray[temperatureArray.length - 1]);


        int[] weatherForecast = new int[7];
        weatherForecast[0] = 29;
        weatherForecast[1] = 31;
        weatherForecast[2] = 30;
//        int[] weatherForecast = {29, 31, 30};
        weatherForecast[3] = 30;
        weatherForecast[4] = 37;
        weatherForecast[5] = 30;
        weatherForecast[6] = 19;

//        adds elements
//        weatherForecast[4] = 37;

        double averageTemperature = ( weatherForecast[0] + weatherForecast[1] + weatherForecast[2] + weatherForecast[3]
                + weatherForecast[4] + weatherForecast[5] + weatherForecast[6]) / 7d;
        System.out.println("Average temperature for the week is " + averageTemperature + " degrees");

        // LOOPS
        for ( int i = 0; i < 10; i++ ) {
            System.out.println("Hello, you are in an iteration");
        }

// INFINITE LOOP
//        for (int i = 0; i < 10; i--) {
//            System.out.println("Infinite loop" + i );
//        }

    }
}
