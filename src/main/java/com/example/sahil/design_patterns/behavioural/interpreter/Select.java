package com.example.sahil.design_patterns.behavioural.interpreter;

import java.util.List;

class Select implements Expression {
 
    private String column;
    private From from;
 
    public Select(String column, From from){
        this.column = column;
        this.from = from;
    }
 
    @Override
    public List<String> interpret(Context ctx) {
        ctx.setColumn(column);
        return from.interpret(ctx); // non-terminal expression since this composite. You can see it passing interpretation
                                    // further to another expression along with the context.
    }
}