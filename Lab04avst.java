public class Lab04avst
{
    public static void main(String []args)
    {
        System.out.println("Lab04a, 80 Point Version");

        double principal = 250000.0;
        double annualRate = 4.85;
        double numberOfYears = 30.0;
        double monthlyRate = (annualRate/100) / 12;
        double numMonths = numberOfYears * 12;

        double numerator = monthlyRate * Math.pow(1+monthlyRate,numMonths);
        double denomenator = Math.pow(1 + monthlyRate,numMonths) -1;

        double monthlyPayment = (numerator/denomenator * principal);
        double totalpayment = monthlyPayment * numMonths;
        double totalInterest = totalpayment - principal;
        monthlyPayment *= 100;
        monthlyPayment = Math.round(monthlyPayment);
        monthlyPayment /= 100;
        totalpayment *= 100;
        totalpayment = Math.round(totalpayment);
        totalpayment /= 100;
        totalInterest *= 100;
        totalInterest = Math.round(totalInterest);
        totalInterest /= 100;

        System.out.println("Principal:            $" + principal);
        System.out.println("Annual rate:          " + annualRate + "%");
        System.out.println("Number of Years:      " + numberOfYears);
        System.out.println("Monthly Payment:      $" + monthlyPayment);
        System.out.println("Total payments:       $" + totalpayment);
        System.out.println("Total Interest:       $" + totalInterest);

    }
}
