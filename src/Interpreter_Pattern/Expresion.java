package Interpreter_Pattern;


import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rayner Navarro
 */
interface Expresion {

    public void interprete(Stack<Integer> contexto);
    
}
