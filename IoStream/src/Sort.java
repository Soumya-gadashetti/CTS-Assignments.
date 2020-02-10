class Sort{
	static int[] as(int[] a){
		int t;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					t=a[i];
					a[i]=a[j];
					a[j]=t;						
				}
			}
		}
	return a;
	}


	public static void main(String args[]){
		int[] r={3,6,1,5};
		int[] arrySor=as(r);
		for(int i=0;i<r.length;i++){
		System.out.println(arrySor[i]);
		}	
	}
}