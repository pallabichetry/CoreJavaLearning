package interfaceDemo;

public class BubbleSortImpl implements  Sortable{


    @Override
    public int[] sort(int[] arr) {
       int n  = arr.length;
       int temp = 0;
       for(int i = 0; i<n; i++){
           for (int j = 1;j< (n - i);j++ ){
               if (arr[j-1]>arr[j]){
                  temp = arr[j-1];
                  arr[j-1] = arr[j];
                  arr[j] = temp;

               }
           }
       }


        return arr;
    }

    public static void main(String[] args) {
        BubbleSortImpl bubbleSort = new BubbleSortImpl();
        int[] a = bubbleSort.sort(new int[]{5, 2, 10, 1, 1000,240,2013});
        for(int x : a){
            System.out.println(x);
        }
        System.out.println(a.toString());

    }
}

