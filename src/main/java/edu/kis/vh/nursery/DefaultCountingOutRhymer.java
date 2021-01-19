package edu.kis.vh.nursery;
//Renamed Class to DefaultCountingOutRhymer.

//No unused setters.
public class DefaultCountingOutRhymer {

  public static final int FULL = 11;
  public static final int CALL_CHECK = -1;
  //Renamed field NUMBERS to numbers.
  //variable already final //KG
  private final int[] numbers = new int[12];

  private int total = -1;

  public void countIn(int in) {
    if (!isFull()) {
      numbers[++total] = in;
    }
  }

  public boolean callCheck() {
    return total == CALL_CHECK;
  }

  public boolean isFull() {
    return total == FULL;
  }

  protected int peekaboo() {
    if (callCheck()) {
      return -1;
    }
    return numbers[total];
  }

  public int countOut() {
    if (callCheck()) {
      return -1;
    }
    return numbers[total--];
  }

  public int getTotal() {
    return total;
  }
}
