package Q4;

public class Author {
    private String authorName;
    private String contact;
    private String sex;

    public Author(String authorName, String contact, String sex) {
        this.authorName = authorName;
        this.contact = contact;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Author[" +
                "name:" + authorName +
                " email:" + contact +
                " gender:" + sex + "]";
    }
}
