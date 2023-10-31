package com.mycompany.app;
/**
 * Hello world!
 *
 */
public class App {
  

  public static String triangulo(int a, int b, int c) {
    if (a + b <= c || b + c <= a || c + a <= b) {
      return "error no es un triangulo";
    }
    if (a > 0 && b > 0 && c > 0){
      if (a == b && b != c && c != a){
      return "es un triangulo isoceles";
      }
      if(a != b && b != c && c != a){
      return "es un triangulo escaleno";
      }
      if (a == b && b == c && c == a){
        return "es un triangulo equilatero";
      }
      if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)){
        return "es un triangulo pitagorico";
      }
    }
    return "error no es un triangulo";
  } 
  

  public static void main(String[] args) {
    System.out.println("Hola Gente!");
  }
}
