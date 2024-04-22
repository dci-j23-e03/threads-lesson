package dzenang;

public class UserThread extends Thread {

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println(Thread.currentThread().getName() + " This is the UserThread " + (i + 1));
    }
  }
}
