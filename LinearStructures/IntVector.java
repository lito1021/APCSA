package LinearStructures;
public class IntVector {

    private final static int INITIAL_CAPACITY = 10;
    private int[] arr = new int[INITIAL_CAPACITY];
    private int size = 0;

    //default constructor 
    public IntVector() { }

    //overloaded constructor 
    public IntVector(int capacity) {
        if(capacity < 0) {
            throw new IllegalArgumentException();
        }
        arr = new int[capacity];
    }


    //the size function, return the size
    public int size() { return size;}

    // CRUD operations (this is 99% of business)

    private void testBounds(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void tryResize() {
        if(size >= arr.length - 1 ) { //we've reached the end of the array
            //make a new temp array
            int[] temp =  new int[1 + arr.length * 2];
            //copy data into new temp array
            for(int i = 0; i < size; i++) {
                temp[i] = arr[i];
            }
            //set old array = new tempa array
            arr = temp;
        }
    }

    // insert the value "n" at the end of the vector
    public void add(int n) {
        tryResize(); // gurantee capacity first
        arr[size++] = n;
    }

    public void clear() {
        arr = new int[INITIAL_CAPACITY];
        size = 0;
    }

    public int get(int index) {
        testBounds(index);
        return arr[index];
    }
    /**
     * Inserts the element at 'index' equal to 'value'
     * shifts other elements to the right
     * return true if the value was successfully insert, false other wise
     * @param index the position in which the value will be inserted
     * @param value The numerical value to be added
     */
    public boolean add(int index, int value) {
        //SOLVE
        testBounds(index);
        int temp = arr[index];
        arr[index] = value;
        add(arr[size -1]); 
        for(int i = index - 2; i > index;i--) {
            arr[i + 1] = arr[i];
        }
        arr[index + 1] = temp;
        if(arr[index] == value) {
            return true;
        }
        return false;
    }

    /**
     * Removes the first instance of 'value' found in the list
     * shifts remaining values left if necessary
     * returns 'true' if the value was removed from the list, 'false' otherwise
     * the list remains unchanged if the value does not exist in the list
     * @param value The value to be removed if it exists
     */
    public boolean remove(int value) {
        // SOLVE
        for(int i = 0; i < size; i++) {
            if(arr[i] == value) {
                for(int j = i; i < size - 1; i++) {
                    arr[i] = arr[i +1];
                }
                return true;
             }
        }
        return false;
    }

    public void set(int index, int value) {
        testBounds(index);
        arr[index] = value;
    }

    @Override 
    public String toString() {
        if(size == 0) return "[]"; // empty array
        String t = "[" + arr[0];
        for(int i = 1; i < size; i++) {
            t += ", " + arr[i];
        }
        return t + "]";
    }
}