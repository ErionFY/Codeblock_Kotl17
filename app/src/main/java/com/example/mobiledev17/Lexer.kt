package com.example.mobiledev17

class Lexer (
    var text_:String
        ){
    var text:String=text_
    var pos:Int=-11
    var current_char:Char=0.toChar()

    fun advance()
    {
        this.pos+=1
        this.current_char=this.text[pos]
    }
    fun make_tokens()
    {
        var tokens= mutableListOf<>()

        while(this.current_char!=0.toChar())
        {
    if (this.current_char==" " || this.current_char=="\t")
        this.advance()

        }

        return tokens
    }


}