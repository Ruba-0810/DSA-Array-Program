package Linklist;

/*how to add new value to the linklist there is default
ex:list.add(90);
but we can see how the process is held

 */

public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }

     /*
     create the node and increase the size
      */
    public void insertfirstelement(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size=size+1;
    }

                       /*
                       insertlastelement
                        */
    public void  insertlastelement(int value){
        if(tail==null){
            insertfirstelement(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail = node;
        size++;
  }
                    /*
                    inserting the element
                     */
  public void insert(int value,int index){
        if(index==0){
            insertfirstelement(value);
            return;
        }
        if(index==size){
            insertlastelement(value);
            return;
        }
        Node temp=head;
        for(int i=0;i<index;i++) {
            temp = temp.next;
        }
            Node node=new Node( value,temp.next);
            temp.next=node;
            size++;
  }
                    /*
                    deleting first element
                     */
      public int deletefirst(){
      int value=head.value;
      head=head.next;
      if(head==null){
          tail=null;
      }
      size--;
      return value;
      }
      public int  deletelast() {
          if (size <= 1) {
              return deletefirst();
          }
          Node secondlast = get(size - 2);
          int value = tail.value;
          tail = secondlast;
          tail.next = null;
          return value;
      }
                /*
                deleting the index
                 */
      public int delete(int index){
           if(index==0){
              return deletefirst();
          }
           if(index==size-1){
               return deletelast();
           }
           Node prev=get(index-1);
           int value=prev.next.value;
           prev.next=prev.next.next;

          return value;
      }
                 /*
                 it will check one by one by using temp
                  */
    public Node find(int value) {
        Node node = head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null; //if anything not present then it return null
    }

    public Node get(int index) {
          Node node = head;
          for (int i = 0; i < index; i++) {
              node = node.next;
          }
          return node;
      }

    /*
    it will check the head is null or not by using temp
     */
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"-->");
            temp=temp.next;

        }
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
