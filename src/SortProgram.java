
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


//if forget to click main--ctrl+shift+space
//autoboxing--convert int to integer (vice versa)--doesn't work with arrays need Integer array- only compare objects

public class SortProgram {
	public static void main(String[] args) {
		Integer[] numbers=new Integer [10]; //will eventually make bigger
		Random rand=new Random(999);//put any integer-seed; repeats
		for (int i=0; i<numbers.length; i++){
			numbers[i]=rand.nextInt(20);
		}
		
		Scanner keyboard=new Scanner (System.in);
		System.out.println("1-Selection Sort");
		System.out.println("2-Insertion Sort");
		System.out.println("3-Bubble Sort");
		System.out.println("4-Shell Sort");
		System.out.println("5-Merge Sort");
		System.out.println("6-Quick Sort");
		System.out.println("7-Heap Sort");
		System.out.println("0-Done");
		System.out.println("Which sort?");
		int choice=keyboard.nextInt();
		
		while (choice!=0){
		if (choice==1){	
			System.out.println("SELECTION SORT");
			long start= System.currentTimeMillis();
			long start2=System.nanoTime();
			System.out.println(Arrays.toString(numbers));//create string of numbers-print
			
			Sorter <Integer> sorter=new Sorter<Integer>(); //sorter object-no constructor
			sorter.selectionSort(numbers);
			System.out.println(Arrays.toString(numbers));
			long end=System.currentTimeMillis();
			long end2=System.nanoTime();
			
			Sorter<Integer>.SorterResult result=sorter.selectionSort(numbers);
			System.out.println("running time (in miliseconds): "+ (end-start));
			System.out.println("running time (in nanoseconds): "+ (end2-start2)+"\n\n");
			System.out.println (result.compareCount);
			System.out.println (result.swapCount);
	}
		else if(choice==2){
			System.out.println("INSERTION SORT");
			long start= System.currentTimeMillis();
			long start2=System.nanoTime();
			System.out.println(Arrays.toString(numbers));//create string of numbers-print
			Sorter <Integer> sorter=new Sorter<Integer>(); //sorter object-no constructor
			sorter.insertionSort(numbers);
			System.out.println(Arrays.toString(numbers));
			long end=System.currentTimeMillis();
			long end2=System.nanoTime();
			System.out.println("running time (in miliseconds): "+ (end-start));
			System.out.println("running time (in nanoseconds): "+ (end2-start2)+"\n\n");
			Sorter<Integer>.SorterResult result=sorter.insertionSort(numbers);
			System.out.println("running time (in miliseconds): "+ (end-start));
			System.out.println("running time (in nanoseconds): "+ (end2-start2)+"\n\n");
			System.out.println (result.compareCount);
			System.out.println (result.swapCount);
	}
		else if(choice==3){
			System.out.println("BUBBLE SORT");
			long start= System.currentTimeMillis();
			long start2=System.nanoTime();
			System.out.println(Arrays.toString(numbers));//create string of numbers-print
			Sorter <Integer> sorter=new Sorter<Integer>(); //sorter object-no constructor
			sorter.bubbleSort(numbers);
			System.out.println(Arrays.toString(numbers));
			long end=System.currentTimeMillis();
			long end2=System.nanoTime();
			System.out.println("running time (in miliseconds): "+ (end-start));
			System.out.println("running time (in nanoseconds): "+ (end2-start2)+"\n\n");
			Sorter<Integer>.SorterResult result=sorter.bubbleSort(numbers);
			System.out.println("running time (in miliseconds): "+ (end-start));
			System.out.println("running time (in nanoseconds): "+ (end2-start2)+"\n\n");
			System.out.println (result.compareCount);
			System.out.println (result.swapCount);
	}
		else if (choice==4){
			System.out.println("SHELL SORT");
			long start= System.currentTimeMillis();
			long start2=System.nanoTime();
			System.out.println(Arrays.toString(numbers));//create string of numbers-print
			Sorter <Integer> sorter=new Sorter<Integer>(); //sorter object-no constructor
			sorter.shellSort(numbers);
			System.out.println(Arrays.toString(numbers));
			long end=System.currentTimeMillis();
			long end2=System.nanoTime();
			System.out.println("running time (in miliseconds): "+ (end-start));
			System.out.println("running time (in nanoseconds): "+ (end2-start2)+"\n\n");
			Sorter<Integer>.SorterResult result=sorter.shellSort(numbers);
			System.out.println("running time (in miliseconds): "+ (end-start));
			System.out.println("running time (in nanoseconds): "+ (end2-start2)+"\n\n");
			System.out.println (result.compareCount);
			System.out.println (result.swapCount);
		}
		else if (choice==5){
			System.out.println("MERGE SORT");
			long start= System.currentTimeMillis();
			long start2=System.nanoTime();
			System.out.println(Arrays.toString(numbers));//create string of numbers-print
			Sorter <Integer> sorter=new Sorter<Integer>(); //sorter object-no constructor
			sorter.mergeSort(numbers);
			System.out.println(Arrays.toString(numbers));
			long end=System.currentTimeMillis();
			long end2=System.nanoTime();
			System.out.println("running time (in miliseconds): "+ (end-start));
			System.out.println("running time (in nanoseconds): "+ (end2-start2)+"\n\n");
		}
		else if (choice==6){
			System.out.println("QUICK SORT");
			long start= System.currentTimeMillis();
			long start2=System.nanoTime();
			System.out.println(Arrays.toString(numbers));//create string of numbers-print
			Sorter <Integer> sorter=new Sorter<Integer>(); //sorter object-no constructor
			sorter.quickSort(numbers, 0, ((numbers.length)-1));
			System.out.println(Arrays.toString(numbers));
			long end=System.currentTimeMillis();
			long end2=System.nanoTime();
			System.out.println("running time (in miliseconds): "+ (end-start));
			System.out.println("running time (in nanoseconds): "+ (end2-start2)+"\n\n");
			Sorter<Integer>.SorterResult result=sorter.quickSort(numbers,0, ((numbers.length)-1));
			System.out.println("running time (in miliseconds): "+ (end-start));
			System.out.println("running time (in nanoseconds): "+ (end2-start2)+"\n\n");
			System.out.println (result.compareCount);
			System.out.println (result.swapCount);
		}
		else if (choice==7){
			System.out.println("HEAP SORT");
			long start= System.currentTimeMillis();
			long start2=System.nanoTime();
			System.out.println(Arrays.toString(numbers));//create string of numbers-print
			Sorter <Integer> sorter=new Sorter<Integer>(); //sorter object-no constructor
			sorter.HEAP_SORT(numbers, 0);
			System.out.println(Arrays.toString(numbers));
			long end=System.currentTimeMillis();
			long end2=System.nanoTime();
			System.out.println("running time (in miliseconds): "+ (end-start));
			System.out.println("running time (in nanoseconds): "+ (end2-start2)+"\n\n");
			Sorter<Integer>.SorterResult result=sorter.HEAP_SORT(numbers,0);
			System.out.println("running time (in miliseconds): "+ (end-start));
			System.out.println("running time (in nanoseconds): "+ (end2-start2)+"\n\n");
			System.out.println (result.compareCount);
			System.out.println (result.swapCount);
		}
		
		System.out.println("1-Selection Sort");
		System.out.println("2-Insertion Sort");
		System.out.println("3-Bubble Sort");
		System.out.println("4-Shell Sort");
		System.out.println("5-Merge Sort");
		System.out.println("6-Quick Sort");
		System.out.println("7-Heap Sort");
		System.out.println("0-Done");
		System.out.println("Which sort?");
		choice=keyboard.nextInt();
		}
	
		
keyboard.close();
}
}

