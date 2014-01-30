package de.wagentim.utils.connect;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.util.Args;

/**
 * Extract Required Informations from the given <code>HttpResponse</code>
 * 
 * @author bihu8398
 *
 */
public class ResponseExtractor 
{
	public static Header[] getAllHeaders(final HttpResponse response)
	{
		return null == response ? null : response.getAllHeaders();
	}
	
	public static String getHeaderParameterValue(final String name, final HttpResponse response)
	{
		if( null == name || null == response )
		{
			return null;
		}
		
		for( Header hd : getAllHeaders(response) )
		{
			if( hd.getName().equals(name) )
			{
				return hd.getValue();
			}
		}
		
		return null;
	}
	
}
