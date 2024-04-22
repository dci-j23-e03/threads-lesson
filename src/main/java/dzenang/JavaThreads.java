package dzenang;

public class JavaThreads {

  public static void main(String[] args) {

//    // user thread type
//    System.out.println("Checking type of child thread:");
//    CheckingThread userThread = new CheckingThread();
//    userThread.start();
//
//    // daemon thread type
//    CheckingThread daemonThread = new CheckingThread();
//    daemonThread.setDaemon(true);
//    daemonThread.start();

    // comparing user and daemon execution
    // daemon thread will be shut down by jvm when all user threads finish
    DaemonThread daemonThread = new DaemonThread();
    daemonThread.start();

    UserThread userThread = new UserThread();
    userThread.start();
  }

}
