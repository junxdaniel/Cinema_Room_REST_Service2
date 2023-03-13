
class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }

    public String toString() {

        String retValue;

        retValue = "title=" + title + ",yearOfPublishing=" + yearOfPublishing + ",authors=[";
        for (int i = 0; i < authors.length; i++) {
            retValue = retValue + authors[i] + ",";
        }
        return retValue.substring(0, retValue.length() - 1) + "]";
    }
}