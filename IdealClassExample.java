
public class IdealClassExample {
	int fieldVarInt;
    boolean fieldVarBool;
    
    int setVarInt(int inputInt) {
    	this.fieldVarInt = inputInt;
    	return this.fieldVarInt;
    }
    
    boolean setVarBool(boolean inputBool) {
    	this.fieldVarBool = inputBool;
    	return this.fieldVarBool;
    }
    
    int getVarInt() {
    	return this.fieldVarInt;
    }
    
    boolean getVarBool() {
    	return this.fieldVarBool;
    }
}
