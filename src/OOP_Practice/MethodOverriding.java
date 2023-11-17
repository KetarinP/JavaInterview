package OOP_Practice;

// Overriding:  the method definition should remain the same.
// The method name and parameters from the parent class and child class must be the same.
//----------------------------------------------------------------------
// Differences between Overloading vs Overriding
// OverLoading - Does not require inheritance
// Overloading - The method name must be the same as the class name.
// Overloading - Number of parameters must be different for each method.
// ----------------------------------------------------------------------
// Overriding - it requires inheritance. It needs the parents and the child relationship.
// Overriding - The method name and parameters from the parent class to the child class must be the same.
// Overriding - The body of the method must be different


class Bank {
    public double rateOfInterest() {
        return 0;
    }
}

class BankofAmerican extends Bank {
    public double rateOfInterest() {
        return 10.5;
    }
}

class Chase extends Bank {
    public double rateOfInterest() {
        return 9.7;
    }
}

class Amex extends Bank {
    public double rateOfInterest() {
        return 8.5;
    }
}

public class MethodOverriding {

    public static void main(String[] args) {

        Bank bk = new Bank();
        System.out.println(bk.rateOfInterest());

        BankofAmerican boa = new BankofAmerican();
        System.out.println(boa.rateOfInterest());

        Chase c = new Chase();
        System.out.println(c.rateOfInterest());

        Amex a = new Amex();
        System.out.println(a.rateOfInterest());
    }

}
