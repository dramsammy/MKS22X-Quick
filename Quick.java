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
    // int[] array = {12,4,5,62,1,5,7,8,9,5};
    // int[] array1 = {12,4,5,62,1,5,7,8,9,5};
    // System.out.println(Arrays.toString(array));
    // quicksort(array, 0, array.length - 1);
    // System.out.println(Arrays.toString(array));
    // //Arrays.sort(array1);
    int[] randish = new int[Integer.parseInt(args[0])];
    for(int i = 0 ; i < randish.length; i++){
      randish[i] =(int)(Math.random()*10000);
    }
    quicksort(randish, 0, randish.length - 1);
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
  public static void insertionSort(int[] data){
    int first;
    int j;
    for (int i = 1; i <data.length; i++){
      first = data[i];
      j = i;
      while(j -1 >= 0 && first < data[j-1]){
        data[j] = data[j-1];
        j--;
      }
      data[j] = first;
    }
}
  public static void quicksort(int[] ary, int lo, int hi){
    if (lo >= hi){
      return;
    }
    int pivot = partition(ary, lo, hi);
    int[] half = new int[pivot];
    for (int i = 0; i < half.length; i--){
      half[i] = ary[i];
    }
    //quicksort(ary, pivot + 1, hi);
    //quicksort(ary, lo, pivot - 1);
    insertionSort(ary);
  }
}
