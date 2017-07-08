package assignment4;

import assignment4.ArrayUtil.MergeSorter;

/**
 * This class contains utility methods for array manipulation.
 */
public class ArrayUtil
{
	/**
	 * Creates an array filled with random values.
	 * 
	 * @param length
	 *            the length of the array
	 * @param n
	 *            the number of possible random values
	 * @return an array filled with length numbers between 0 and n - 1
	 */
	public static int[] randomIntArray(int length, int n)
	{
		int[] a = new int[length];
		for (int i = 0; i < a.length; i++)
		{
			a[i] = (int) (Math.random() * n);
		}

		return a;
	}

	/**
	 * Swaps two entries of an array.
	 * 
	 * @param a
	 *            the array
	 * @param i
	 *            the first position to swap
	 * @param j
	 *            the second position to swap
	 */
	public static void swap(int[] a, int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	static class MergeSorter
	{
		static int count = 0;

		private static void merge(int[] first, int[] second, int[] a)
		{
			int iFirst = 0; // Next element to consider in the first array
			int iSecond = 0; // Next element to consider in the second array
			int j = 0; // Next open position in a
			// As long as neither iFirst nor iSecond is past the end, move
			// the smaller element into a
			while (iFirst < first.length && iSecond < second.length)
			{
				if (first[iFirst] < second[iSecond])
				{
					a[j] = first[iFirst];
					iFirst++;
				} else
				{
					a[j] = second[iSecond];
					iSecond++;
				}
				j++;
			}

			// Note that only one of the two loops below copies entries
			// Copy any remaining entries of the first array
			while (iFirst < first.length)
			{
				a[j] = first[iFirst];
				iFirst++;
				j++;
				count++;
			}
			// Copy any remaining entries of the second half
			while (iSecond < second.length)
			{
				a[j] = second[iSecond];
				iSecond++;
				j++;
				count++;
			}
		}
		
		public int getCount()
		{
			return count;
		}
		
		public static void resetCounter()
		{
			count = 0;
		}
	}
}

/**
 * This program demonstrates the merge sort algorithm by sorting an array that
 * is filled with random numbers.
 */
class MergeSortDemo
{
	public static void main(String[] args)
	{
		int[] a = ArrayUtil.randomIntArray(10000, 10000);
		MergeSorter.resetCounter();
		MergeSorter.sort(a);
		System.out.println("Array size: 10000; comparisons: " + MergeSorter.getCounter());
	}
}
