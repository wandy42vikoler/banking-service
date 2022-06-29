package data;

public class Customer {

    //email address, living address, name and birthday.
    private final int id;
    private final String name;
    private final String birthday;
    private String email;
    private String residence;

    public Customer(int id, String name, String birthday, String email, String residence) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.email = email;
        this.residence = residence;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
