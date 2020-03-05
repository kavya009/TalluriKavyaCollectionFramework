package Epam.Collectionsframework;
import java.util.Arrays;
 
public class DataList<E> 
{
	private int s = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object ele[];
     public DataList() {
        ele = new Object[DEFAULT_CAPACITY];
    }
     public void add(E e) {
        if (s == ele.length) {
            ensureCapacity();
        }
        ele[s++] = e;
    }  
    public  E get(int i) {
        if (i >= s || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) ele[i];
    }
    public E remove(int i) {
        if (i >= s || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = ele[i];
        int numElements = ele.length - ( i + 1 ) ;
        System.arraycopy( ele, i + 1, ele, i, numElements ) ;
        s--;
        return (E) item;
    }
     
    public int size() {
        return s;
    }
    public String toString() 
    {
         StringBuilder stringbuilder = new StringBuilder();
         stringbuilder.append('[');
         for(int i = 0; i < s ;i++) {
        	 stringbuilder.append(ele[i].toString());
             if(i<s-1){
            	 stringbuilder.append(",");
             }
         }
         stringbuilder.append(']');
         return stringbuilder.toString();
    }
     
    private void ensureCapacity() {
        int newSize = ele.length * 2;
        ele = Arrays.copyOf(ele, newSize);
    }
}