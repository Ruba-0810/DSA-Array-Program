package Queue;

public class Implement {
    public static void main(String[] args) throws Exception {
             CircularQuese queuelist =new CircularQuese(5);

       queuelist.insert(9);
        queuelist.insert(6);
        queuelist.insert(5);
        queuelist.insert(19);
        queuelist.insert(1);



        queuelist.display();
//        System.out.println(queuelist.removed());
//        queuelist.display();
    }
}
