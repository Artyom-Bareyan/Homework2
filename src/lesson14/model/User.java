package lesson14.model;

import java.util.Objects;

public class User {

    public String getEmail;
    private String name;
    private String surname;
    private String password;
    private String type;

    public User(String name, String surname, String password, String type) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.type = type;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author user = (Author) o;
        return Objects.equals(name, user) && Objects.equals(surname, user) && Objects.equals(password, user) && Objects.equals(type, user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, password, type);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                '}';
    }


    public void setEmail(String email) {
    }

    public void getEmail(String getEmail) {


    }
}