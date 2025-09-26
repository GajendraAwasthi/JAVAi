public class day3pt1 {
    public static void main(String[] args) {
        // Arthemathic operators
        int a = 1;
        int b = 2;
        int sum = a + b; //for addition
        int mul = a * b; //for multiplication
        int diff = a - b; //for finding difference
        float div = a / b; //for division
        float rem = a % b; // for reminder from division
        System.out.println("=======================================================================");
        System.out.println("        Arthematic Operators Example");      
        System.out.println("=======================================================================");
       
        System.out.println("The value of added integers are: " + sum);
        System.out.println("The value of multiplied integers are: " + mul);
        System.out.println("The value of Difference in integers are: " + diff);
        System.out.println("The value of Division in integers are: " + div);
        System.out.println("The Remender of integers are: " + rem);
        System.out.println("=======================================================================");
         System.out.println("        Assignment Operators Example");
        System.out.println("=======================================================================");
        //Assignment Operators
        int numA = 2;
        int numB = 2;
        int numC = 2;
        int numD= 2;

// for printing first numA++ value
        System.out.println("The first value of nummA before assignment operator i.e i++ is: "+ numA++); //2
        System.out.println("The first value of nummA After  assignment operator i.e: i++ is: "+ numA); //3
 // for printing first ++numB value
        System.out.println("The first value of nummB before assignment operator i.e ++i is: "+ ++numB); // value = 3
        System.out.println("The first value of nummB After  assignment operator i.e: ++i is: "+ numB); // value = 3
        // for printing first numC-- value
        System.out.println("The first value of nummC before assignment operator i.e i-- is: "+ numC--); //2
        System.out.println("The first value of nummC After  assignment operator i.e: i-- is: "+ numC); //1
 // for printing first --numD value
        System.out.println("The first value of nummDbefore assignment operator i.e --i is: "+ --numD); // value = 1
        System.out.println("The first value of nummB After  assignment operator i.e: --i is: "+ numD); // value = 1
    }

}
