
/**
 * Created by ${*  Osama Abo Adel  *} on 1/2/2022.
 */
public class R_3_11 {
   public int size(){
       int si=0;
       if (trailer==null) return si;

       DoublyLinkedList.Node<E> x=header;
       while (x.getNext()!=trailer){
           si++;
           x=x.getNext();
       }
       return si;
   }
}
