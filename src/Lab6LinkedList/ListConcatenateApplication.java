package Lab6LinkedList;

import org.jetbrains.annotations.NotNull;

public class ListConcatenateApplication {
    public static void concatenate(DoubleEndedLinkedList list1, DoubleEndedLinkedList list2){
        if(list1.isEmpty()){
            list1.first=list2.first;
            list1.last=list2.last;
        }
        else if(!list2.isEmpty()) {
            list1.last.next= list2.first;
            list1.last=list2.last;
            list2.first=list2.last=null;
        }
    }
}
