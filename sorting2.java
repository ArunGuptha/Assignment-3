package assin4sorting;

class sorting2 implements Runnable {
	private int arr[] = { 64, 32, 98, 12, 2, 78, 11, 35, 47, 8, 6, 13, 46, 12, 24, 1, 84, 38, 43, 58, 17, 77 };
	@Override
	public void run() {
		System.out.println("Array Before Bubble Sort");
		for (int x = 0; x < arr.length; x++) {
			System.out.print(arr[x] + " ");
		}

		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("\n" + "Array After Bubble Sort");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		
		}
		
	}
	public int[] getArr() {
		return arr;
	}
	
	}
	
