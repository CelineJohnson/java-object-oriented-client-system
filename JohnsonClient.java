/**
 * JohnsonClient.java
 * Description: Superclass that stores general client information (shared by individual and the institutional clients).
 * Author: Celine Johnson
 * Date: November 6-9, 2025
 */

public class JohnsonClient {
    // ---------- Instance variables ----------
    /** Unique client ID (e.g., assigned by system or entered by user). */
    private String johnsonClientID;

    /** Street address (line) for the client. */
    private String johnsonStreetAddress;

    /** City for the client's address. */
    private String johnsonCity;

    /** ZIP code for the client's address. */
    private String johnsonZip;

    /** Email address for the client. */
    private String johnsonEmail;

    /** Array holding accounts associated with this client. Starts empty and grows as accounts are added. */
    private JohnsonAccount[] johnsonAccounts;

    // ---------- Constructor ----------
    /**
     * Default constructor initializes the accounts array to length 0 (no accounts).
     * This avoids null checks elsewhere and allows addAccount to expand the list.
     */
    public JohnsonClient() {
        this.johnsonAccounts = new JohnsonAccount[0];
    }

    // ---------- Accessor (getter) and Mutator (setter) methods ----------
    // Straightforward getters and setters: rubric allows no detailed comments for these.
    public void setClientID(String id) { this.johnsonClientID = id; }
    public void setStreetAddress(String address) { this.johnsonStreetAddress = address; }
    public void setCity(String city) { this.johnsonCity = city; }
    public void setZip(String zip) { this.johnsonZip = zip; }
    public void setEmail(String email) { this.johnsonEmail = email; }

    public String getClientID() { return johnsonClientID; }
    public String getStreetAddress() { return johnsonStreetAddress; }
    public String getCity() { return johnsonCity; }
    public String getZip() { return johnsonZip; }
    public String getEmail() { return johnsonEmail; }

    /**
     * Adds the provided JohnsonAccount to this client's accounts array.
     * Also does NOT set the account's customer reference here (that can be set separately if desired).
     *
     * This method creates a new array with one more slot, copies existing accounts, and places
     * the new account in the last slot. This simple resizing is acceptable for this assignment.
     *
     * @param account the JohnsonAccount to add to this client
     */
    public void addAccount(JohnsonAccount account) {
        JohnsonAccount[] newAccounts = new JohnsonAccount[johnsonAccounts.length + 1];
        for (int i = 0; i < johnsonAccounts.length; i++) {
            newAccounts[i] = johnsonAccounts[i];
        }
        newAccounts[johnsonAccounts.length] = account;
        this.johnsonAccounts = newAccounts;
    }

    /**
     * Returns a reference to the internal JohnsonAccount array.
     * @return JohnsonAccount[] list of accounts (may be length 0)
     */
    public JohnsonAccount[] getAccounts() {
        return this.johnsonAccounts;
    }

    /**
     * Builds and returns a String containing the client's information in the required format:
     * ClientID
     * Street Address
     * City, ZIP
     * email
     * List of account IDs (space separated)
     *
     * Subclasses will call super.toString() and prepend their specific lines (like name).
     *
     * @return formatted client information as a String
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClientID() == null ? "" : getClientID()).append("\n");
        sb.append(getStreetAddress() == null ? "" : getStreetAddress()).append("\n");

        // City and zip on one line (comma separated as requested in the sample output)
        String city = getCity() == null ? "" : getCity();
        String zip = getZip() == null ? "" : getZip();
        if (!city.isEmpty() && !zip.isEmpty()) {
            sb.append(city).append(", ").append(zip).append("\n");
        } else if (!city.isEmpty()) {
            sb.append(city).append("\n");
        } else if (!zip.isEmpty()) {
            sb.append(zip).append("\n");
        } else {
            sb.append("\n");
        }

        sb.append(getEmail() == null ? "" : getEmail()).append("\n");

        // Add the account IDs in a single line (space separated). If none, line will be blank.
        for (JohnsonAccount acct : johnsonAccounts) {
            if (acct != null && acct.getAccountID() != null) {
                sb.append(acct.getAccountID()).append(" ");
            }
        }

        // Trim any trailing space and return
        return sb.toString().trim();
    }
}

