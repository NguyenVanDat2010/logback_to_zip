
package com.example.logback.logclass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApplicationStarter {

	private static final Logger	LOGGER	= LoggerFactory.getLogger( "timeBased" );

	public static void main( final String[] args ) {

		for ( int i = 1; i <= 24; i++ ) {
			LOGGER.info( "write log" );

			try {
				Thread.sleep( 10000L );
			} catch ( final InterruptedException e ) {
				LOGGER.error( "an error occurred", e );
			}
		}
	}
}
