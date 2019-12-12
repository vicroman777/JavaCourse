package vr222ed_assign1;

import java.util.Scanner;

public class Numbers {

	  private static void swap(int[] array, int i, int j) {
	    int temp = array[i];
	    array[i] = array[j];
	    array[j] = temp;
	  }
	  
	  public static void insertionSort(int[] array) {
		  for(int i = 1; i < array.length; ++i){
				int index = i;
				for (int z = i - 1; z >= 0; z--) {
					if (array[z] > array[index]) {
						swap(array, index, z);
						index--;
					} else {
						z = -1;
					}
				}
			}
		}

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[3];
		for(int j=0; j<3; j++)
		{
			System.out.printf("Number %d: ", j+1);
		array[j] = s.nextInt();
		}
		insertionSort(array);
		for (int i = 0; i<3; i++) {
			System.out.print(array[i] + " ");
		}
		s.close();
	}
}
