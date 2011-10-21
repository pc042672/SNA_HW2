package sna_hw2_b;

import java.io.IOException;

import sna_hw2_a.ICModel;

public class AttackTestMain {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ICModelWithAttack icmodel=new ICModelWithAttack();
		icmodel.start("ca-GrQc.txt","GrQc_reveal.txt");
		
	}

}
