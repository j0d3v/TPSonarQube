import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Lendable> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(Lendable item) {
        items.add(item);
    }

    public void removeItem(Lendable item) {
        items.remove(item);
    }

    public List<Lendable> getAvailableItems() {
        return items.stream()
                .filter(item -> !item.isBorrowed())
                .toList();
    }

    public void listAllItems() {
        items.forEach(item -> System.out.println(item.describe()));
    }
}