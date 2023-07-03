// 3 nodes linked list
class LL{
    static class Node{
        int value;
        Node next;
    }
    public static void main(String args[]){
        Node head=null;
        Node one=null;
        Node two=null;
        Node three=null;
        
        //allocate memory in heap
        one=new Node();
        two=new Node();
        three=new Node();
        
        one.value=1;
        two.value=2;
        three.value=3;
        
        one.next=two;
        two.next=three;
        three.next=null;
        
        head=one;
        while(head!=null){
            System.out.println(head.value);
            head=head.next;
        }
    }
}
