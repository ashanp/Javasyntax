package course.test.lamda;

public class RunnableLamdaAnonimousinnerclass  {


    public static void main(String[] args) {

    // in this example, we have done the thread run method not extending the runnable but
    // creating a anonymous inner class.
        Thread mythread_no_lamda = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Hello run");                
            }
            
        });
        mythread_no_lamda.start();
        

    // in this example, we have done the thread run method not extending the runnable but
    // creating a anonymous inner class replaced by lamda expression.    
        Thread mythread_lamda = new Thread(()-> System.out.println("Hello run lamda"));

        mythread_lamda.start();

    }
}
