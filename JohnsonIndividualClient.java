/**
 * JohnsonIndividualClient.java
 * Description: Subclass of JohnsonClient representing an individual person.
 * Stores first and last name and prints name + shared client info.
 * Author: Celine Johnson
 * Date: November 6-9, 2025
 */

public class JohnsonIndividualClient extends JohnsonClient {
    // ---------- Instance variables ----------
    /** First name of the individual. */
    private String johnsonFirstName;

    /** Last name of the individual. */
    private String johnsonLastName;

    // ---------- Accessors and mutators ----------
    public void setFirstName(String firstName) { this.johnsonFirstName = firstName; }
    public void setLastName(String lastName) { this.johnsonLastName = lastName; }

    public String getFirstName() { return johnsonFirstName; }
    public String getLastName() { return johnsonLastName; }

    /**
     * Returns the individual's name on one line followed by the
     * shared client fields produced by the superclass's toString.
     *
     * Format (per assignment):
     * FirstName LastName
     * ClientID
     * Street Address
     * City, ZIP
     * email
     * List of account IDs
     *
     * @return formatted multi-line string for the individual client
     */
    @Override
    public String toString() {
        String nameLine = (johnsonFirstName == null ? "" : johnsonFirstName) + 
                          (johnsonLastName == null ? "" : " " + johnsonLastName);
        // Combine name line and superclass information
        if (nameLine.trim().isEmpty()) {
            return super.toString();
        } else {
            return nameLine + "\n" + super.toString();
        }
    }
}

