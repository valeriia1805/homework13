import java.util.Objects;
public class Author {
    private final String name;
    private final String lastName;
    public Author (String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    public String getName () {
        return name;
    }
    public String getLastName () {
        return lastName;
    }
    @Override
    public String toString () {
        return "Имя и фамилия автора: " + name + " " + lastName;
    }
    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(lastName, author.lastName);
    }
    @Override
    public int hashCode () {
        return Objects.hash(name, lastName);
    }
}