import java.io.IOException;
import java.util.Objects;

public class IdealMainExample {
	
	public static void main(String[] args) {
		clearScreen();
		int intVar = 1;
		double doubleVar1 = 0.0001;
		double doubleVar2 = 1.0001;
		char charVar = 'a';
		String stringVar = "a string";
		boolean functionReturnedValue = functionName1( -22 );

		if( intVar == 1 && doubleVar1 == 0.0001 && doubleVar2 == 1.0001 && ( charVar == 'a' && Objects.equals(stringVar, "a string") == true ) && functionReturnedValue == true ) 
		{ 	        
			IdealClassExample aClass = new IdealClassExample();
	        boolean validationFlag = true;
	        
	        aClass.setVarInt( 1 );
	        if( aClass.getVarInt() != 1 ) {
	            validationFlag = false;
	            System.out.println("aClass.setVarInt( 1 ) - FAILED\n");
	        }	        
	        
	        aClass.setVarBool( true );
	        if( aClass.getVarBool() != true ) {
	            validationFlag = false;
	            System.out.println("aClass.setVarBool( true ) - FAILED\n");
	        }
	        
	        if( validationFlag == true ) {
	            System.out.println("Everything's gone as planned.\n");
	        } else {
	            System.out.println("Something's gone wrong with class. \n");
	        }
		} 
		else 
		{
	        if( intVar != 1 || doubleVar1 != 0.0001 || doubleVar2 != 1.0001 || charVar != 'a' || Objects.equals(stringVar, "a string") != true || functionReturnedValue != true ) {
	            System.out.println("Something's gone wrong.\n");
	            if( intVar != 1 ) {
	                System.out.println("There's something wrong with intVar.");
	            }
	            if( doubleVar1 != 0.0001 ) {
	                System.out.println("There's something wrong with floatVar1.");
	            }
	            if( doubleVar2 != 1.0001 ) {
	                System.out.println("There's something wrong with floatVar2.");
	            }
	            if( charVar != 'a' ) {
	                System.out.println("There's something wrong with charVar.");
	            }
	            if( Objects.equals(stringVar, "a string") != true ) {
	                System.out.println("There's something wrong with stringVar.");
	            }
	            if( functionReturnedValue != true ) {
	                System.out.println("There's something wrong with functionReturnedValue.");
	            }
	        }
	    }
	}
	
	private static void clearScreen() {
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static boolean functionName1( int inputValue ) {
		boolean returnValue = false;
		if( returnValue == false ) {
			double aValue1 = 1*1.00005;
		} else {
			int[] aValue2 = {1, 2, inputValue}; 
		}
		returnValue = true;
		return returnValue;
		
	}
}
