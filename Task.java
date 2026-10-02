
THREE DIFFERENT STUDENTS  DETAILS WITH MARKS 

class Student {
  String studentName;
  int rollno;
  String branch;
  double cgpa;

}

public class Week3 {
  public static void main(String[] args) {
    Student student1 = new Student();
    student1.studentName = " Vinodkumar";
    student1.rollno = 45;
    student1.branch = "AI&DS";
    student1.cgpa = 7.6;

    Student student2 = new Student();
    student2.studentName = "Kumar";
    student2.rollno = 34;
    student2.branch = "Cse";
    student2.cgpa = 6.7;

    Student student3 = new Student();
    student3.studentName = "Reddy";
    student3.branch = "cse";
    student3.cgpa = 9.8;
    student3.rollno = 45;

    System.out.println("*** First Student information****");
    System.out.println("Studentname=" + student1.studentName);
    System.out.println("Rollno=" + student1.rollno);
    System.out.println("Branch=" + student1.branch);
    System.out.println("CGPA=" + student1.cgpa);

    System.out.println("*** Second Student information****");
    System.out.println("Studentname=" + student2.studentName);
    System.out.println("Rollno=" + student2.rollno);
    System.out.println("Branch=" + student2.branch);
    System.out.println("CGPA=" + student2.cgpa);

    System.out.println("***  Third Student information****");
    System.out.println("Studentname=" + student3.studentName);
    System.out.println("Rollno=" + student3.rollno);
    System.out.println("Branch=" + student3.branch);
    System.out.println("CGPA=" + student3.cgpa);

  }


        ***THE DETAILS OF THE CUSTOMER IN BANK***


        
class BankAccount {

    String accountHolderName;
    long accountNumber;
    double accountBalance;

    static int totalAccounts = 0;

    BankAccount(String accountHolderName, long accountNumber, double accountBalance) {

        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        totalAccounts++;
    }

    void displayAccountDetails() {

        System.out.println("***** Account holder Details *****");
        System.out.println("Account Holder Name = " + accountHolderName);
        System.out.println("Account Number       = " + accountNumber);
        System.out.println("Account Balance      = " + accountBalance);
        System.out.println();
    }
}

public class week32 {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Vinod", 123456, 634379.98);

        BankAccount account2 = new BankAccount("Ram", 123457, 10000.00);

        BankAccount account3 = new BankAccount("Surya", 123458, 5000.00);

        account1.displayAccountDetails();
        account2.displayAccountDetails();
        account3.displayAccountDetails();

        System.out.println("Total number of Accounts created: " + BankAccount.totalAccounts);
    }
}


}
