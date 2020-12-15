package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
	//Renamed Interface to RhymersFactory.
	//Renamed methods.
	public interface RhymersFactory {

		public DefaultCountingOutRhymer getStandardRhymer();
		
		public DefaultCountingOutRhymer getFalseRhymer();
		
		public DefaultCountingOutRhymer getFIFORhymer();
		
		public DefaultCountingOutRhymer getHanoiRhymer();
		
	}
