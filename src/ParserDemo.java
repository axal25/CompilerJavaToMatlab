import java.nio.charset.Charset;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class ParserDemo {

	public static void main(String[] args) {
		System.out.println("---------------------------------- LatestTestMethod ----------------------------------");
		String[] st = {"0", "1"};
		latestTestMethod( 1, st);
		
		// TODO Auto-generated method stub
		Tests tests = new Tests();
		tests.staticInputTesting();
		
		try {
			tests.fileTesting();
		}
		catch( Exception e ) {
			System.out.println("Exception cought in ParserDemo pd.fileTesting(): \n" + e.toString() );
		}
	}
	
	public static void latestTestMethod( int param1, String[] param2 ) {
		int i = 1;
		float uli = 2;
		Long l1 = Long.parseUnsignedLong("1231212123123123123");
		Long l2 = Long.parseLong("-1231412412341231231");
		long li1 = -1231412412341235672L;
		long li2 = 1231412412341235672L;
		int [] var_int_tab = { 0, 1 };
		char [] var_char_tab = new char [3];
		
		String s = null;
		for( int ind = 0; i<=10; i++ ) {
			if( ind != 9 ) {
				if( s != null ) {
					s = s + ind + ", ";
				}
				else {
					s = ind + ", ";
				}
			} else {
				s = s + ind + ";";
			}
		}
		System.out.println(s);
	}
	
}
