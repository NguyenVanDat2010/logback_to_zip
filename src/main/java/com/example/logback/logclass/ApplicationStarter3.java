
package com.example.logback.logclass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApplicationStarter3 {

	private static final Logger	LOGGER	= LoggerFactory.getLogger( "sizeAndTimeBased" );

	public static void main( final String[] args ) {

		for ( int i = 1; i <= 40; i++ ) {
			LOGGER.info( "write log with SizeAndTimeBasedFNATP" );

			try {
				Thread.sleep( 1000L );
			} catch ( final InterruptedException e ) {
				LOGGER.error( "an error occurred", e );
			}
		}
	}
}
