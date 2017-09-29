package arraylinierlist;
public class ArrayLinierList1 extends ArrayLinierList{
    @Override
    public void add(int index, Object theElement){   
        for(int i = size - 1; i >= index; i--)
            element[i + 1] = element[i];
        element[index] = theElement;
        size++;
    }
    @Override
    public void trimToSize() {
    if (size < capacity) {
        Object [] elmen = new Object[size];
        System.arraycopy(element, 0, elmen, 0, size);
        element = elmen;
        capacity = size;
        }
    }
    @Override
    public Object clear(int index){
        checkIndex(index);
        Object removeElement = element[index];
        for(int i = index + 1; i < size; i++)
            element[i-1] = element[i];
        element[--size] = null;
        return removeElement;
    }
    @Override
    public Object setSize(int newSize){
        if(size > newSize){
            int indext = size - newSize;
            Object removeElement = element[indext];
            for(int j=0; j<indext; j++){
            for(int i = indext + 1; i < size; i++)
                element[i-1] = element[i];
            element[--size] = null;
            }
            return removeElement;
        }
        else{
            element2 = new Object[newSize];
            System.arraycopy(element, 0, element2,0, size);
            element = element2;
        }
        return size;
    }
}



