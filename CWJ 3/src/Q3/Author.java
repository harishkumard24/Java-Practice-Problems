package Q3;

public class Author {
    private String authorName;
    private String contactEmail;
    private char sex;

    public Author(String authorName, String contactEmail, char sex) {
        this.authorName = authorName;
        this.contactEmail = contactEmail;
        this.sex = sex;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Author[name=" + authorName + ", email=" + contactEmail + ", gender=" + sex + "]";
    }
}
