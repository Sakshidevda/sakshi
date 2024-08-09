package july31labq;
import java.util.ArrayList;
import java.util.List;

public class Container<T> {
	
	// store the collection of objects
    private List<T> collection;

    // Constructor to initialize the collection
    public Container() {
        this.collection = new ArrayList<>();
    }

    // Method  add an object of type T  the collection
    public void add(T obj) {
        collection.add(obj);
    }

    // remove  object of type T from collection
    public boolean remove(T obj) {
        return collection.remove(obj);
    }
    
 //  get the object the specified index in the collection
    public T get(int index) {
        if (index >= 0 && index < collection.size()) {
            return collection.get(index);
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + collection.size());
        }
    }

    //get the number of objects in  collection
    public int size() {
        return collection.size();
    }
}


