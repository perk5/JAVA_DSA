    package MergeSort;
    import java.util.Arrays;
    class MergeSorted{ 
        
        void mergeSorted(int[] arr, int l, int mid, int r){

            int n1 = mid - l + 1;
            int n2 = r - mid;


            int arr1[] = new int[n1];
            int arr2[] = new int[n2];

            for(int x = 0; x < n1; x++){
                arr1[x] = arr[l+x];
            }
            for(int x = 0; x < n2; x++){
                arr2[x] = arr[mid+1+x];
            }

            int i = 0;
            int j = 0;
            int k = l;

            while(i < n1 && j < n2){
                if(arr1[i] < arr2[j]){
                    arr[k] = arr1[i];
                    i += 1;    
                }else{
                    arr[k] = arr2[j];
                    j += 1;          
                }
                k++;
            }
            
            while(i < n1){
                arr[k] = arr1[i];
                i += 1;
                k++;
            }

            while(j < n2){
                arr[k] = arr2[j];
                j += 1;
                k++;
            }
            System.out.println(Arrays.toString(arr));
        }

        void mergeSort(int[] arr, int l , int r){
    
            if(l<r)
            {
                int mid = l + (r - l) / 2;

                mergeSort(arr, l, mid);
                mergeSort(arr, mid + 1, r);

                mergeSorted(arr, l, mid, r );
            }
        }
    }

    public class MergeSort {

        public static void main(String[] args){

            int[] arr = {100, 4, 12, 10, 11, 8, 9, 7};
            int l = 0;
            int r = arr.length - 1;
            MergeSorted m1 = new MergeSorted();
            m1.mergeSort(arr, l, r);
        }
    }
