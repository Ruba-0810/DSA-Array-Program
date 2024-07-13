package Linklist;
    public class CC{
    private Node head;
    private Node tail;
    public CC(){
        this.head=null;
        this.tail=null;
    }
    public void insert(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }

        public void dispay() {
        Node node = head;
            if (head != null) {
                do {
                    System.out.print(node.value + "-->");
                    node= node.next;
                }     while (node != head);
            }
        System.out.println("end");
    }
        public void delete(int value){
            Node node=head;           //now head=node then check value of head
            if(head==null){
                return;
            }
            if(node.value==value){
                head=head.next;
                tail.next=head;
                return;
            }
            do{                      //value of head is not matches
                Node n=node.next;
                if(n.value==value){
                    node.next=n.next;
                }
                node=node.next;
            }while(node!=head);
            System.out.println("end");
        }


        private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}
