package se.kth.id1201;

public class SortAlgorithms {

    public static void selectionSort(int[] array){
        int min_value;
        int min_pos;
        for(int i = 0; i < array.length-1; i++){
            min_value = array[i]; 
            min_pos = i;
                for(int j = i ; j< array.length;j++){ 
                    if(array[j] < min_value){
                        min_value = array[j];
                        min_pos = j;
                    }
                } 
            if(min_pos != i){
                array[min_pos] = array[i];
                array[i] = min_value;
            }
            
        }
    }

    public static void insertionSort(int[] array){
        for(int i=0; i<array.length; i++){ 
            for(int j=i ; j>0 ;j--){
                if(array[j] < array[j-1]){
                    swap(array, j, j-1); 
                }
            } 
        }
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void mergeSort(int[] org){ 
        if(org.length == 0) {
            return; 
        }
        int[] aux = new int[org.length]; 
        mergeSort(org, aux, 0, org.length-1); 
    }

    private static void mergeSort(int[]org,int[]aux,int low,int high){
        if(low != high){
            int mid= (low+high)/2; 
            //sort the items from low to mid :
            mergeSort(org,aux,low, mid);         
            //sort the items from mid+1 to high : 
            mergeSort(org,aux,mid+1, high);
            //merge the two sections using the additional array
            merge(org,aux,low,mid,high);
        }
    }

    public static void merge(int[]org,int[]aux,int low,int mid,int high){
        //copy all items from low to high from org to aux 
        for(int i = low; i<= high; i++ ){
            aux[i]=org[i];
        } 

        //let's do the merging 
        int i=low; //the index in the first part 
        int j=mid+1; //the index in the second part 
        
        //for all indices from low to high 
        for(int k=low;k <= high;k++){ 
        //if i is greater than mid then 
        //move the j'th item to the org array,update j 
            if(i>mid){
                org[k] = aux[j];
                j++;
            }

        //else if j is greater than hi then 
        //move the i'th item to the org array,update i 
            else if(j>high){
                org[k] = aux[i];
                i++;
            }
        
        //else if the i'th item is smaller than the j¨ath item, 
        //move the i'th item to the org array,update i 
            else if(aux[i]<aux[j]){
                org[k] = aux[i];
                i++;
            }

        //else 
        //move the j'th item to the org array,update j 
            else {
                org[k] = aux[j];
                j++;
            }
        }
    }

    public static void quickSort(int[] array) {
        if(array.length == 0) {
            return; 
        }
        quickSort(array,0,array.length-1); 
    }

    public static void quickSort(int[] array, int low, int high){
        // Ensure indices are in correct order
        if (low >= high || low < 0){
            return;
        } 

        // Partition the array and get the index of the pivot
        int pivotIndex = partition(array,low, high);
        
        // Sort the two partitions
        quickSort(array, low, pivotIndex - 1); // Left side of pivot
        quickSort(array, pivotIndex + 1, high); // Right side of pivot
    }

    // Divides array into two partitions
    public static int partition(int[] array, int low, int high){
        int pivot = array[high];
        // Temporary pivot index
        int i = low;

        for (int j = low; j< high; j++){
            // If the current element is less than or equal to the pivot
            if (array[j] <= pivot){
                // Swap the current element with the element at the temporary pivot index
                swap(array,i,j);
                // Move the temporary pivot index forward
                i = i + 1;
            } 
        } 
        // Move the pivot element to the correct pivot position (between the smaller and larger elements)
        swap(array,i,high);
        return i; // the pivot index

    }

}
