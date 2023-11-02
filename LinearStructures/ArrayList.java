package LinearStructures;


// this is a "generic" class
public class ArrayList<E> {
    // what is protected?
    // protected is... public in the package, private outside the package
    protected static final int INITIAL_CAPACITY = 10;

    private int size = 0;

    @SuppressWarnings("unchecked") // java annotation
    private E[] data = (E[])new Object [INITIAL_CAPACITY];

    public ArrayList() { }// default constructor

    public ArrayList(E[] objects) {
        for(int i = 0; i < objects.length; i++) {
            add(objects[i]);
        }
    }
    
    @SuppressWarnings("unchecked") // java annotation
    private void ensureCapacity() {
        if(size >= data.length) {
            E[] newData = (E[])new Object[size * 2 + 1];
            // alternative is to manually loop through and copy the old to the new
            System.arraycopy(data, 0, newData, 0, size); // crazy, huh
            data = newData;
        }
    }
    public void add(E e) {
        add(size, e);
    }

    public void add(int index, E e) {
        ensureCapacity();;

        for(int i = size - 1; i >= index; i--) {
            data[i+1] = data[i]; // right shift insert
        }
        data[index] = e;
        size++;
    }

    //TODO: bring over the toString method from intVector
    @Override 
    public String toString() {
        if(size == 0) return "[]"; // empty array
        String t = "[" + data[0];
        for(int i = 1; i < size; i++) {
            t += ", " + data[i];
        }
        return t + "]";
    }
    //Test this ArrayList class add functions with Integers in Main
    //Test this ArrayList class add functions with Strings in Main
    // push to github
}
