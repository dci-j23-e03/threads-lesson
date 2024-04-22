package dzenang;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    System.out.println(Thread.currentThread().getName() + " Hello world!");

//    Thread.sleep(3000);

    UserThread userThread = new UserThread();
    userThread.setDaemon(true);
    userThread.start();
    // test with 10, 20, 30 and more millis to see different behaviour
    Thread.sleep(1000);
    userThread.setDaemon(false);

    if (userThread.isDaemon()) {
      System.out.println(Thread.currentThread().getName() + " This is a daemon thread");
    } else {
      System.out.println(Thread.currentThread().getName() + " This is a user thread");
    }

    // two ways how to use Runnable for Thread definition
    // named class or anonymous implementation
    Thread someThread = new Thread(new RunnableImplementation());
    someThread.start();

    // anonymous inner class
    Thread someOtherThread = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int n = 0; n < 10; n++) {
          System.out.println(Thread.currentThread().getName() +
              "\twith Runnable: Anonymous runs..." + n);
          // Thread.currentThread().getName() is used to get the name of the currently running thread
        }
      }
    });
    someOtherThread.start();
  }

  class SomeInnerClass {
    private String someField;
  }
}