import java.util.regex.Pattern;

public abstract class Person {
    private static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
            Pattern.CASE_INSENSITIVE);
    private String email;
    public String firstName;
    public String lastName;

    public Person(String email, String firstName, String lastName) {
        if (!VALID_EMAIL_ADDRESS_REGEX.matcher(email).matches()) {
            throw new IllegalArgumentException("Invalid email format");
        }
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String email) {
        this(email, null, null);
    }

    public String getEmail() {
        return email;
    }
}
