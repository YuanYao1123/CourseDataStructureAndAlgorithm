package Lab4StackOperations;

public class testRMStack {
    public static void main(String[] args) {
        RMStock rmStack=new RMStock();
        rmStack.push(1);
        rmStack.push(5);
        rmStack.push(10);
        rmStack.push(20);
        rmStack.push(50);
        rmStack.printStack();
        rmStack.pop();
        rmStack.printStack();
        rmStack.topElement();
        rmStack.printStack();
        System.out.println("Is it empty? "+rmStack.isEmpty());
        System.out.println("The size of this stack is "+rmStack.size());
        int position=rmStack.findElement(5);
        if(position==-1){
            System.out.println("didn't find this element");
        } else{
            System.out.println("the position is "+ position);
        }
    }
}
