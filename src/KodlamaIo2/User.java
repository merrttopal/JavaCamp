package KodlamaIo2;

public class User {
    private int userId;
    private String UserName;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String eMail;



    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return UserName;
    }

    public User setUserName(String userName) {
        UserName = userName;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public User setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }


}
