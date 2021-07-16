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

        for (int i = 45; i < 55 ; i++) {
            System.out.println("This is the end of the loop " + i);
        }

        for (int i = 53; i > -47 ; i--) {
            System.out.println("This loop is: " + i);
        }

        int counter = 0;
        for (int i = 59; i < 1005 ;  i++) {
            System.out.println("This is iteration # " + counter);
            counter++;
        }

        counter = 0;
        for (int  currentTime = 8; currentTime < 12; currentTime++) {
            System.out.println("BOM BOM! It is " + currentTime + " o'clock");
            System.out.println("This is the " + counter+ " tome the clock alarmed");
            counter = counter + 1;
        }

        // ARRAYS + LOOPS

        int[] grades = {8, 9, 10, 8, 9, 7, 6, 8, 9, 6, 10, 9, 8, 6};

        int gradeSum = 0;
        for (int i = 0; i < 14 ; i++) {
            gradeSum += grades[i];   // += the same as gradeSum = gradeSum + grades[i];
        }
        System.out.println("Sum of all the grades is "+ gradeSum);

        double averageGrade = gradeSum / 14d;
        System.out.println("The average grade is: " + averageGrade);



// Simplified using grades1.length if another grade is added
        int[] grades1 = {8, 9, 10, 8, 9, 7, 6, 8, 9, 6, 10, 9, 8, 6};

        int gradeSum1 = 0;
        for (int i = 0; i < grades1.length ; i++) {
            gradeSum1 += grades1[i];   // += the same as gradeSum = gradeSum + grades[i];
        }
        System.out.println("Sum of all the grades is "+ gradeSum1);

        double averageGrade1 = gradeSum1 / (double)grades1.length;
        System.out.println("The average grade is: " + averageGrade1);


        //Messages
        boolean[] arrayOfBooleans= {true, false, true, false};

        String[] arrayOfStrings = {"Message 1","Message 2", "Message 3" };
        double monthlySalary[] = { 1000d, 1100d, 1200d, 1300d, 1400d};

        //Covid tests array
        boolean[] covidTests = { false, false, false, false };

        //Students array
        String[] students = {"Artjoms","Laura", "Tatjana", "Marta"};

        //Circle K coffee, every 7th coffee is free.
        for (int i = 0; i < 10000 ; i++) {
            // ja 7/7 =1, atlikums ir 0. Ja atlikums ir 0, tad kafija ir par brīvu
            if( i% 7 == 0 ) {
                System.out.println("This coffee is for free!");
            } else {
                System.out.println("You need to pay for this cup of coffee #" +i);
            }
        }


    }
}
