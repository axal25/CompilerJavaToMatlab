package drink;

public class AntlrDrinkListener extends DrinkBaseListener {
	 
    @Override
    public void enterDrink( DrinkParser.DrinkContext ctx) {
        System.out.println( "drink: "+ctx.getText() );
    }
    
    @Override
    public void enterDrinkSentence( DrinkParser.DrinkSentenceContext ctx) {
        System.out.println( "drink_sentence: "+ctx.getText() );
    }
 
}