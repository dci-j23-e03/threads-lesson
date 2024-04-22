package dzenang;

import java.util.concurrent.ThreadPoolExecutor;

public class CheckingThread extends Thread {

  @Override
  public void run() {
    Thread childThread = new Thread();
    System.out.println("Child thread is daemon: " + childThread.isDaemon());
  }

}
