package com.peteroertel;

public class Factor {

	public long n;
	public Factor left;
	public Factor right;
	
	public Factor(long n) {
		this.n = n;
		
		for(long i = 2; i <= n/2; i++) {
			if(n%i==0) {
				this.left = new Factor(i);
				this.right = new Factor(n/i);
			}
		}
	}
	
	public void outputTree() {
		if(left != null) {
			left.outputTree();
		} if(right != null) {
			right.outputTree();
		} else {
			System.out.print(this.n + " ");
		}
	}

}