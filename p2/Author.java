package p2;
// Author.java
class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() { return name; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public char getGender() { return gender; }

    @Override
    public String toString() {
        return "Author{name='" + name + "', email='" + email + "', gender=" + gender + '}';
    }
}
// TestAuthor.java
class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Лев Толстой", "lev@example.com", 'M');
        System.out.println(a1);
        a1.setEmail("tolstoy@example.com");
        System.out.println("Updated email: " + a1.getEmail());
    }
}
