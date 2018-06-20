classdef IdealClassExample
    properties
        fieldVarInt;
        fieldVarBool;
    end
    methods
        function [returnValue] = setVarInt( obj, inputInt )
            obj.fieldVarInt = inputInt;
            returnValue = obj.fieldVarInt;
        end
        function [returnValue] = setVarBool( obj, inputBool )
            obj.fieldVarBool = inputBool;
            returnValue = obj.fieldVarBool;
        end
        function [returnValue] = getVarInt( obj )
            returnValue = obj.fieldVarInt;
        end
        function [returnValue] = getVarBool( obj )
            returnValue = obj.fieldVarBool;
        end
    end
end

% public class IdealClassExample {
% 	int fieldVarInt;
%     boolean fieldVarBool;
%     
%     int setVarInt(int inputInt) {
%     	this.fieldVarInt = inputInt;
%     	return this.fieldVarInt;
%     }
%     
%     boolean setVarBool(boolean inputBool) {
%     	this.fieldVarBool = inputBool;
%     	return this.fieldVarBool;
%     }
%     
%     int getVarInt() {
%     	return this.fieldVarInt;
%     }
%     
%     boolean getVarBool() {
%     	return this.fieldVarBool;
%     }
% }