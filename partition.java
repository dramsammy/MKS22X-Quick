import java.util.*;
public class partition{
  public int partition(int data[], int start, int end){
    if (data.length == 1){
      return 0;
    }
    int random = 1 * Math.random() * (end - start);
    int middle = data[random];
    data[random] = data[0];
    data[0] = middle;

  }
}
