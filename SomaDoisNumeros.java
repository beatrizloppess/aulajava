import java.util.Scanner;
//pacote padrão: java.lang: importado automaticamente 
public class SomaDoisNumeros{
  public static void main(String [] args){
  //declaraçao de variavel 
  Scanner leitor = new Scanner(System.in);
  double PrimeiroOperando;
  double SegundoOperando;
  double resultado;

    //entrada
     System.out.println("Digite o primeiro operando");
     PrimeiroOperando = leitor.nextDouble();
     System.out.println("Digite o segundo operando");
    SegundoOperando = leitor.nextDouble();
    //precessamento
resultado = PrimeiroOperando + SegundoOperando;
    //saida
    System.out.print(resultado);

  }
 }