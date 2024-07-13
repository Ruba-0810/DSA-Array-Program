package Queue;

public class CustormImplement {
    protected int[]num;
    private static final int DEFEAULT_SIZE=10;
    int end=0;
    public CustormImplement(){
        this(DEFEAULT_SIZE);
    }
    public CustormImplement(int size){
        this.num=new int[size];
    }
    public boolean insert(int item){
        if(isFull()){
           return false;
        }
        num[end]=item;
        end++;
        return true;
    }
    public  int removed() throws Exception{
       if(isEmpty()){
          throw new Exception("Queue is empty");
       }
       int remove=num[0];
       // for shifting
        for(int i=1;i<end;i++){
            num[i-1]=num[i];
        }
        end--;
        return removed();

    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue empty");

        }
        return num[0];
    }
    public boolean isFull(){

        return end==num.length-1;
    }
    public boolean isEmpty() {

        return end==0;
    }
    public void display(){
        for(int i=0;i<end;i++){
            System.out.println(num[i]+"");

        }
        System.out.println("end");
    }
}
