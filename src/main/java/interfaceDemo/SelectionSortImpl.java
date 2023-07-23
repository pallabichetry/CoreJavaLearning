package interfaceDemo;

public class SelectionSortImpl implements Sortable {

    //{2,1,10}

    int temp = 0;

    @Override
    public int[] sort(int[] arr) {

        for(int i = 0; i< arr.length; i++){

            int index = i ;

            for (int j = i+1; j<arr.length ; j++ ){
                if(arr[j] < arr[i]) {
                    index = j;

                }
            }

            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }


        return arr;
    }

    public static void main(String[] args) {
        SelectionSortImpl selectionSort = new SelectionSortImpl();
        int[] a = selectionSort.sort(new int[]{0, 5, 2, 10, -1, 1000,240,2013});

        for( int x : a) {
            System.out.println(x);
        }
    }
}
