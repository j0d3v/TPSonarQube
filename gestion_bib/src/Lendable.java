interface Lendable {
    void borrow();
    void returnItem();
    boolean isBorrowed();
    String describe();
}