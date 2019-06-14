package ua.com.avesacademy;

public enum UserRole {

    USER, ADMIN;

    @Override
    public String toString() {
        return "ROLE_" + name();
    }
}
