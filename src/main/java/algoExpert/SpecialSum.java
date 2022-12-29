package algoExpert;

public class SpecialSum {
  public static void main(String[] args) {
    int [] arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    int answer = specialSum(arr,7);
    System.out.println(answer);
  }
  public static int specialSum(int [] arr,int specialNumber){
    int specialSum = 0;

    for (int i = 0; i < arr.length; i = i + specialNumber*2) {
      for (int j = i; j<= i+(specialNumber-1) && j< arr.length; j++){
        specialSum = specialSum + arr[j];
        System.out.println(arr[j]);
      }
    }
  return specialSum;
  }
}
