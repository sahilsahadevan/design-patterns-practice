package com.example.sahil.design_patterns.behavioural.interpreter;

import java.util.List;

interface Expression {
    List<String> interpret(Context ctx);
}