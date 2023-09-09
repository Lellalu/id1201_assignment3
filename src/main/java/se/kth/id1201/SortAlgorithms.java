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
                    swapBefore(array,j); 
                }
            } 
        }
    }

    public static void swapBefore(int[] array, int searchingIndex){
        int temp = array[searchingIndex-1];
        array[searchingIndex-1] = array[searchingIndex];
        array[searchingIndex] = temp;
    }

    public static void mergeSort(int[] array){

    }

    /*
    public static void sort(int[] org){ 
        if(org.length == 0) {
            return; 
        }
            int[] aux = new int[org.length]; 
            sort(org,aux,0,org.length-1); 
    }
    */

}
