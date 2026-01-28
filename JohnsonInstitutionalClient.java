/**
 * JohnsonInstitutionalClient.java
 * Description: Subclass of JohnsonClient representing an institutional client (business or organization).
 * Stores the contact person's name.
 * Author: Celine Johnson
 * Date: November 6-9, 2025
 */

public class JohnsonInstitutionalClient extends JohnsonClient {
    // ---------- Instance variables ----------
    /** Name of the contact person for the institution. */
    private String johnsonContactPersonName;

    // ---------- Accessors and mutators ----------
    public void setContactPersonName(String name) { this.johnsonContactPersonName = name; }
    public String getContactPersonName() { return johnsonContactPersonName; }

    /**
     * Returns the contact person's name on one line followed by the shared client info.
     *
     * Format:
     * ContactPersonName
     * ClientID
     * Street Address
     * City, ZIP
     * email
     * List of account IDs
     *
     * @return formatted multi-line string for the institutional client
     */
    @Override
    public String toString() {
        String header = johnsonContactPersonName == null ? "" : johnsonContactPersonName;
        if (header.trim().isEmpty()) {
            return super.toString();
        } else {
            return header + "\n" + super.toString();
        }
    }
}

