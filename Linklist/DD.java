package Linklist;

public class DD {
    Node head;
/*  Node tail;
    int size;
  public DD(int size){
       this.size=0;}

 */
                    /*
                    insertingfirst element
                     */
    public void insertfirstelement(int value){
        Node node =new Node(value);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }
//    public void display(){
//        Node temp=head;
//        while (temp!=null){
//            System.out.print(temp.value+"-->");
//            temp=temp.next;
//        }
//        System.out.println("end");
//    }
    public void display() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.value + "-->");
            last = temp;
            temp = temp.next;
        }
        /*
        it is reverse order
         */
        System.out.println("end");
        while (last != null) {
            System.out.print(last.value + "-->");
            last = last.prev;

        }
        System.out.println("start");
    }
    private class Node{
      int value;
      Node next;
      Node prev;
      public Node(int value){
          this.value=value;
      }
      public Node(int value,Node next,Node prev){
          this.value=value;
          this.next=next;
          this.prev=prev;
      }
  }

}
