package Interpreter_Pattern;


import java.util.ArrayList;
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
public interface Expression {
     
   publicvoid interprete(Stack<Integer> s);

    public static class publicvoid {

        public publicvoid() {
        }
    }

}

class ExpresionTerminal_Numero implements Expresion {
  
   private int numero;
   
   public ExpresionTerminal_Numero(int numero){ 
      this.numero = numero; 
   }

   public void interprete(Stack<Integer> s){ 
      s.push(numero);
   }

} 

class ExpresionTerminal_Mas implements Expresion {

   public void interprete(Stack<Integer> s){ 
      s.push( s.pop() + s.pop());
    } 

} 

class ExpresionTerminal_Menos implements Expresion {

   void interpret(Stack<Integer> s){
      int tmp = s.pop(); 
      s.push( s.pop() - tmp );
   }

    @Override
    public void interprete(Stack<Integer> contexto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 

class Parser {

   private ArrayList<Expresion> parseTree = new ArrayList<Expresion>();// Solo una ExpresiónNoTerminal 
   
   Parser(String s) { 
      for (String token : s.split(" ")) { 
         if (token.equals("+")) 
            parseTree.add( new ExpresionTerminal_Mas() ); 
         else if (token.equals("-")) 
            parseTree.add( new ExpresionTerminal_Menos() ); // ... 
         else parseTree.add( new ExpresionTerminal_Numero(Integer.valueOf(token))); 
      } 
   }

   public int evalua() {
      Stack<Integer> contexto = new Stack<Integer>();
      for(Expresion e : parseTree) e.interprete(contexto); 
      return contexto.pop(); 
   }

} 

class EjemploInterprete { 

   public static void main(String[] args) { 
      System.out.println("'42 2 1 - +' equals " + new Parser("42 2 1 - +").evalua());
   }

}

    

