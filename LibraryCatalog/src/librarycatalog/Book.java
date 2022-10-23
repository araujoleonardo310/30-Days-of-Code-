
package librarycatalog;

public class Book {

    String title;
    int pagerCount;
    int ISBN;
    boolean isCheckedOut;
    int dayCheckedOut = -1;

    // Constructor
    public Book(String bookTitle, int bookPagerCount, int bookISBN) {
        this.title = bookTitle;
        this.pagerCount = bookPagerCount;
        this.ISBN = bookISBN;
        isCheckedOut = false;
    }
    
    // Getters
    public String getTitle() {
        return this.title;
    }
    
    public int gePagerCount() {
        return this.pagerCount;
    }
    
    public int getISBN() {
        return this.ISBN;
    }
    
    public boolean getIsCheckedOut() {
        return this.isCheckedOut;
    }
    
    public int getDayCheckedOut() {
        return this.dayCheckedOut;
    }
    
    // SETTERS
    
    public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut) {
        this.isCheckedOut = newIsCheckedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }
    
    public void setDayCheckedOut(int day) {
        this.dayCheckedOut = day;
    }
    
    
    
}
