package dzenang;

public class RunnableImplementation implements Runnable {

  @Override
  public void run() {
    // we define a task to be done in this method
    for (int n = 0; n < 10; n++) {
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        System.out.println("Exception occurred: " + e.getMessage());
      }

      System.out.println(Thread.currentThread().getName() +
          "\twith Runnable: RunnableImplementation runs..." + n);
      // Thread.currentThread().getName() is used to get the name of the currently running thread
    }
  }
}
