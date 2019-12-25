class MyBinarySearch{

  public static void binarySearch(int fst, int lst, int arr[], int key) {
    int mid = (fst + lst)/2;

    System.out.println("Element first: " + fst +" " + arr[fst]);
    System.out.println("Element last: " + lst + " " + arr[lst]);
    System.out.println("Element mid: " + mid + " " + arr[mid]);
    System.out.println("Element key: " + key );
    System.out.println("\n");

    if ( arr[mid] == key ) {
      System.out.println("Element is found at index: " + mid);

    } else if (mid == fst) { System.out.println("Element is not found");

    } else {
      if ( key > arr[mid]) { binarySearch( mid,lst,arr,key ); }
      else if ( key < arr[mid] ) { binarySearch( fst,mid,arr,key ); }
      else System.out.println("Element is not found");
    }
  }

  public static void main(String args[]){
    int arr[] = {10,20,30,40,50,60,70,100,233,333};
    int key = 220;
    int fst = 0;
    int lst = arr.length-1;

    if ( arr[fst] == arr[lst] ) {
      if (arr[fst] == key ) {
        System.out.println("Element is found at index: " + 0);
      } else System.out.println("Element is not found");

    } else if ( arr[fst] > key ) { System.out.println("Element is not found");
    } else if ( arr[lst] < key ) { System.out.println("Element is not found");
    } else binarySearch( fst,lst,arr,key );
  }
}
