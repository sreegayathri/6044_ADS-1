/**
 * Class for book.
 */
class Book {
    /**.
     * bookname.
     */
    private String bookname;
    /**.
     * author.
     */
    private String author;
    /**.
     * price.
     */
    private Double price;
    /**
     * Constructs the object.
     *
     * @param      bookname     { parameter_description }
     * @param      author     { parameter_description }
     * @param      price     { parameter_description }
     */
    Book(final String bookname, final String author, final Double price) {
        this.bookname = bookname;
        this.author = author;
        this.price = price;
    }
    /**
     * get bookname.
     *
     * @return     { description_of_the_return_value }
     */
    String getbookname() {
        return this.bookname;
    }
    /**
     * get suthor.
     *
     * @return     { description_of_the_return_value }
     */
    String getauthor() {
        return this.author;
    }
    /**
     * get price.
     *
     * @return     { description_of_the_return_value }
     */
    Double getprice() {
        return this.price;
    }
    /**
     * compare.
     *
     * @param      that  The that
     *
     * @return     { description_of_the_return_value }
     */
    int compareTo(final Book that) {
        if (this.bookname.compareTo(that.bookname) > 0) {
            return 1;
        } else if (this.bookname.compareTo(that.bookname) < 0) {
            return -1;
        } else {
            if (this.author.compareTo(that.author) > 0) {
                return 1;
            } else if (this.author
                .compareTo(that.author) < 0) {
                return -1;
            } else {
                if (this.price.compareTo(that.price) > 0) {
                    return 1;
                } else if (this.price.compareTo(that.price) < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}