package Lab6LinkedList;

public class Test {
    public static void main(String[] args) {
        DoubleEndedLinkedList list1=new DoubleEndedLinkedList();
        list1.insertLast("1");
        list1.insertLast("2");
        list1.insertLast("3");
        DoubleEndedLinkedList list2=new DoubleEndedLinkedList();
        list2.insertLast("4");
        list2.insertLast("5");
        list2.insertLast("6");
        System.out.println(list1);
        ListConcatenateApplication.concatenate(list1,list2);
        System.out.println(list1);
    }
}
