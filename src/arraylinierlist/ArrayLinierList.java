package arraylinierlist;
public class ArrayLinierList {
    protected Object [] element,element2;
    protected int size;
    protected int capacity;
    int index;
    public ArrayLinierList(int capacity) {
        this.capacity = capacity;
        element = new Object[capacity];

        index = 0;
    }
    public ArrayLinierList(){
        this(10);
    }
    public boolean isEmpty(){
        return size == 0;
    } 
    public int size(){
        return size;
    }
    void checkIndex(int index){
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("index = " + index + "size = " + size);
    }
    
    public void add(int index, Object theElement){        
        
    }
    public void trimToSize() {
        
    }

    public Object clear(int i) {
        return null;
    }

    public Object setSize(int newArray) {
        return null;
    }
}
