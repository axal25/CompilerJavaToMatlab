function [] = IdealMainExample() 
    clearScreen();
    
    intVar = 1;
    doubleVar1 = 0.0001;
    doubleVar2 = 1.0001;
    charVar = 'a';
    stringVar = "a string";
    functionReturnedValue = functionName1( -22 );
    
    if( intVar == 1 && doubleVar1 == 0.0001 && doubleVar2 == 1.0001 && ( charVar == 'a' && strcmp(stringVar, "a string") == true ) && functionReturnedValue == true ) 
        aClass = IdealClassExample;
        validationFlag = true;
        
        aClass.setVarInt( 1 );
        if( aClass.getVarInt() ~= 1 )
            validationFlag = false;
            fprintf("aClass.setVarInt( 1 ) - FAILED\n");
        end
        
        aClass.setVarBool( true );
        if( aClass.getVarBool() ~= true )
            validationFlag = false;
            fprintf("aClass.setVarBool( true ) - FAILED\n");
        end
        
        if( validationFlag == true )
            fprintf("Everything's gone as planned.\n");
        else
            fprintf("Something's gone wrong with class. \n");
        end
    else
        if( intVar ~= 1 || doubleVar1 ~= 0.0001 || doubleVar2 ~= 1.0001 || charVar ~= 'a' || strcmp(stringVar, "a string") ~= true || functionReturnedValue ~= true )
            fprintf("Something's gone wrong.\n");
            if( intVar ~= 1 )
                fprintf("There's something wrong with intVar.");
            end
            if( doubleVar1 ~= 0.0001 )
                fprintf("There's something wrong with doubleVar1.");
            end
            if( doubleVar2 ~= 1.0001 )
                fprintf("There's something wrong with doubleVar2.");
            end
            if( charVar ~= 'a' )
                fprintf("There's something wrong with charVar.");
            end
            if( strcmp(stringVar, "a string") ~= true )
                fprintf("There's something wrong with stringVar.");
            end
            if( functionReturnedValue ~= true )
                fprintf("There's something wrong with functionReturnedValue.");
            end
        end
    end
end

function [ returnValue ] = functionName1( inputValue )
    returnValue = false;
    if( returnValue == false )
        aValue1 = 1*1.00005;
    else
        aValue2 = [1, 2, inputValue];
    end
   returnValue = true;
end

function [] = clearScreen()
    close all;
    clearvars;
    clc;
end