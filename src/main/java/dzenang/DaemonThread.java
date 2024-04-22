package dzenang;

public class DaemonThread extends Thread {

  public DaemonThread() {
    this.setDaemon(true);
  }

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("This is a daemon thread " + (i + 1));
    }
  }
}
