package com.example.mobiledev17

var TT_INT="INT"
var TT_FlOAT="FlOAT"
var TT_PLUS="PLUS"
var TT_MINUS="MINUS"
var TT_MUL="MUL"
var TT_LPAREN="LPAREN"
var TT_RPAREN="RPAREN"


class Token(
    var type_:String ,
    var value_:String
) {
var type:String=type_
var value:String=value_



    fun repr():Token
    {
        return this
    }


}