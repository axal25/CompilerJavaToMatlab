import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class ParserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Attacher attacher = new Attacher();
		
		attacher.pubPrintDrink("the pint of beer");
		
		System.out.println();
		
		attacher.pubPrintJavaGrammar("void method1();");
		attacher.pubPrintJavaGrammar("void method1(){}");
		attacher.pubPrintJavaGrammar("int method1() {}");
		attacher.pubPrintJavaGrammar("void method1( int param1 ) {}");
		attacher.pubPrintJavaGrammar("float method1( int param1, String param2 ){}");
		attacher.pubPrintJavaGrammar("void method1( int param1, String param2 ){}");
		attacher.pubPrintJavaGrammar("private final String method1( int param1, String param2 ){}");
		attacher.pubPrintJavaGrammar("public static int[] main1( int param1, String[] param2 ){}");
		attacher.pubPrintJavaGrammar("public static void main( int arg0, String[] args ) {"
				+ "int i;"
				+ "String s;"
				+ "}");
		attacher.pubPrintJavaGrammar("public static void main( int arg0, String[] args ) {"
				+ "int[] it;"
				+ "}");
		attacher.pubPrintJavaGrammar("public static void main( int arg0, String[] args ) {"
				+ "long li;"
				+ "Long lif;"
				+ "}");
		
		System.out.println("--------------------------------- Granica Postepu ---------------------------------");
		
		attacher.pubPrintJavaGrammar("public static void main( int arg0, String[] args ) {"
				+ "int i = 3;"
				+ "String s = \"a string\";"
				+ "}");
		
		attacher.pubPrintJavaGrammar("public static void main( int arg0, String[] args ) {"
				+ "int[] it = new int [3];"
				+ "}");
		
		attacher.pubPrintJavaGrammar("public static void main( int arg0, String[] args ) {"
				+ "int[] it = { 0, 1 };"
				+ "}");
		
		attacher.pubPrintJavaGrammar("public static void main( int arg0, String[] args ) {"
				+ "long li = -1231412412341235672L;"
				+ "Long lif = Long.parseUnsignedLong(\"0.1231412412341231231231231231231312312\");"
				+ "}");

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
