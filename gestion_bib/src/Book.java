class Book implements Lendable {
    private String title;
    private String author;
    private boolean borrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    @Override
    public void borrow() {
        if (borrowed) {
            System.out.println("This book is already borrowed.");
            return;
        }
        borrowed = true;
    }

    @Override
    public void returnItem() {
        if (!borrowed) {
            System.out.println("This book was not borrowed.");
            return;
        }
        borrowed = false;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    @Override
    public boolean isBorrowed() { return borrowed; }

    @Override
    public String describe() {
        return title + " by " + author;
    }

    public void complexMethodExample(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i + " " + classify(i));
        }
    }

    private String classify(int i) {
        if (i % 2 == 0) {
            return "is even";
        }
        if (i % 3 == 0) {
            return "divisible by 3";
        }
        return "something else";
    }
}