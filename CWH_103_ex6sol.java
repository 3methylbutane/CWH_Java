class InvalidInputException extends Exception {
    @Override
    public String toString() {
        return "Invalid input Exception - Cannot add 8 and 9";
    }
}
class CannotDivideByZeroException extends Exception {
    public String toString() {
        return "Cannot Divide ByZero";
    }
} 
class MaxInputException extends Exception {
    public String toString() {
        return "Maximum input should not exceed 100000";
    }
}
class MaxMultiplierException extends Exception {
    public String toString() {
        return "Maximum value should not exceed 7000 in case of multiplication";
    }
}


class CustomCalculator {
    double add(double a, double b) throws InvalidInputException, MaxInputException {
        if(a>100000 || b> 100000) {
            throw new MaxInputException();
        }
        if(a==8||b==9) {
            throw new InvalidInputException();
        }
        return a+b;
    }
    double subtract(double a, double b) throws MaxInputException{
        if(a>100000 || b> 100000) {
            throw new MaxInputException();
        }
        return a-b;
    }
    double multiply(double a, double b) throws MaxInputException, MaxMultiplierException{
        if(a>7000 || b>7000) {
            throw new MaxMultiplierException();
        }
        if(a>100000 || b> 100000) {
            throw new MaxInputException();
        }
        return a*b;
    }
    double divide(double a, double b) throws CannotDivideByZeroException, MaxInputException {
        if(a>100000 || b> 100000) {
            throw new MaxInputException();
        }
        if (b==0) {
            throw new CannotDivideByZeroException();
        }
        return a/b;
    }
}


public class CWH_103_ex6sol {
    public static void main(String[] args) throws InvalidInputException, CannotDivideByZeroException, MaxInputException, MaxMultiplierException {
        /*
        Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
         */

        CustomCalculator cc = new CustomCalculator();
        // cc.add(8,9);
        //cc.divide(8, 0);
        cc.multiply(100000, 459);
    }
}
