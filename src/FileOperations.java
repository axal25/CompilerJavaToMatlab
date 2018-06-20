import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import exceptions.NoSuchFileException;
import exceptions.UnforseenException;

public class FileOperations {
	
	public void scanFile(String inFileName, String outFileName) throws Exception 
	{
		try 
		{
			//if( Files.isReadable(inFileName)==false ) throws new IOException();
			BufferedReader buffer = new BufferedReader( new InputStreamReader( new FileInputStream(inFileName), Charset.forName("UTF-8") ) );

			if( Files.notExists(Paths.get(outFileName), LinkOption.NOFOLLOW_LINKS) ) 
			{
				Files.createFile(Paths.get(outFileName));
			}
			Files.write(Paths.get(outFileName), "".getBytes()); //nadpisuje plik - to samo co:
			//Files.write(Paths.get(outFileName), "".getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING );
			
			int c = 0;
        	while( (c = buffer.read()) != -1 )
	        {
        		
	        }
        	if( c==-1 )
        	{
        		c = (char) 0;
        	}
		}
		catch( IOException e ) 
		{
			e.getMessage();
			System.out.println(e.getMessage());
		}
	}
	
	public String readFile( String path, Charset encoding ) throws NoSuchFileException, IOException, UnforseenException
	{
		String fileContentString = null;
		try 
		{
			fileContentString = thisPrivReadFile(path, encoding);
		}
		catch( NoSuchFileException e )
		{
			fileContentString = e.getMessage();
		}
		catch( IOException e )
		{
			System.out.println("\tIO EXCEPTION!");
			throw e;
		}
		finally
		{
			if( fileContentString == null ) 
			{
				throw new UnforseenException("Exception in FileOperations.readFile()");
			}
		}
		
		return fileContentString;
	}
	
	private String thisPrivReadFile(String path, Charset encoding) throws NoSuchFileException, IOException 
	{
		byte[] encoded = null;
		String decoded = null;
		
		if( Files.exists(Paths.get(path)) ) 
		{
			encoded = Files.readAllBytes( Paths.get(path) );
			decoded = new String( encoded, encoding );
			return decoded; 
		}
		else
		{
			throw new NoSuchFileException(path);
		}
	}

}
