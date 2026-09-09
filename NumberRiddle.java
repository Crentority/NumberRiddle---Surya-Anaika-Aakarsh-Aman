public class NumberRiddle {
    public static void main(String[] args) {
        /* Testcases used are 
        Testcase 1: 10 
        Testcase 2: -7
        Testcase 3: 0
        Testcase 4: 12.0
        Testcase 5: -5.0
        Testcase 6: 1 */
        //Declaring Variables
        int startingNumber = 10;
        int newNumber = startingNumber;
        System.out.println("The number we chose was " + startingNumber);

        //Multiplying by 2
        System.out.print(newNumber + " * 2 = ");
        newNumber *= 2;
        System.out.println(newNumber);

        //Adding 6
        System.out.print(newNumber + " + 6 = ");
        newNumber += 6;
        System.out.println(newNumber);

        //Dividing by 2
        System.out.print(newNumber + " / 2 = ");
        newNumber /= 2;
        System.out.println(newNumber);

        //Subtracting the starting number and providing result
        System.out.print(newNumber + " - " + startingNumber + " = ");
        newNumber -= startingNumber;
        System.out.println(newNumber);
    }
    
}
