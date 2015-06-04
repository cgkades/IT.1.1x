
package com.javaclass.week3;


public class PreyPred {

    /* You should submit the following */
    /****************** From Here ****************************/
    //Here goes your javadoc comments
	/**
	 * @author Brett Yoakum
	 * @param preyPred {@link double} represents [0] Hare and [1] Lynx populations
	 * @param a {@link double} represents a1 and a2 in the Prey Predation formula
	 * @param b {@link double} represents b1 and b2 in the Prey Predation formula
	 * @param n {@link int} is the amount of periods
	 * @return Returns a {@link double} of the final outcome where [0] Hare and [1] Lynx populations
	 */
	/*
	 * Formula
	 * H[n+1] =  H[n] * (1 + a1 - a2*L[n]) 
	 * L[n+1] =  L[n] * (1 - b1 +b2*H[n])
	 * 
	 * H = preyPred[0]
	 * L = preyPred[1]
	 */
	
    static double[] preyPredLV(double [] preyPred, double[] a, double[] b, int n){

    	//create placeholder variables since both equations depend on the original value
    	double hare = 0;
    	double lynx = 0;
    	//creating the for loop starting at zero until we get to n periods
    	for(int i=0; i<n; i++){
    		//store each equation into placeholder var
    		hare = preyPred[0] * ( 1 + a[0] - a[1] * preyPred[1]);
    		lynx = preyPred[1] * ( 1 - b[0] + b[1] * preyPred[0]);
    		
    		//replace original with new value (n+1)
    		preyPred[0] = hare;
    		preyPred[1] = lynx;
    	}
    	//return our double and eat cake.
    	return preyPred;
    }
    //***************** Until Here ****************************

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double preyPred[] = new double[2];
		double a[] = new double[2];
		double b[] = new double[2];
		int n;

		a[0] = 0.1;
		a[1] = 0.01;
		b[0] = 0.01;
		b[1] = 0.00002;

		n = 1;
		preyPred[0] = 300;
		preyPred[1] = 20;

		preyPred = preyPredLV(preyPred, a, b, n);
		System.out.println("After "+n+" generations: "
				   +"Snowhares: "+preyPred[0]
				   +" Lynx: "+preyPred[1]);

		n = 2;
		preyPred[0] = 300;
		preyPred[1] = 20;

		preyPred = preyPredLV(preyPred, a, b, n);
		System.out.println("After "+n+" generations: "
				   +"Snowhares: "+preyPred[0]
				   +" Lynx: "+preyPred[1]);
		
		n = 20;
		preyPred[0] = 300;
		preyPred[1] = 20;

		preyPred = preyPredLV(preyPred, a, b, n);
		System.out.println("After "+n+" generations: "
				   +"Snowhares: "+preyPred[0]
				   +" Lynx: "+preyPred[1]);

	}

}
