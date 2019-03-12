import java.util.*;
public class partition{
  public int partition(int data[], int start, int end){
    if (data.length == 1){
      return 0;
    }
    int pivot = 1 * Math.random() * (end - start + 1);
    int temp = data[pivot + start];
    int temp1 = data[start];
    data[start] = temp;
    data[pivot] = temp1;
    temp1 = data[start];
    pivot = start;
    start++;

  }
}
