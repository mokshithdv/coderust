class RemoveEven {

	public static int[] removeEven(int[] arr) {
		int count=0;
			for(int i=0;i<arr.length;i++){
				if((arr[i]%2)!=0){
					count++;
				}
			
				}
				int[] result = new int[count];
				int k=0;
				for (int j=0;j<arr.length;j++){
					
					if((arr[j]%2)!=0){
						result[k]=arr[j];
						k++;
					}
					
				}
				return result;
			}
		// Write - Your - Code- Here
		 // change this and return the correct result array
	}
  //time complexity O(n)
