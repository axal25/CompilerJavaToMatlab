import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import exceptions.AlreadyExistsFileException;
import exceptions.NoSuchFileException;
import exceptions.UnforseenException;
import javagrammar.InterpreterListener;

public class FileOperations {
	
	private String getFileNameWithoutExtention( String fileName ) {
		String fileNameWithoutExtention = null;
		
		int position = fileName.lastIndexOf(".");
		if (position > 0) {
			fileNameWithoutExtention = fileName.substring(0, position);
		}
		
		return fileNameWithoutExtention;
	}
	
	public void pubInterpretFile( String inputPath ) throws Exception {
		Path path = Paths.get( inputPath );
		if( Files.exists( path ) ) {
			String fileNameWithoutExtention = getFileNameWithoutExtention( path.getFileName().toString() );
			String outputPath = fileNameWithoutExtention + "-GenOutput.m";
			privIntepretFile( inputPath, outputPath );
		}
	}
	
	private void privIntepretFile( String inputPath, String outputPath ) throws Exception {
		try 
		{
			String inputFileContent = readFile( inputPath, Charset.defaultCharset() );
			Attacher attacher = new Attacher();
			attacher.pubPrintIdentifiers( inputFileContent );
			if( attacher.getOutputFileContent()!=null ) {
				String outputFileContent = attacher.getOutputFileContent();
				String outputFilePath = outputPath;
				writeFile( outputFileContent, outputFilePath, Charset.defaultCharset() );
			}
			else throw new UnforseenException("OutputFileContent is null!!!");
		} 
		catch (NoSuchFileException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		catch (UnforseenException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void writeFile( String outputFileContent, String outputFilePath, Charset encoding ) throws UnforseenException {
		try 
		{
			outputFileContent = thisPrivWriteFile( outputFileContent, outputFilePath, encoding );
			if( outputFileContent == null ) {
				throw new UnforseenException("Exception in FileOperations.writeFile()");
			}
		} 
		catch (AlreadyExistsFileException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	private String thisPrivWriteFile( String outputFileContent, String path, Charset encoding) throws AlreadyExistsFileException, IOException 
	{
		byte[] encoded = null;
		String decoded = null;
		
		if( !Files.exists(Paths.get(path)) ) 
		{
			decoded = outputFileContent;
			encoded = decoded.getBytes( encoding );
			Files.write( Paths.get(path), outputFileContent.getBytes());
			return decoded; 
		}
		else
		{
			throw new AlreadyExistsFileException(path);
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
