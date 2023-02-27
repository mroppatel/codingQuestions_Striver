// Merge 2 Sorted Array without Extra Space.

    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        for(int i = 0; i < n ; i++){
            if(arr1[i] > arr2[0]){
                long temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
                
                long first = arr2[0];
                
                int k;
                for(k = 1; k < m && arr2[k] < first ; k++){
                    arr2[k-1] = arr2[k];
                }
                arr2[k - 1] = first;
            }
        }
    }
