package list;

public class list {
    entry head;

    public list()  {
        this.head = null;
    }
    
    public boolean isEmpty() {
        return (this.head == null);
    } 

    public void addFirst(int value) {
       entry entry = new entry();
       entry.element = value;
       entry.next = this.head;
       this.head = entry;
    }

    public int getSize() {
        int len = 0;
        entry current = this.head;

        while (current != null){
            current = current.next;
            len++;
        }

        return len;
    }

    public int getElement(int index) {

        if (index > this.getSize()) {
            throw new IndexOutOfBoundsException();
        }

        int counter = 0;
        entry entry = new entry();
        entry = this.head;

        for (int i = 0; i <= index; i++) {
            if (counter == index) {
                break;
            }
            entry = entry.next;
            counter++;
        }
        return entry.element;
    }

    public int[] getList() {
        int[] list = new int[this.getSize()];
        int counter = 0;
        entry current = this.head;

        while (current != null){
            list[counter] = current.element;
            current = current.next;
            counter++;
        }

        return list;
    }

    public void remove (int index) {

        if (index > this.getSize()) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            head = head.next;
        }

        int counter = 0;
        entry entry = new entry();
        entry = this.head;

        for (int i = 0; i <= index; i++) {
            if (counter == index-1) {
                break;
            }
            entry = entry.next;
            counter++;
        }
        entry.next = entry.next.next;
    }

}

