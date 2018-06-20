import java.nio.charset.Charset;

public class Tests {
	
public void staticInputTesting() {
		System.out.println("--------------------------------- staticInputTesting ---------------------------------");

		
		Attacher attacher = new Attacher();
		
		attacher.pubPrintDrink("the pint of beer");
		
		System.out.println();
		
		attacher.pubPrintMethodDeclaration("void method1();");
		attacher.pubPrintMethodDeclaration("void method1(){}");
		attacher.pubPrintMethodDeclaration("int method1() {}");
		attacher.pubPrintMethodDeclaration("void method1( int param1 ) {}");
		attacher.pubPrintMethodDeclaration("float method1( int param1, String param2 ){}");
		attacher.pubPrintMethodDeclaration("void method1( int param1, String param2 ){}");
		attacher.pubPrintMethodDeclaration("private final String method1( int param1, String param2 ){}");
		attacher.pubPrintMethodDeclaration("public static int[] main1( int param1, String[] param2 ){}");
		System.out.println("--------------------------------- Granica Postepu ---------------------------------");
		attacher.pubPrintMethodDeclaration("public static void main( int arg0, String[] args ) {"
				+ "int i;"
				+ "String s;"
				+ "}");
		attacher.pubPrintMethodDeclaration("public static void main( int arg0, String[] args ) {"
				+ "int[] it;"
				+ "}");
		attacher.pubPrintMethodDeclaration("public static void main( int arg0, String[] args ) {"
				+ "long li;"
				+ "Long lif;"
				+ "}");
		
		System.out.println("--------------------------------- Granica Postepu ---------------------------------");
		
		attacher.pubPrintMethodDeclaration("public static void main( int arg0, String[] args ) {"
				+ "int i = 3;"
				+ "String s = \"a string\";"
				+ "}");
		
		attacher.pubPrintMethodDeclaration("public static void main( int arg0, String[] args ) {"
				+ "int[] it = new int [3];"
				+ "}");
		
		attacher.pubPrintMethodDeclaration("public static void main( int arg0, String[] args ) {"
				+ "int[] it = { 0, 1 };"
				+ "}");
		
		attacher.pubPrintMethodDeclaration("public static void main( int arg0, String[] args ) {"
				+ "long li = -1231412412341235672L;"
				+ "Long lif = Long.parseUnsignedLong(\"0.1231412412341231231231231231231312312\");"
				+ "}");
	}
	
	public void fileTesting() throws Exception 
	{
		Attacher attacher = new Attacher();
		
		System.out.println("--------------------------------- File testing ---------------------------------");
		
		System.out.println("\n\t--------------------------- test.txt ---------------------------");
		System.out.println("\t\t-------------- File doesn't exist ---------------");
		String content = new FileOperations().readFile("test.txt", Charset.defaultCharset() );
		System.out.println( content );
		Thread.sleep(100);
		
		System.out.println("\n\t--------------------------- goalTest.txt ---------------------------");
		System.out.println("\t\t-------------- Goal example ---------------");
		String goalContent = new FileOperations().readFile("goalTest.txt", Charset.defaultCharset() );
		System.out.println( goalContent );
		attacher.pubPrintJavaGrammar( goalContent );
		Thread.sleep(100);
		
		System.out.println("\n\t--------------------------- test1.txt ---------------------------");
		System.out.println("\t\t-------------- 1st mile stone ---------------");
		String content1 = new FileOperations().readFile("test1.txt", Charset.defaultCharset() );
		System.out.println( content1 );
		attacher.pubPrintMethodDeclaration( content1 );
		Thread.sleep(100);
		
		System.out.println("\n\t--------------------------- test2.txt ---------------------------");
		System.out.println("\t\t-------------- 2nd mile stone ---------------");
		String content2 = new FileOperations().readFile("test2.txt", Charset.defaultCharset() );
		System.out.println( content2 );
		attacher.pubPrintMethodDeclaration( content2 );
		Thread.sleep(100);
		
		System.out.println("\n\t--------------------------- test3.txt ---------------------------");
		System.out.println("\t\t-------------- 3rd mile stone ---------------");
		String content3 = new FileOperations().readFile("test3.txt", Charset.defaultCharset() );
		System.out.println( content3 );
		attacher.pubPrintMethodDeclaration( content3 );
		Thread.sleep(100);
		
		System.out.println("\n\t--------------------------- test4.txt ---------------------------");
		System.out.println("\t\t-------------- 4th mile stone ---------------");
		String content4 = new FileOperations().readFile("test4.txt", Charset.defaultCharset() );
		System.out.println( content4 );
		attacher.pubPrintMethodDeclaration( content4 );
		Thread.sleep(100);
		
		System.out.println("\n\t--------------------------- full_program_test_life.txt ---------------------------");
		System.out.println("\t\t-------------- Goal example ---------------");
		String lifeContent = new FileOperations().readFile("full_program_test_life.txt", Charset.defaultCharset() );
		System.out.println( lifeContent );
		attacher.pubPrintJavaGrammar( lifeContent );
		Thread.sleep(100);
		
		System.out.println("\n\t--------------------------- full_program_test_arrays.txt ---------------------------");
		System.out.println("\t\t-------------- Goal example ---------------");
		String arraysContent = new FileOperations().readFile("full_program_test_arrays.txt", Charset.defaultCharset() );
		System.out.println( arraysContent );
		attacher.pubPrintJavaGrammar( arraysContent );
		Thread.sleep(100);
		
		
		System.out.println("\n\t--------------------------- test_variableListener.txt ---------------------------");
		System.out.println("\t\t-------------- Goal example ---------------");
		String vListenerContent = new FileOperations().readFile("test_variableListener.txt", Charset.defaultCharset() );
		System.out.println( vListenerContent );
		attacher.pubPrintJavaGrammar( vListenerContent );
		Thread.sleep(100);
		attacher.pubPrintIdentifiers( vListenerContent );
		Thread.sleep(100);
		
		
	}

}
