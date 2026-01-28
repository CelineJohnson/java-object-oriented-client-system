/**
 * JohnsonAccount.java
 * Description: Represents an account associated with a client. Contains an account ID and
 * a reference to the JohnsonClient who owns the account.
 * Author: Celine Johnson
 * Date: November 6-9, 2025
 */

public class JohnsonAccount {
    // ---------- Instance variables ----------
    /** The unique identifier for this account (entered by user). */
    private String accountID;

    /** The client who owns this account (may be null until assigned). */
    private JohnsonClient customer;

    // ---------- Accessors and mutators ----------
    public void setAccountID(String id) { this.accountID = id; }
    public void setCustomer(JohnsonClient customer) { this.customer = customer; }

    public String getAccountID() { return accountID; }
    public JohnsonClient getCustomer() { return customer; }

    /**
     * Returns a brief string representation of the account.
     * The rubric requires a toString override on all model classes.
     *
     * @return A single-line description: the account ID (if present)
     */
    @Override
    public String toString() {
        return accountID == null ? "" : accountID;
    }
}

