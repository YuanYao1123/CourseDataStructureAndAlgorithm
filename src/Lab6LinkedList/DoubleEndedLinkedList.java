package Lab6LinkedList;

public class DoubleEndedLinkedList {
    SinglyLinkedListNode first;
    SinglyLinkedListNode last;



    DoubleEndedLinkedList() {
        first = last = null;
    }

    boolean isEmpty() {
        return first == null;
    }

    void insertLast(String str) {
        SinglyLinkedListNode nodeNew = new SinglyLinkedListNode(str);
        nodeNew.next=null;
        if(first==null){
            first=last=nodeNew;
        }else{
            last.next=nodeNew;
            last=nodeNew;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        SinglyLinkedListNode pointer=first;
        while (pointer!=null){
            sb.append(pointer.data+"  ");
            pointer=pointer.next;
       }
        return sb.toString();

    }
}
