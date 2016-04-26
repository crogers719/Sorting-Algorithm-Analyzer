//ctrl+shif+f=fixes indentations
//sysout+ ctrl+ space--system.out.println
//Return two items (compare and swap count; make simple object(class))

public class Sorter<T extends Comparable <T>> {
	public class SorterResult{
		long compareCount=0;
		long swapCount=0;
	}
//SELECTION SORT	
	public SorterResult selectionSort(T[] items){ //only void right now && WILL HAVE TO WRITE ON EXAM
		long compareCount=0; //int only to 2 billion
		long swapCount=0;
		for (int j=0;j<items.length; j++){//array.length-written in java
			int min=j;
			for (int k=j+1;k<items.length; k++){
				compareCount++;
				if (items[k].compareTo(items[min])<0){
					min=k;
				}
			}
			if (min!=j){ //performs swap
				T temp=items[j];
				items[j]=items[min];
				items[min]=temp;
				swapCount++;
			}
		}
		//System.out.println("Compares: "+ compareCount);
		//System.out.println("Swaps: "+ swapCount);
		SorterResult r=new SorterResult();
		r.compareCount=compareCount;
		r.swapCount=swapCount;
		return r;
		
	}

//INSERTION SORT
	public SorterResult insertionSort(T[] items){
		long compareCount=0;
		long swapCount=0;
		
		for (int i=1; i<items.length; i++){
			T temp= items [i];
			int j=i;
			while (j>0 && (items[j-1].compareTo(temp))>0){
				compareCount++;
				items[j]=items[j-1];
				j--;	
			}
		
			items[j]=temp;
			swapCount++;		
		}
		SorterResult r=new SorterResult();
		r.compareCount=compareCount;
		r.swapCount=swapCount;
		return r;
	}

//BUBBLE SORT	
	public SorterResult bubbleSort(T[] items){
		long compareCount=0;
		long swapCount=0;
		T temp; 
		for (int i=0; i<items.length-1; i++){
			for (int j=1; j<items.length-i;j++){
				if (items[j-1].compareTo(items[j])>0){
					temp=items[j-1];
					items[j-1]=items[j];
					items[j]=temp;
				}
			}
		}
		SorterResult r=new SorterResult();
		r.compareCount=compareCount;
		r.swapCount=swapCount;
		return r;
			
	}
	
//MERGE SORT
	public SorterResult msort(int compareCount, int swapCount){
		SorterResult r=new SorterResult();
		r.compareCount=compareCount;
		r.swapCount=swapCount;
		return r;
	}
	public T[] mergeSort(T[]items){
		 if(items.length > 1)
		{
			int elementsInArr1 = items.length/2;
			int elementsInArr2 = elementsInArr1;
			if((items.length % 2) == 1)
				elementsInArr2 += 1;
			T [] arr1 = (T[]) new Comparable [elementsInArr1];
			T [] arr2 = (T[]) new Comparable[elementsInArr2];
		
			for(int i = 0; i < elementsInArr1; i++)
				arr1[i] = items[i];
		
			for(int i = elementsInArr1; i < elementsInArr1 + elementsInArr2; i++)
				arr2[i - elementsInArr1] = items[i];
			arr1 = mergeSort(arr1);
			arr2 = mergeSort(arr2);
			int i = 0, j = 0, k = 0;
			while(arr1.length != j && arr2.length != k)
			{
			if(arr1[j].compareTo(arr2[k])<0)
				{
					items[i] = arr1[j];
					i++;
					j++;
				}else
				{
					items[i] = arr2[k];
					i++;
					k++;
				}
			}
			while(arr1.length != j)
			{
				items[i] = arr1[j];
				i++;
				j++;
			}
			while(arr2.length != k)
			{
				items[i] = arr2[k];
				i++;
				k++;
			}
		}
	return items;
	}
//QUICK SORT
	public SorterResult quickSort(T items[], int start, int end)
	{
		  SorterResult r=new SorterResult();
		  int compareCount=0;
		  int swapCount=0;
		  r.compareCount=compareCount;
		  r.swapCount=swapCount;
			
		  int i = start;                          // index of left-to-right scan
	      int k = end;                            // index of right-to-left scan

	        if (end - start >= 1)                   // check that there are at least two elements to sort
	        {
	                T pivot = items[start];       // set the pivot as the first element in the partition

	                while (k > i)                   // while the scan indices from left and right have not met,
	                {
	                        while ((items[i].compareTo (pivot)<=0) && i <= end && k > i){  // from the left, look for the first
	                            compareCount++;    
	                        	i++;}                                    // element greater than the pivot
	                        while ((items[k].compareTo(pivot)>0) && k >= start && k >= i) {// from the right, look for the first
	                           compareCount++;
	                        	k--;}                                        // element not greater than the pivot
	                        if (k > i)  {                                     // if the left seekindex is still smaller than
	                           swap(items, i, k);                      // the right index, swap the corresponding elements
	                           swapCount++;	
	                        }
	                }
	                swap(items, start, k);          // after the indices have crossed, swap the last element in
	                swapCount++;                                // the left partition with the pivot 
	                quickSort(items, start, k - 1); // quicksort the left partition
	                quickSort(items, k + 1, end);   // quicksort the right partition
	        }
	        else    // if there is only one element in the partition, do not do any sorting
	        {
	        	r.compareCount=compareCount;
	  			r.swapCount=swapCount;
	  			return r;                     // the array is sorted, so exit
	        }
	        r.compareCount=compareCount;
  			r.swapCount=swapCount;
  			return r;        
	}

	public void swap(T array[], int index1, int index2) 
	// pre: array is full and index1, index2 < array.length
	// post: the values at indices 1 and 2 have been swapped
	{
		T temp = array[index1];           // store the first value in a temp
		array[index1] = array[index2];      // copy the value of the second into the first
		array[index2] = temp;               // copy the value of the temp into the second
	}
	
	
	

	public SorterResult shellSort(T[] items) {
		SorterResult r=new SorterResult();
		int compareCount=0;
		int swapCount=0;
		int increment = items.length / 2;
		
		while (increment > 0) {
			for (int i = increment; i < items.length; i++) {
				int j = i;
				T temp = items[i];
				while ((j >= increment) && (items[j - increment].compareTo(temp)>0)) {
					items[j] = items[j - increment];
					j = j - increment;
				}
				items[j] = temp;
			}
			if (increment == 2) {
				increment = 1;
			} else {
				increment *= (5.0 / 11);
			}
		}
		r.compareCount=compareCount;
		r.swapCount=swapCount;
		return r;
	}
	//HEAP SORT
	public int LEFT(int i)
    {
        //returns left index of a zero index based array
        return 2*i+1;
    }

    public int RIGHT(int i)
    {
        //returns right index of a zero based array
        return 2*i+2;
    }


    public void BUILD_MAX_HEAP(T[]items)
    {
    	int heapSize= items.length;
        for(int i=items.length/2; i>=0;i--)//since n/2, n/2+1 ... are leaves we can start from n/2 step downwards
        {
            //call MAX_HEAPIFY on each root node starting from n/2
            MAX_HEAPIFY(items, i, heapSize);
        }
    }


    public void MAX_HEAPIFY(T[] items,int i, int heapSize)
    {
        int l=LEFT(i);//the left element's index which is 2*i+1 (for zero based indexed array)
        int r=RIGHT(i);//right index = 2*i+2;
        int largestElementIndex = -1;//index can't be negative so initialise largest index , it will be used later
        //heapSize is the current size of the heap being worked upon
        //check if left index lies within the heap.
        //if element at left index is greater than root(A[i]) element, max heap property is violated
        //copy the index of violated element in largestElementIndex
        if((l<heapSize) && (items[l].compareTo(items[i])>0)){
            largestElementIndex = l;
        }
        else //if max heap property is not violated copy the root's index in largestElementIndex
        {
            largestElementIndex=i;
        }
        //check to see the right sub tree for max heap property violation
        //here the largestElementIndex is calculated from previous step
        if((r<heapSize) && (items[r].compareTo(items[largestElementIndex]))>0)
        {
            largestElementIndex = r;
        }
        //if root doesn't has the largest index then swap the largest element with root element

        if(largestElementIndex!=i)
        {
            T temp = items[i];
            items[i]=items[largestElementIndex];
            items[largestElementIndex]=temp;
            //after swap, recursively call the MAX_HEAPIFY on the largest index(root element)
            MAX_HEAPIFY(items, largestElementIndex, heapSize);
        }
    }

    public SorterResult HEAP_SORT(T[]items, int heapSize)
    {
    	SorterResult r=new SorterResult();
    	int compareCount=0;
    	int swapCount=0;
        //max heap is built with heapSize initialised
        BUILD_MAX_HEAP(items);
        //starting from end loop through entire array
        for(int i=items.length-1;i>=0;i--)
        {
            //since heap is already heapified and maintains max heap property
            //the first element of the array is root of max heap
            //swap it with the extreme element of the array i.e. setting the largest element to the end of array
            T temp = items[0];
            items[0]=items[i];
            items[i]=temp;
            //reduce the heap window by 1
            heapSize = (heapSize-1);
            //call max heapify on the reduced heap
            MAX_HEAPIFY(items,0, heapSize);
        }
        r.compareCount=compareCount;
		r.swapCount=swapCount;
        return r;
    }
}