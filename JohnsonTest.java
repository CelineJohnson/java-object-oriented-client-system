/**
 * JohnsonTest.java
 * Description: Test driver for the Johnson classes. Prompts the user to enter information
 * to create four accounts, an individual client, and an institutional client. Assigns two
 * accounts to each client, then prints each client's information using toString().
 * Author: Celine Johnson
 * Date: November 6-9, 2025
 */

import java.util.Scanner;

public class JohnsonTest {
    public static void main(String[] args) {
        // Create Scanner for user input
        Scanner input = new Scanner(System.in);

        // ---- Step 1: Create four Account objects ----
        // Creating all account objects first fulfills the "four account objects" rubric item.
        JohnsonAccount account1 = new JohnsonAccount();
        JohnsonAccount account2 = new JohnsonAccount();
        JohnsonAccount account3 = new JohnsonAccount();
        JohnsonAccount account4 = new JohnsonAccount();

        // Prompt the user to enter an ID for each account.
        // Account IDs are strings.
        System.out.println("Enter Account ID for account 1:");
        account1.setAccountID(input.nextLine().trim());

        System.out.println("Enter Account ID for account 2:");
        account2.setAccountID(input.nextLine().trim());

        System.out.println("Enter Account ID for account 3:");
        account3.setAccountID(input.nextLine().trim());

        System.out.println("Enter Account ID for account 4:");
        account4.setAccountID(input.nextLine().trim());


        // ---- Step 2: Create an IndividualClient and collect its data ----
        JohnsonIndividualClient johnsonIndividual = new JohnsonIndividualClient();
        System.out.println("\n--- Enter Individual Client Information ---");

        System.out.print("First Name: ");
        johnsonIndividual.setFirstName(input.nextLine().trim());

        System.out.print("Last Name: ");
        johnsonIndividual.setLastName(input.nextLine().trim());

        System.out.print("Client ID: ");
        johnsonIndividual.setClientID(input.nextLine().trim());

        System.out.print("Street Address: ");
        johnsonIndividual.setStreetAddress(input.nextLine().trim());

        System.out.print("City: ");
        johnsonIndividual.setCity(input.nextLine().trim());

        System.out.print("ZIP: ");
        johnsonIndividual.setZip(input.nextLine().trim());

        System.out.print("Email: ");
        johnsonIndividual.setEmail(input.nextLine().trim());

        // Assign two accounts to the individual client (accounts 1 & 2).
        // Also set the account's customer reference for completeness.
        johnsonIndividual.addAccount(account1);
        account1.setCustomer(johnsonIndividual);

        johnsonIndividual.addAccount(account2);
        account2.setCustomer(johnsonIndividual);

        // ---- Step 3: Create an InstitutionalClient and collect its data ----
        JohnsonInstitutionalClient johnsonInstitutional = new JohnsonInstitutionalClient();
        System.out.println("\n--- Enter Institutional Client Information ---");

        System.out.print("Contact Person Name: ");
        johnsonInstitutional.setContactPersonName(input.nextLine().trim());

        System.out.print("Client ID: ");
        johnsonInstitutional.setClientID(input.nextLine().trim());

        System.out.print("Street Address: ");
        johnsonInstitutional.setStreetAddress(input.nextLine().trim());

        System.out.print("City: ");
        johnsonInstitutional.setCity(input.nextLine().trim());

        System.out.print("ZIP: ");
        johnsonInstitutional.setZip(input.nextLine().trim());

        System.out.print("Email: ");
        johnsonInstitutional.setEmail(input.nextLine().trim());

        // Assign two accounts to the institutional client (accounts 3 & 4) and set ownership
        johnsonInstitutional.addAccount(account3);
        account3.setCustomer(johnsonInstitutional);

        johnsonInstitutional.addAccount(account4);
        account4.setCustomer(johnsonInstitutional);

        // ---- Step 4: Display the output ----
        // The output order and format follows the assignment sample and uses toString() of each class.
        System.out.println("\nINDIVIDUAL CLIENT:");
        System.out.println(johnsonIndividual.toString());

        System.out.println("\nINSTITUTIONAL CLIENT:");
        System.out.println(johnsonInstitutional.toString());

        // Close scanner to avoid resource leak
        input.close();
    }
}

