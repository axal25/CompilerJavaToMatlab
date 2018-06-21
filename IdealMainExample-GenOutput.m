void IdealMainExample ( [ ] args ) 
clearScreen ( ) ;
intVar = 1 ;
doubleVar1 = 0.0001 ;
doubleVar2 = 1.0001 ;
charVar = 'a' ;
stringVar = "a string" ;
functionReturnedValue = functionName1 ( - 22 ) ;
if ( intVar == 1 && doubleVar1 == 0.0001 && doubleVar2 == 1.0001 && ( charVar == 'a' && Objects . equals ( stringVar , "a string" ) == true ) && functionReturnedValue == true ) 
IdealClassExample aClass = new IdealClassExample ( ) ;
validationFlag = true ;
aClass . setVarInt ( 1 ) ;
if ( aClass . getVarInt ( ) ~= 1 ) 
validationFlag = false ;
System . out . println ( "aClass.setVarInt( 1 ) - FAILED\n" ) ;
end 
aClass . setVarBool ( true ) ;
if ( aClass . getVarBool ( ) ~= true ) 
validationFlag = false ;
System . out . println ( "aClass.setVarBool( true ) - FAILED\n" ) ;
end 
if ( validationFlag == true ) 
System . out . println ( "Everything's gone as planned.\n" ) ;
end 
else 
System . out . println ( "Something's gone wrong with class. \n" ) ;
end 
end 
else 
if ( intVar ~= 1 || doubleVar1 ~= 0.0001 || doubleVar2 ~= 1.0001 || charVar ~= 'a' || Objects . equals ( stringVar , "a string" ) ~= true || functionReturnedValue ~= true ) 
System . out . println ( "Something's gone wrong.\n" ) ;
if ( intVar ~= 1 ) 
System . out . println ( "There's something wrong with intVar." ) ;
end 
if ( doubleVar1 ~= 0.0001 ) 
System . out . println ( "There's something wrong with floatVar1." ) ;
end 
if ( doubleVar2 ~= 1.0001 ) 
System . out . println ( "There's something wrong with floatVar2." ) ;
end 
if ( charVar ~= 'a' ) 
System . out . println ( "There's something wrong with charVar." ) ;
end 
if ( Objects . equals ( stringVar , "a string" ) ~= true ) 
System . out . println ( "There's something wrong with stringVar." ) ;
end 
if ( functionReturnedValue ~= true ) 
System . out . println ( "There's something wrong with functionReturnedValue." ) ;
end 
end 
end 
end 
void clearScreen ( ) 
try 
new ProcessBuilder ( "cmd" , "/c" , "cls" ) . inheritIO ( ) . start ( ) . waitFor ( ) ;
end 
catch ( InterruptedException e ) 
e . printStackTrace ( ) ;
end 
catch ( IOException e ) 
e . printStackTrace ( ) ;
end 
end 
functionName1 ( inputValue ) 
returnValue = false ;
if ( returnValue == false ) 
aValue1 = 1 * 1.00005 ;
end 
else 
[ ] aValue2 = 
1 , 2 , inputValue end 
;
end 
returnValue = true ;
return returnValue ;
end 
