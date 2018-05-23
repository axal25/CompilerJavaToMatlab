import java.nio.charset.Charset;

public class Tests {
	
public void staticInputTesting() {
		System.out.println("--------------------------------- staticInputTesting ---------------------------------");

		
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
		System.out.println("--------------------------------- Granica Postepu ---------------------------------");
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
	
	public void fileTesting() throws Exception 
	{
		Attacher attacher = new Attacher();
		
		System.out.println("--------------------------------- File testing ---------------------------------");
		
		System.out.println("\t--------------------------- test.txt ---------------------------");
		System.out.println("\t\t-------------- File doesn't exist ---------------");
		String content = new FileOperations().readFile("test.txt", Charset.defaultCharset() );
		System.out.println( content );
		
		System.out.println("\t--------------------------- goalTest.txt ---------------------------");
		System.out.println("\t\t-------------- Goal example ---------------");
		String goalContent = new FileOperations().readFile("goalTest.txt", Charset.defaultCharset() );
		System.out.println( goalContent );
		//process content
		
		System.out.println("\t--------------------------- test1.txt ---------------------------");
		System.out.println("\t\t-------------- 1st mile stone ---------------");
		String content1 = new FileOperations().readFile("test1.txt", Charset.defaultCharset() );
		System.out.println( content1 );
		attacher.pubPrintJavaGrammar( content1 );
		
		System.out.println("\t--------------------------- test2.txt ---------------------------");
		System.out.println("\t\t-------------- 2nd mile stone ---------------");
		String content2 = new FileOperations().readFile("test2.txt", Charset.defaultCharset() );
		System.out.println( content2 );
		attacher.pubPrintJavaGrammar( content2 );
		
		System.out.println("\t--------------------------- test3.txt ---------------------------");
		System.out.println("\t\t-------------- 3rd mile stone ---------------");
		String content3 = new FileOperations().readFile("test3.txt", Charset.defaultCharset() );
		System.out.println( content3 );
		attacher.pubPrintJavaGrammar( content3 );
	}

}
