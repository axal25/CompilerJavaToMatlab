import java.nio.charset.Charset;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class ParserDemo {

	public static void main(String[] args) {
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
	
	public void method1( int param1, String param2 ) {
		int i = 1;
		float uli = 2;
		Long l1 = Long.parseLong("-12312121231231231231231312312");
		Long l2 = Long.parseUnsignedLong("1231412412341231231231231231231312312");
		Long l3 = Long.parseUnsignedLong("0.1231412412341231231231231231231312312");
		long li1 = -1231412412341235672L;
		long li2 = 1231412412341235672L;
		int [] var_int_tab = { 0, 1 };
		char [] var_char_tab = new char [3];
	}
	
}
