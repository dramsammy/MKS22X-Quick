import java.util.*;
public class Quick{
  public static int partition(int data[], int start, int end){
    if (data.length == 1){
      return 0;
    }
    int pivot = (int) (Math.random() * 10 % (end - start)) + start;
    //System.out.println("this is pivot:" + pivot);
    int temp = data[pivot + start];
    int temp1 = data[start];
    data[start] = temp;
    data[pivot] = temp1;
    temp1 = data[start];
    pivot = start;
    start++;
    while (start <= end){
      if (data[start] > temp1){
        temp = data[start];
        data[start] = data[end];
        data[end] = temp;
        end--;
      }
      else if (data[start] < temp1){
        temp = data[pivot];
        data[pivot] = data[start];
        data[start] = temp;
        start++;
        pivot++;
      }
      else{
        start++;
      }
    }
    return pivot;
  }
  public static void main(String[] args) {
    int[] array = {12,4,5,62,1,5,7,8,9,5};
    System.out.println(Arrays.toString(array));
    System.out.println(partition(array,0,9));
    System.out.println(Arrays.toString(array));
  }
  public static int quickselect(int[] data, int k){
    int start = 0;
    int first = partition(data, start, data.length-1);
    while(k != first){
      if (k > first){
        first = partition(data,first,data.length-1);
      }
      if (k < first){
        first = partition(data,first,data.length-1);
      }
    }
    return data[first];
  }
}
