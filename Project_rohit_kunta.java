/************************
 * Demo for Policy Class*
*************************/

import java.util.Scanner;

public class Project_rohit_kunta
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        long policyNumber;
        String fullName;
        String firstName;
        String lastName;
        int age;
        String smokingStatus;
        double height;
        double weight;

        System.out.print("Please enter the Policy Number: ");
        policyNumber = input.nextLong();
        
        input.nextLine();

        System.out.print("Please enter the Provider Name: ");
        fullName = input.nextLine();

        System.out.print("Please enter the Policyholder's First Name: ");
        firstName = input.nextLine();

        System.out.print("Please enter the Policyholder's Last Name: ");
        lastName = input.nextLine();

        System.out.print("Please enter the Policyholder's Age: ");
        age = input.nextInt();
        
        input.nextLine();

        System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        smokingStatus = input.nextLine();

        System.out.print("Please enter the Policyholder's Height (in inches): ");
        height = input.nextDouble();

        System.out.print("Please enter the Policyholder's Weight (in pounds): ");
        weight = input.nextDouble();

        Policy policyHolder = new Policy(policyNumber, fullName, firstName, lastName, age, smokingStatus, height, weight);

        System.out.println("");

        System.out.println("Policy Number: " + policyHolder.getPolicyNumber());
        System.out.println("Provider Name: " + policyHolder.getFullName());
        System.out.println("Policyholder's First Name: " + policyHolder.getFirstName());
        System.out.println("Policyholder's Last Name: " + policyHolder.getLastName());
        System.out.println("Policyholder's Age: " + policyHolder.getAge());
        System.out.println("Policyholder's Smoking Status: " + policyHolder.getSmokingStatus());
        System.out.println("Policyholder's Height: " + policyHolder.getHeight());
        System.out.println("Policyholder's Weight: " + policyHolder.getWeight());
        System.out.printf("Policyholder's BMI: %.2f\n", policyHolder.getBMI());
        System.out.printf("Policy Price: $%.2f \n", policyHolder.getPrice());
    }
}
