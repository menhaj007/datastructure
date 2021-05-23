public class Stack<T> {
    private T[] data;
    private int topIndexLocation; //top = 0, -1

    @SuppressWarnings("unchecked")
    public Stack() {
        data = (T[]) new Object[100]; //int, double, obj== Integer
        topIndexLocation = -1;
    }
    
    @SuppressWarnings("unchecked")
    public Stack(int maximumSizeGiveByUser) {
        data = (T[]) new Object[maximumSizeGiveByUser]; // new int[100]
        topIndexLocation = -1;
    }

    public boolean isEmpty() {
        return topIndexLocation == -1;
        // if (topIndexLocation == -1) {
        //     return true;
        // } else {
        //     return false;
        // }
    }
    public boolean isFull() {
        return topIndexLocation+1 == data.length;
        // return topIndexLocation == data.length-1;
    }

    public T top() {
        // if (!isEmpty()) {
        //     return data[topIndexLocation];
        // } else {
        //     return null;
        // }
        if (isEmpty()) return null;
        return data[topIndexLocation];
    }
    public void push(T element) {
        if (!isFull()) {
            // topIndexLocation++; //increment
            // data[topIndexLocation] = element;
            data[++topIndexLocation] = element;
        }
    }

    // public void pop() {
    //     if (isEmpty()) return;
    //     data[topIndexLocation--] = null;
    //     // topIndexLocation--;
    // }
    
    public T pop() {
        if (!isEmpty()) {
            T elementToBeRemoved = data[topIndexLocation];
            data[topIndexLocation] = null;
            topIndexLocation--;
            return elementToBeRemoved;
        } else {
            return null;
        }
    }
    public int size() {
        return topIndexLocation+1;
    }

}