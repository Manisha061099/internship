
public class cls03 {
    public static void main(String[] args) {
Thread t1 = new Thread(new my ("thread 1"));
Thread t2= new Thread(new my ("thread 2"));
t1.start(); 
t2.start();
}

static class my implements Runnable{
    private String name;
      
   public  my(String name){
        this.name = name;
    }
    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println(name +  " working   "  + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
}