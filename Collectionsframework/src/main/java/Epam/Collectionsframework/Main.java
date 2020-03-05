package Epam.Collectionsframework;
public class Main
{
    public static void main(String[] args) 
    {
        DataList<Integer> data = new DataList<>();
         data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);
        data.add(6);
        data.add(7);
        System.out.println("Elements :- " + data);
         
        data.remove(2);
        data.remove(4);
        System.out.println("Elements after removing :- " + data);
        System.out.println( data.get(0) );
        System.out.println( data.get(1) );
 
        System.out.println("size :- "+data.size());
    }
}